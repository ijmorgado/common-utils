package com.utils.window;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;

public class UWindowContainer extends UWindow
{  	protected Container container;

	/**
	 * Constructor of the class UWindowContainer, with this class you could instantiate a JFrame with a container ready 
	 * to create a complete GUI with SWING-based. All you need to do is extend your class of UWindowContainer and call
	 * to whatever superclass constructor.
	 */
	public UWindowContainer(){  
	   super(); addContainer();
	}
	public UWindowContainer(String pTitle){  
	   super(pTitle); addContainer();
	}
	public UWindowContainer(String pTitle,int pX,int pY){  
	   super(pTitle,pX,pY); addContainer();
	}
	public UWindowContainer(String pTitle,Point pP){  
	   super(pTitle,pP); addContainer();
	}
	public UWindowContainer(String pTitle,boolean pFullscreenmode){  
	   super(pTitle,pFullscreenmode); addContainer();
	}
	public UWindowContainer(String pTitle,Dimension pD){ 
	   super(pTitle,pD); addContainer();
	}
	public UWindowContainer(String pTitle,int pX,int pY,int pWidth,int pHeight){  
	   super(pTitle,pX,pY,pWidth,pHeight); addContainer();
	}
	public UWindowContainer(String pTitle,int pX,int pY,Dimension pD){  
	   super(pTitle,pX,pY,pD); addContainer();
	}
	public UWindowContainer(String pTitle,int pX,int pY,Dimension pD,boolean pMainWindow){  
	   super(pTitle,pX,pY,pD,pMainWindow); addContainer();
	}
	public UWindowContainer(String pTitle,Point pP,Dimension pD){  
	   super(pTitle,pP,pD); addContainer();
	}
	public UWindowContainer(String pTitle,Point pP,Dimension pD,boolean pMainWindow){  
	   super(pTitle,pP,pD,pMainWindow); addContainer();
	}
	public UWindowContainer(String pTitle,int pX,int pY,int pWidth,int pHeight,boolean pMainWindow){  
	   super(pTitle,pX,pY,pWidth,pHeight,pMainWindow); addContainer();
	}
	private void addContainer(){  
	   container=this.getContentPane();
	   container.setLayout(null);
	}
	public void add(Component c,int pX,int pY,int pWidth,int pHeight){  
	   container.add(c); c.setBounds(pX,pY,pWidth,pHeight);       
	}
}