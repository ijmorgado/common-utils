package com.utils._3d;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Toolkit;

public class CFigura3DPalabra 
{  private Dimension          D=Toolkit.getDefaultToolkit().getScreenSize();
   private CFigura3DLetra[]   aL;
   private String             texto;
      
   public CFigura3DPalabra(String pTexto,int x,int y,int z)
   {  this(null,pTexto,x,y,z);   
   }
   public CFigura3DPalabra(String pArchivo,String pTexto,int x,int y,int z)
   {  texto=pTexto; 
      aL=new CFigura3DLetra[texto.length()]; 
      for(int i=0;i<aL.length;i++)aL[i]=new CFigura3DLetra(D,x+=250,y,z,pArchivo,""+texto.charAt(i));   
   }
   public void actualizaRotacion(int rx,int ry) 
   {  for(int i=0;i<aL.length;i++)aL[i].actualizaRotacion(ry,rx);   
   }
   public void dibujar(Graphics2D g,int rx,int ry)
   {  for(int i=0;i<aL.length;i++)aL[i].dibujar(g,rx,ry);
   }   
}
