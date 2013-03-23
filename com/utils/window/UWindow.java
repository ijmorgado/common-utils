package com.utils.window;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class UWindow extends JFrame
{  /**
	*A lightweight implementation of a JFrame class with default params.
	*
	*@author ijmorgado
	*
	*/
   public UWindow(){ 
	   this("Application");
   }
   public UWindow(String pTitle){  
	   this(pTitle,0,0);
   }
   public UWindow(String pTitle,int pX,int pY){ 
	   this(pTitle,pX,pY,800,600);
   }
   public UWindow(String pTitle,Point pP){  
	   this(pTitle,pP.x,pP.y,800,600);
   }
   public UWindow(String pTitle,boolean pFullscreenMode){  
	   this(pTitle,pFullscreenMode?Toolkit.getDefaultToolkit().getScreenSize():new Dimension(800,600));
   }
   public UWindow(String pTitle,Dimension pD){  
	   this(pTitle,0,0,pD.width,pD.height);
   }
   public UWindow(String pTitle,int pX,int pY,int pWidth,int pHeight){  
	   this(pTitle,pX,pY,pWidth,pHeight,true);
   }
   public UWindow(String pTitle,int pX,int pY,Dimension pD){  
	   this(pTitle,pX,pY,pD.width,pD.height,true);
   }
   public UWindow(String pTitle,int pX,int pY,Dimension pD,boolean pMainWindow){  
	   this(pTitle,pX,pY,pD.width,pD.height,pMainWindow);
   }
   public UWindow(String pTitle,Point pP,Dimension pD){ 
	   this(pTitle,pP.x,pP.y,pD.width,pD.height,true);
   }
   public UWindow(String pTitle,Point pP,Dimension pD,boolean pMainWindow){  
	   this(pTitle,pP.x,pP.y,pD.width,pD.height,pMainWindow);
   }
   public UWindow(String pTitle,int pX,int pY,int pWidth,int pHeight,boolean pMainWindow){  
	   this.setTitle(pTitle);
	   this.setLocation(pX,pY);
	   this.setSize( pWidth, pHeight);
	   if(pMainWindow) 	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   else           	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }
}