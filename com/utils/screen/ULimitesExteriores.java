package com.utils.screen;
import java.awt.*;
import java.awt.image.*;

public class ULimitesExteriores
{  private Rectangle     posicion;
   private BufferedImage arriba,abajo,izquierda,derecha;
   private BufferedImage arribaOld,abajoOld,izquierdaOld,derechaOld;
   
   public ULimitesExteriores(Rectangle pPosicion)
   {  posicion=pPosicion;      
      getLimites(posicion);
   }
   public void getLimites(Rectangle pPosicion)
   {  posicion=pPosicion;      
      getLimitesOld(posicion);      
      getLimitesNew(posicion);
   }
   public void getLimitesOld(Rectangle pPosicion)
   {  posicion=pPosicion;      
      arribaOld   =new UCapturaPantalla(new Rectangle(posicion.x,posicion.y-10,posicion.width,10)).getImage();
      abajoOld    =new UCapturaPantalla(new Rectangle(posicion.x,posicion.y+posicion.height+10,posicion.width,10)).getImage();
      izquierdaOld=new UCapturaPantalla(new Rectangle(posicion.x-10,posicion.y,10,posicion.height)).getImage();
      derechaOld  =new UCapturaPantalla(new Rectangle(posicion.x+posicion.width+10,posicion.y,10,posicion.height)).getImage();      
   }
   public void getLimitesNew(Rectangle pPosicion)
   {  posicion    =pPosicion;      
      arriba      =new UCapturaPantalla(new Rectangle(posicion.x,posicion.y-10,posicion.width,10)).getImage();
      abajo       =new UCapturaPantalla(new Rectangle(posicion.x,posicion.y+posicion.height+10,posicion.width,10)).getImage();
      izquierda   =new UCapturaPantalla(new Rectangle(posicion.x-10,posicion.y,10,posicion.height)).getImage();
      derecha     =new UCapturaPantalla(new Rectangle(posicion.x+posicion.width+10,posicion.y,10,posicion.height)).getImage();
   }
   public boolean getCambio()
   {  boolean cambio=false;
      for(int i=0;i<izquierda.getHeight();i++)
         for(int j=0;j<izquierda.getWidth();j++)
         {  if(izquierda.getRGB(j,i)!=izquierdaOld.getRGB(j,i) )
            {  i=izquierda.getHeight(); j=izquierda.getWidth(); 
               cambio=true;                       
            }
         }
      if(!cambio)
      {  for(int i=0;i<abajo.getHeight();i++)
            for(int j=0;j<abajo.getWidth();j++)
            {  if(abajo.getRGB(j,i)!=abajoOld.getRGB(j,i) )
               {  i=abajo.getHeight(); j=abajo.getWidth(); 
                  cambio=true;                       
               }
            }
      }   
      if(!cambio)
      {  for (int i=0; i<derecha.getHeight(); i++)
            for (int j=0; j<derecha.getWidth(); j++)
            {  if( derecha.getRGB(j,i) != derechaOld.getRGB(j,i) )
               {  i=derecha.getHeight(); j=derecha.getWidth(); 
                  cambio=true;                       
               }
            }
      }
      if(!cambio)
      {  for (int i=0; i<arriba.getHeight(); i++)
            for (int j=0; j<arriba.getWidth(); j++)
            {  if( arriba.getRGB(j,i) != arribaOld.getRGB(j,i) )
               {  i=arriba.getHeight(); j=arriba.getWidth(); 
                  cambio=true;                       
               }
            }
      }      
      return cambio;
   }
}