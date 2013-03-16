package com.utils.window.mouse;
import java.awt.Dimension;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class UVentanasMMW extends UVentanasMM implements MouseWheelListener
{  public UVentanasMMW()
   {  super(); addWheel();
   }
   public UVentanasMMW(String pTitulo)
   {  super(pTitulo); addWheel(); 
   }
   public UVentanasMMW(String pTitulo,int pX,int pY)
   {  super(pTitulo,pX,pY); addWheel();
   }
   public UVentanasMMW(String pTitulo,boolean pPantallaCompleta)
   {  super(pTitulo,pPantallaCompleta); addWheel();
   }
   public UVentanasMMW(String pTitulo,Dimension pD)
   {  super(pTitulo,pD); addWheel();
   }
   public UVentanasMMW(String pTitulo,int pX,int pY,int pAncho,int pLargo)
   {  super(pTitulo,pX,pY,pAncho,pLargo); addWheel();
   }
   public UVentanasMMW(String pTitulo,int pX,int pY,int pAncho,int pLargo,boolean pPrincipal)
   {  super(pTitulo,pX,pY,pAncho,pLargo,pPrincipal); addWheel();
   }
   private void addWheel(){this.addMouseWheelListener(this);}
   public void mouseWheelMoved(MouseWheelEvent e){}
}
