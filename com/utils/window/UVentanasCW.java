package com.utils.window;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class UVentanasCW extends UWindow implements WindowListener
{  public Container contenedor;

   public UVentanasCW()
   {  super(); addContenedor(); addWindowListener();
   }
   public UVentanasCW(String pTitulo)
   {  super(pTitulo); addContenedor(); addWindowListener();
   }
   public UVentanasCW(String pTitulo,int pX,int pY)
   {  super(pTitulo,pX,pY); addContenedor(); addWindowListener();
   }
   public UVentanasCW(String pTitulo,Point pP)
   {  super(pTitulo,pP); addContenedor(); addWindowListener();
   }
   public UVentanasCW(String pTitulo,boolean pPantallaCompleta)
   {  super(pTitulo,pPantallaCompleta); addContenedor(); addWindowListener();
   }
   public UVentanasCW(String pTitulo,Dimension pD)
   {  super(pTitulo,pD); addContenedor(); addWindowListener();
   }
   public UVentanasCW(String pTitulo,int pX,int pY,int pAncho,int pLargo)
   {  super(pTitulo,pX,pY,pAncho,pLargo); addContenedor();  addWindowListener();
   }
   public UVentanasCW(String pTitulo,int pX,int pY,Dimension pD)
   {  super(pTitulo,pX,pY,pD); addContenedor();  addWindowListener();
   }
   public UVentanasCW(String pTitulo,int pX,int pY,Dimension pD,boolean pPrincipal)
   {  super(pTitulo,pX,pY,pD,pPrincipal); addContenedor();  addWindowListener();
   }
   public UVentanasCW(String pTitulo,Point pP,Dimension pD)
   {  super(pTitulo,pP,pD); addContenedor();  addWindowListener();
   }
   public UVentanasCW(String pTitulo,Point pP,Dimension pD,boolean pPrincipal)
   {  super(pTitulo,pP,pD,pPrincipal); addContenedor();  addWindowListener();
   }
   public UVentanasCW(String pTitulo,boolean pPrincipal,int pX,int pY)
   {  super(pTitulo,pX,pY,800,600,pPrincipal);  addContenedor();  addWindowListener();
   }
   public UVentanasCW(String pTitulo,int pX,int pY,int pAncho,int pLargo,boolean pPrincipal)
   {  super(pTitulo,pX,pY,pAncho,pLargo,pPrincipal); addContenedor();  addWindowListener();
   }
   private void addContenedor()
   {  contenedor=this.getContentPane();
      contenedor.setLayout(null);
   }
   public void add(Component c,int pX,int pY,int pAncho,int pLargo)
   {  contenedor.add(c); c.setBounds(pX,pY,pAncho,pLargo);       
   }
   private void addWindowListener()             {  this.addWindowListener(this);  }
   public void windowActivated(WindowEvent e)   {}
   public void windowClosed(WindowEvent e)      {}
   public void windowClosing(WindowEvent e)     {}
   public void windowDeactivated(WindowEvent e) {}
   public void windowDeiconified(WindowEvent e) {}
   public void windowIconified(WindowEvent e)   {}
   public void windowOpened(WindowEvent e)      {}
}