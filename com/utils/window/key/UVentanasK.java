package com.utils.window.key;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import com.utils.animation.UVentanasCG;

public class UVentanasK extends UVentanasCG implements KeyListener
{  public UVentanasK()
   {  super(); addKey();
   }
   public UVentanasK(String pTitulo)
   {  super(pTitulo); addKey(); 
   }
   public UVentanasK(String pTitulo,int pX,int pY)
   {  super(pTitulo,pX,pY); addKey();
   }
   public UVentanasK(String pTitulo,boolean pPantallaCompleta)
   {  super(pTitulo,pPantallaCompleta); addKey();
   }
   public UVentanasK(String pTitulo,Dimension pD)
   {  super(pTitulo,pD); addKey();
   }
   public UVentanasK(String pTitulo,int pX,int pY,int pAncho,int pLargo)
   {  super(pTitulo,pX,pY,pAncho,pLargo); addKey();
   }
   public UVentanasK(String pTitulo,int pX,int pY,int pAncho,int pLargo,boolean pPrincipal)
   {  super(pTitulo,pX,pY,pAncho,pLargo,pPrincipal); addKey();
   }
   private void addKey(){this.addKeyListener(this);}
   public void keyPressed(KeyEvent e){}
   public void keyReleased(KeyEvent e){}
   public void keyTyped(KeyEvent e){}
}