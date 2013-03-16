package com.utils.animation;
import java.awt.*;

/******************************************
 ********** DOBLEBUFFERGRAFICO ************
 *****************************************/
public class UDobleBufferGrafico
{  private Container  C; 
   private Dimension  D; 
   private Graphics2D G; 
   private Graphics   g;
   private Image      I;
   
   public UDobleBufferGrafico(Container pC){ C=pC; }
   public Graphics2D crear(Graphics pg,Color pColor)
   {  G=crear(pg); Color c=G.getColor();
      G.setColor(pColor);
      G.fillRect(0,0,D.width,D.height); 
      G.setColor(c);
      return(G);
   }
   public Graphics2D crear(Graphics pG)
   {  g=pG;
      Dimension d=C.getSize(); 
      if(G==null || d.width!=D.width || d.height!=D.height)
      {  D=d; 
         I=C.createImage(D.width,D.height);
         if(G!=null)G.dispose();
         G=(Graphics2D)I.getGraphics();
         G.setFont(pG.getFont());
         G.setClip(0,0,C.getWidth(),C.getHeight());
      }      
      return(G);
   } 
   public void dibujar(){dibujar(0);}
   public void dibujar(int pTiempo){g.drawImage(I,0,0,C); if(pTiempo>0){UHilo.retardar(pTiempo); C.repaint();}}
   public Image getImagen(){return I;}
}