package com.utils.window.key;
import java.awt.Dimension;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class UVentanasKMMW extends UVentanasKMM implements MouseWheelListener
{  public UVentanasKMMW()
   {  super(); addWheel();
   }
   public UVentanasKMMW(String pTitulo)
   {  super(pTitulo); addWheel(); 
   }
   public UVentanasKMMW(String pTitulo,int pX,int pY)
   {  super(pTitulo,pX,pY); addWheel();
   }
   public UVentanasKMMW(String pTitulo,boolean pPantallaCompleta)
   {  super(pTitulo,pPantallaCompleta); addWheel();
   }
   public UVentanasKMMW(String pTitulo,Dimension pD)
   {  super(pTitulo,pD); addWheel();
   }
   public UVentanasKMMW(String pTitulo,int pX,int pY,int pAncho,int pLargo)
   {  super(pTitulo,pX,pY,pAncho,pLargo); addWheel();
   }
   public UVentanasKMMW(String pTitulo,int pX,int pY,int pAncho,int pLargo,boolean pPrincipal)
   {  super(pTitulo,pX,pY,pAncho,pLargo,pPrincipal); addWheel();
   }
   private void addWheel(){this.addMouseWheelListener(this);}
   public void mouseWheelMoved(MouseWheelEvent e){}
}
