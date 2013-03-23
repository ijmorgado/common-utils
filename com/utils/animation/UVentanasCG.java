package com.utils.animation;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Toolkit;
import com.utils.window.UWindow;

public class UVentanasCG extends UWindow
{  public  UDobleBufferGrafico dbg;
   private int                 tiempo; 
   private Color               color;
   public  Container           contenedor;

   public UVentanasCG()
   {  super("Aplicacion"); addContenedor();
   }
   public UVentanasCG(String pTitulo)
   {  super(pTitulo,0,0); addContenedor();
   }
   public UVentanasCG(String pTitulo,int pX,int pY)
   {  super(pTitulo,pX,pY,800,600); addContenedor();
   }
   public UVentanasCG(String pTitulo,Point pP)
   {  super(pTitulo,pP.x,pP.y,800,600); addContenedor();
   }
   public UVentanasCG(String pTitulo,boolean pPantallaCompleta)
   {  super(pTitulo,Toolkit.getDefaultToolkit().getScreenSize()); addContenedor();
   }
   public UVentanasCG(String pTitulo,Dimension pD)
   {  super(pTitulo,0,0,pD.width,pD.height); addContenedor();
   }
   public UVentanasCG(String pTitulo,int pX,int pY,int pAncho,int pLargo)
   {  super(pTitulo,pX,pY,pAncho,pLargo,true); addContenedor();
   }
   public UVentanasCG(String pTitulo,int pX,int pY,Dimension pD)
   {  super(pTitulo,pX,pY,pD.width,pD.height,true); addContenedor();
   }
   public UVentanasCG(String pTitulo,int pX,int pY,Dimension pD,boolean pPrincipal)
   {  super(pTitulo,pX,pY,pD.width,pD.height,pPrincipal); addContenedor();
   }
   public UVentanasCG(String pTitulo,Point pP,Dimension pD)
   {  super(pTitulo,pP.x,pP.y,pD.width,pD.height,true); addContenedor();
   }
   public UVentanasCG(String pTitulo,Point pP,Dimension pD,boolean pPrincipal)
   {  super(pTitulo,pP.x,pP.y,pD.width,pD.height,pPrincipal); addContenedor();
   }
   public UVentanasCG(String pTitulo,int pX,int pY,int pAncho,int pLargo,boolean pPrincipal)
   {  super(pTitulo,pX,pY,pAncho,pLargo,pPrincipal); addContenedor();
   }
   private void addContenedor()
   {  contenedor=this.getContentPane();
      contenedor.setLayout(null);
      dbg=new UDobleBufferGrafico(this);
   }
   public void add(Component c,int pX,int pY,int pAncho,int pLargo)
   {  contenedor.add(c); c.setBounds(pX,pY,pAncho,pLargo);       
   }
   public void setRepintar(Color pColor)
   {  setRepintar(pColor,0);
   }
   public void setRepintar(int pTiempo)
   {  setRepintar(null,pTiempo);
   }
   public void setRepintar(Color pColor,int pTiempo)
   {  color=pColor; tiempo=pTiempo;
   }
   public void paint(Graphics g){update(g);}
   public void update(Graphics g)
   {  Graphics2D g2d;
      if(color!=null)g2d=dbg.crear(g,color); else g2d=dbg.crear(g);
      dibujar(g2d);
      dbg.dibujar(tiempo);
   }
   public void dibujar(Graphics2D g){}
}