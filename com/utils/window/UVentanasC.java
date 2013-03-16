package com.utils.window;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;

public class UVentanasC extends UVentanas
{  protected Container contenedor;

   public UVentanasC()
   {  super(); addContenedor();
   }
   public UVentanasC(String pTitulo)
   {  super(pTitulo); addContenedor();
   }
   public UVentanasC(String pTitulo,int pX,int pY)
   {  super(pTitulo,pX,pY); addContenedor();
   }
   public UVentanasC(String pTitulo,Point pP)
   {  super(pTitulo,pP); addContenedor();
   }
   public UVentanasC(String pTitulo,boolean pPantallaCompleta)
   {  super(pTitulo,pPantallaCompleta); addContenedor();
   }
   public UVentanasC(String pTitulo,Dimension pD)
   {  super(pTitulo,pD); addContenedor();
   }
   public UVentanasC(String pTitulo,int pX,int pY,int pAncho,int pLargo)
   {  super(pTitulo,pX,pY,pAncho,pLargo); addContenedor();
   }
   public UVentanasC(String pTitulo,int pX,int pY,Dimension pD)
   {  super(pTitulo,pX,pY,pD); addContenedor();
   }
   public UVentanasC(String pTitulo,int pX,int pY,Dimension pD,boolean pPrincipal)
   {  super(pTitulo,pX,pY,pD,pPrincipal); addContenedor();
   }
   public UVentanasC(String pTitulo,Point pP,Dimension pD)
   {  super(pTitulo,pP,pD); addContenedor();
   }
   public UVentanasC(String pTitulo,Point pP,Dimension pD,boolean pPrincipal)
   {  super(pTitulo,pP,pD,pPrincipal); addContenedor();
   }
   public UVentanasC(String pTitulo,int pX,int pY,int pAncho,int pLargo,boolean pPrincipal)
   {  super(pTitulo,pX,pY,pAncho,pLargo,pPrincipal); addContenedor();
   }
   private void addContenedor()
   {  contenedor=this.getContentPane();
      contenedor.setLayout(null);
   }
   public void add(Component c,int pX,int pY,int pAncho,int pLargo)
   {  contenedor.add(c); c.setBounds(pX,pY,pAncho,pLargo);       
   }
}