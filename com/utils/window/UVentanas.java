package com.utils.window;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class UVentanas extends JFrame
{  public UVentanas()
   {  this("Aplicación");
   }
   public UVentanas(String pTitulo)
   {  this(pTitulo,0,0);
   }
   public UVentanas(String pTitulo,int pX,int pY)
   {  this(pTitulo,pX,pY,800,600);
   }
   public UVentanas(String pTitulo,Point pP)
   {  this(pTitulo,pP.x,pP.y,800,600);
   }
   public UVentanas(String pTitulo,boolean pPantallaCompleta)
   {  this(pTitulo,pPantallaCompleta?Toolkit.getDefaultToolkit().getScreenSize():new Dimension(800,600));
   }
   public UVentanas(String pTitulo,Dimension pD)
   {  this(pTitulo,0,0,pD.width,pD.height);
   }
   public UVentanas(String pTitulo,int pX,int pY,int pAncho,int pLargo)
   {  this(pTitulo,pX,pY,pAncho,pLargo,true);
   }
   public UVentanas(String pTitulo,int pX,int pY,Dimension pD)
   {  this(pTitulo,pX,pY,pD.width,pD.height,true);
   }
   public UVentanas(String pTitulo,int pX,int pY,Dimension pD,boolean pPrincipal)
   {  this(pTitulo,pX,pY,pD.width,pD.height,pPrincipal);
   }
   public UVentanas(String pTitulo,Point pP,Dimension pD)
   {  this(pTitulo,pP.x,pP.y,pD.width,pD.height,true);
   }
   public UVentanas(String pTitulo,Point pP,Dimension pD,boolean pPrincipal)
   {  this(pTitulo,pP.x,pP.y,pD.width,pD.height,pPrincipal);
   }
   public UVentanas(String pTitulo,int pX,int pY,int pAncho,int pLargo,boolean pPrincipal)
   {  this.setTitle(pTitulo);
      this.setLocation(pX,pY);
      this.setSize( pAncho, pLargo);
      if(pPrincipal) this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      else           this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }
}