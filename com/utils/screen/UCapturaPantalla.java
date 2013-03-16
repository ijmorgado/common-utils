package com.utils.screen;
import java.awt.*;
import java.awt.image.*;
import java.io.File;
import javax.imageio.ImageIO;
import com.utils.animation.URecorrido;

public class UCapturaPantalla
{  private Rectangle     r;
   private BufferedImage image; 
   private Robot         robot;
   private URecorrido    despX,despY;

   public UCapturaPantalla(Dimension d)
   {  this(new Rectangle(d));
   }
   public UCapturaPantalla(Rectangle pR)
   {  this(pR,false);      
   }
   public UCapturaPantalla(Rectangle pR,boolean bMovimiento)
   {  r=pR; Dimension D=Toolkit.getDefaultToolkit().getScreenSize(); 
      if(bMovimiento)
      {  despX=new URecorrido(D.width-r.width); despX.setValor(r.x); 
         despY=new URecorrido(D.height-r.height); despY.setValor(r.y);
      }
      else
      {  despX=new URecorrido(1); despX.setValor(0);
         despY=new URecorrido(1); despY.setValor(0);
      }
      try
      {  robot=new Robot();
         image=robot.createScreenCapture(r);
         image.flush();
      }catch(Exception e) { e.printStackTrace(); }
   }
   public void mover(Graphics g)
   {  despX.recorrer(); despY.recorrer(); dibujar(g);
   }
   public void dibujar(Graphics g)
   {  g.drawImage(image,despX.getValor(),despY.getValor(),r.width,r.height,null);
   }
   public BufferedImage getImage()
   {  return image;
   }
   public void salvar(String pDestino)
   {  try
      {  File file=new File(pDestino);
         ImageIO.write(image,"jpg",file);  
      }catch(Exception e){ }
   }
}