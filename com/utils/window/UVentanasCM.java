package com.utils.window;
import java.awt.*;
import java.awt.event.*;

public class UVentanasCM extends UVentanasC implements MouseListener
{  public Container contenedor;

   public UVentanasCM()
   {  super(); addContenedor();  addMouseListener();
   }
   public UVentanasCM(String pTitulo)
   {  super(pTitulo); addContenedor(); addMouseListener();
   }
   public UVentanasCM(String pTitulo,int pX,int pY)
   {  super(pTitulo,pX,pY); addContenedor(); addMouseListener();
   }
   public UVentanasCM(String pTitulo,Point pP)
   {  super(pTitulo,pP); addContenedor(); addMouseListener();
   }
   public UVentanasCM(String pTitulo,boolean pPantallaCompleta)
   {  super(pTitulo,pPantallaCompleta); addContenedor(); addMouseListener();
   }
   public UVentanasCM(String pTitulo,Dimension pD)
   {  super(pTitulo,pD); addContenedor(); addMouseListener();
   }
   public UVentanasCM(String pTitulo,int pX,int pY,int pAncho,int pLargo)
   {  super(pTitulo,pX,pY,pAncho,pLargo); addContenedor();  addMouseListener();
   }
   public UVentanasCM(String pTitulo,int pX,int pY,Dimension pD)
   {  super(pTitulo,pX,pY,pD); addContenedor(); addMouseListener();
   }
   public UVentanasCM(String pTitulo,int pX,int pY,Dimension pD,boolean pPrincipal)
   {  super(pTitulo,pX,pY,pD,pPrincipal); addContenedor();  addMouseListener();
   }
   public UVentanasCM(String pTitulo,Point pP,Dimension pD)
   {  super(pTitulo,pP,pD); addContenedor(); addMouseListener();
   }
   public UVentanasCM(String pTitulo,Point pP,Dimension pD,boolean pPrincipal)
   {  super(pTitulo,pP,pD,pPrincipal); addContenedor();  addMouseListener();
   }
   public UVentanasCM(String pTitulo,int pX,int pY,int pAncho,int pLargo,boolean pPrincipal)
   {  super(pTitulo,pX,pY,pAncho,pLargo,pPrincipal); addContenedor();  addMouseListener();
   }
   private void addContenedor()
   {  contenedor=this.getContentPane();
      contenedor.setLayout(null);
   }
   private void addMouseListener()
   {  this.addMouseListener(this);   
   }
   public void add(Component c,int pX,int pY,int pAncho,int pLargo)
   {  contenedor.add(c); c.setBounds(pX,pY,pAncho,pLargo);       
   }
   public void mouseClicked(MouseEvent e) {}
   public void mouseEntered(MouseEvent e) {}
   public void mouseExited(MouseEvent e)  {}
   public void mousePressed(MouseEvent e) {}
   public void mouseReleased(MouseEvent e){}
}