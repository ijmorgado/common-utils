package com.utils.window.mouse;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class UVentanasMM extends UVentanasM implements MouseMotionListener
{  public UVentanasMM()
   {  super(); addMotion();
   }
   public UVentanasMM(String pTitulo)
   {  super(pTitulo); addMotion(); 
   }
   public UVentanasMM(String pTitulo,int pX,int pY)
   {  super(pTitulo,pX,pY); addMotion();
   }
   public UVentanasMM(String pTitulo,boolean pPantallaCompleta)
   {  super(pTitulo,pPantallaCompleta); addMotion();
   }
   public UVentanasMM(String pTitulo,Dimension pD)
   {  super(pTitulo,pD); addMotion();
   }
   public UVentanasMM(String pTitulo,int pX,int pY,int pAncho,int pLargo)
   {  super(pTitulo,pX,pY,pAncho,pLargo); addMotion();
   }
   public UVentanasMM(String pTitulo,int pX,int pY,int pAncho,int pLargo,boolean pPrincipal)
   {  super(pTitulo,pX,pY,pAncho,pLargo,pPrincipal); addMotion();
   }
   private void addMotion(){this.addMouseMotionListener(this);}
   public void mouseDragged(MouseEvent e){}
   public void mouseMoved(MouseEvent e){}
}
