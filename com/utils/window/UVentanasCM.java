package com.utils.window;
import java.awt.*;
import java.awt.event.*;

public class UVentanasCM extends UWindowContainer implements MouseListener
{  public UVentanasCM()
   {  super();  addMouseListener();
   }
   public UVentanasCM(String pTitulo)
   {  super(pTitulo); addMouseListener();
   }
   public UVentanasCM(String pTitulo,int pX,int pY)
   {  super(pTitulo,pX,pY);  addMouseListener();
   }
   public UVentanasCM(String pTitulo,Point pP)
   {  super(pTitulo,pP);  addMouseListener();
   }
   public UVentanasCM(String pTitulo,boolean pPantallaCompleta)
   {  super(pTitulo,pPantallaCompleta);  addMouseListener();
   }
   public UVentanasCM(String pTitulo,Dimension pD)
   {  super(pTitulo,pD);  addMouseListener();
   }
   public UVentanasCM(String pTitulo,int pX,int pY,int pAncho,int pLargo)
   {  super(pTitulo,pX,pY,pAncho,pLargo);   addMouseListener();
   }
   public UVentanasCM(String pTitulo,int pX,int pY,Dimension pD)
   {  super(pTitulo,pX,pY,pD);  addMouseListener();
   }
   public UVentanasCM(String pTitulo,int pX,int pY,Dimension pD,boolean pPrincipal)
   {  super(pTitulo,pX,pY,pD,pPrincipal);   addMouseListener();
   }
   public UVentanasCM(String pTitulo,Point pP,Dimension pD)
   {  super(pTitulo,pP,pD);  addMouseListener();
   }
   public UVentanasCM(String pTitulo,Point pP,Dimension pD,boolean pPrincipal)
   {  super(pTitulo,pP,pD,pPrincipal);   addMouseListener();
   }
   public UVentanasCM(String pTitulo,int pX,int pY,int pAncho,int pLargo,boolean pPrincipal)
   {  super(pTitulo,pX,pY,pAncho,pLargo,pPrincipal);   addMouseListener();
   }
   private void addMouseListener()
   {  this.addMouseListener(this);   
   }
   public void add(Component c,int pX,int pY,int pAncho,int pLargo)
   {  container.add(c); c.setBounds(pX,pY,pAncho,pLargo);       
   }
   public void mouseClicked(MouseEvent e) {}
   public void mouseEntered(MouseEvent e) {}
   public void mouseExited(MouseEvent e)  {}
   public void mousePressed(MouseEvent e) {}
   public void mouseReleased(MouseEvent e){}
}