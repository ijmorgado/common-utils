package com.utils.window.key;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class UVentanasKM extends UVentanasK implements MouseListener
{  public UVentanasKM()
   {  super(); addMouse();
   }
   public UVentanasKM(String pTitulo)
   {  super(pTitulo); addMouse(); 
   }
   public UVentanasKM(String pTitulo,int pX,int pY)
   {  super(pTitulo,pX,pY); addMouse();
   }
   public UVentanasKM(String pTitulo,boolean pPantallaCompleta)
   {  super(pTitulo,pPantallaCompleta); addMouse();
   }
   public UVentanasKM(String pTitulo,Dimension pD)
   {  super(pTitulo,pD); addMouse();
   }
   public UVentanasKM(String pTitulo,int pX,int pY,int pAncho,int pLargo)
   {  super(pTitulo,pX,pY,pAncho,pLargo); addMouse();
   }
   public UVentanasKM(String pTitulo,int pX,int pY,int pAncho,int pLargo,boolean pPrincipal)
   {  super(pTitulo,pX,pY,pAncho,pLargo,pPrincipal); addMouse();
   }
   private void addMouse(){this.addMouseListener(this);}
   public void mouseClicked(MouseEvent e){}
   public void mouseEntered(MouseEvent e){}
   public void mouseExited(MouseEvent e){}
   public void mousePressed(MouseEvent e){}
   public void mouseReleased(MouseEvent e){}
}
