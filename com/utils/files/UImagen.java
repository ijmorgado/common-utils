package com.utils.files;
import java.awt.*;
import java.awt.image.*;
import java.io.*;

import javax.swing.ImageIcon;

/******************************************
 *************** IMAGEN *******************
 *****************************************/
public class UImagen
{  private Image[]      aI;
   private MediaTracker mt;
   private Container    contenedor;
   public UImagen(String pImagen,Container pContenedor)
   {  this(new String[]{pImagen},pContenedor);
   }
   public UImagen(String pImagen,Container pContenedor,String pJar)
   {  this(new String[]{pImagen},pContenedor,pJar);
   }
   public UImagen(String[] pImagen,Container pContenedor)
   {  this(pImagen,pContenedor,null);
   }  
   public UImagen(String[] pImagen,Container pContenedor,String pJar)
   {  aI=new Image[pImagen.length];
      contenedor=pContenedor;
      mt=new MediaTracker(contenedor);
      if(pJar!=null){File f=new File(pJar); if(!f.exists())pJar=null;}
      UJarExtractor je=null; if(pJar!=null) je=new UJarExtractor(pJar);
      try 
      {  for(int i=0;i<pImagen.length;i++)
         {  if(pJar!=null) aI[i]=Toolkit.getDefaultToolkit().createImage(je.getImageData(pImagen[i]));
            else           aI[i]=Toolkit.getDefaultToolkit().getImage(pImagen[i]);
            mt.addImage(aI[i],i);  
         }   
         mt.waitForAll();
      }
      catch (Exception e) {e.printStackTrace();}
   }
   public Image getImagen(){return(aI[0]);}
   public Image getImagen(int pImagen){return(aI[pImagen]);}
   public Image[] getImagen(boolean pTodas){pTodas=!pTodas; return(aI);}
   public Image getImagen(int pAncho,int pLargo){return(getBufferedImage(pAncho,pLargo));}
   public BufferedImage getBufferedImage()
   {  return getBufferedImage(aI[0]);    
   }
   public BufferedImage getBufferedImage(int pImagen)
   {  return getBufferedImage(aI[pImagen]);    
   }
   public BufferedImage getBufferedImage(int pAncho,int pLargo)
   {  return getBufferedImage(aI[0],pAncho,pLargo);    
   }
   private BufferedImage getBufferedImage(Image im)
   {  BufferedImage bi=new BufferedImage(1,1,BufferedImage.TYPE_INT_ARGB);
      if(im.getWidth(contenedor)>0 && im.getHeight(contenedor)>0)
      {  bi=new BufferedImage(im.getWidth(contenedor),im.getHeight(contenedor),BufferedImage.TYPE_INT_ARGB);
         Graphics bg=bi.getGraphics(); bg.drawImage(im,0,0,contenedor); bg.dispose();
      }
      return bi;
   }
   private BufferedImage getBufferedImage(Image im,int pAncho,int pLargo)
   {  BufferedImage bi=new BufferedImage(1,1,BufferedImage.TYPE_INT_ARGB);
      if(im.getWidth(contenedor)>0 && im.getHeight(contenedor)>0)
      {  bi=new BufferedImage(im.getWidth(contenedor),im.getHeight(contenedor),BufferedImage.TYPE_INT_ARGB);
         Graphics bg=bi.getGraphics(); bg.drawImage(im,0,0,pAncho,pLargo,contenedor); bg.dispose();
      }
      return bi;
   }
   public static ImageIcon optimizaIcono(ImageIcon pImagen,int pAncho,int pAlto)
   {  Image imagen=pImagen.getImage().getScaledInstance(pAncho,pAlto,Image.SCALE_FAST);  
      return new ImageIcon(imagen);
   }
}