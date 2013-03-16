package com.utils.window.key;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class UVentanasKMA extends UVentanasK implements MouseListener
{  public UVentanasKMA()
   {  super(); addMouse();
   }
   public UVentanasKMA(String pTitulo)
   {  super(pTitulo); addMouse(); 
   }
   public UVentanasKMA(String pTitulo,int pX,int pY)
   {  super(pTitulo,pX,pY); addMouse();
   }
   public UVentanasKMA(String pTitulo,boolean pPantallaCompleta)
   {  super(pTitulo,pPantallaCompleta); addMouse();
   }
   public UVentanasKMA(String pTitulo,Dimension pD)
   {  super(pTitulo,pD); addMouse();
   }
   public UVentanasKMA(String pTitulo,int pX,int pY,int pAncho,int pLargo)
   {  super(pTitulo,pX,pY,pAncho,pLargo); addMouse();
   }
   public UVentanasKMA(String pTitulo,int pX,int pY,int pAncho,int pLargo,boolean pPrincipal)
   {  super(pTitulo,pX,pY,pAncho,pLargo,pPrincipal); addMouse();
   }
   private void addMouse(){this.addMouseListener(this);}
   public void mouseClicked(MouseEvent e){}
   public void mouseEntered(MouseEvent e){}
   public void mouseExited(MouseEvent e){}
   public void mousePressed(MouseEvent e){}
   public void mouseReleased(MouseEvent e){}
}
