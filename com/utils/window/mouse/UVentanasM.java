package com.utils.window.mouse;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import com.utils.animation.UVentanasCG;

public class UVentanasM extends UVentanasCG implements MouseListener
{  public UVentanasM()
   {  super(); addMouse();
   }
   public UVentanasM(String pTitulo)
   {  super(pTitulo); addMouse(); 
   }
   public UVentanasM(String pTitulo,int pX,int pY)
   {  super(pTitulo,pX,pY); addMouse();
   }
   public UVentanasM(String pTitulo,boolean pPantallaCompleta)
   {  super(pTitulo,pPantallaCompleta); addMouse();
   }
   public UVentanasM(String pTitulo,Dimension pD)
   {  super(pTitulo,pD); addMouse();
   }
   public UVentanasM(String pTitulo,int pX,int pY,int pAncho,int pLargo)
   {  super(pTitulo,pX,pY,pAncho,pLargo); addMouse();
   }
   public UVentanasM(String pTitulo,int pX,int pY,int pAncho,int pLargo,boolean pPrincipal)
   {  super(pTitulo,pX,pY,pAncho,pLargo,pPrincipal); addMouse();
   }
   private void addMouse(){this.addMouseListener(this);}
   public void mouseClicked(MouseEvent e){}
   public void mouseEntered(MouseEvent e){}
   public void mouseExited(MouseEvent e){}
   public void mousePressed(MouseEvent e){}
   public void mouseReleased(MouseEvent e){}
}
