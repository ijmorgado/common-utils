package com.utils.window.key;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class UVentanasKMM extends UVentanasKM implements MouseMotionListener
{  public UVentanasKMM()
   {  super(); addMotion();
   }
   public UVentanasKMM(String pTitulo)
   {  super(pTitulo); addMotion(); 
   }
   public UVentanasKMM(String pTitulo,int pX,int pY)
   {  super(pTitulo,pX,pY); addMotion();
   }
   public UVentanasKMM(String pTitulo,boolean pPantallaCompleta)
   {  super(pTitulo,pPantallaCompleta); addMotion();
   }
   public UVentanasKMM(String pTitulo,Dimension pD)
   {  super(pTitulo,pD); addMotion();
   }
   public UVentanasKMM(String pTitulo,int pX,int pY,int pAncho,int pLargo)
   {  super(pTitulo,pX,pY,pAncho,pLargo); addMotion();
   }
   public UVentanasKMM(String pTitulo,int pX,int pY,int pAncho,int pLargo,boolean pPrincipal)
   {  super(pTitulo,pX,pY,pAncho,pLargo,pPrincipal); addMotion();
   }
   private void addMotion(){this.addMouseMotionListener(this);}
   public void mouseDragged(MouseEvent e){}
   public void mouseMoved(MouseEvent e){}
}
