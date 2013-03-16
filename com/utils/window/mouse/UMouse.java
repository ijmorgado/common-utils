package com.utils.window.mouse;
import java.awt.Point;
import java.awt.event.MouseEvent;

public class UMouse
{  public  int     x,y;
   private boolean boton1Presionado;
   private boolean boton3Presionado;
   private boolean boton2Presionado;
   
   public UMouse(){this(0,0);}
   public UMouse(Point pMouse){this(pMouse.x,pMouse.y);}
   public UMouse(int pX, int pY){x=pX;y=pY;}
   public void isPresionado(int pBoton)
   {  if(pBoton==MouseEvent.BUTTON1)boton1Presionado=true;
      if(pBoton==MouseEvent.BUTTON3)boton3Presionado=true;
      if(pBoton==MouseEvent.BUTTON2)boton2Presionado=true;
   }
   public void setBoton1Apagado(){boton1Presionado=false;}
   public void setBoton3Apagado(){boton3Presionado=false;}
   public void setBoton2Apagado(){boton2Presionado=false;}
   public boolean isBoton1Presionado(){return boton1Presionado;}
   public boolean isBoton3Presionado(){return boton3Presionado;}
   public boolean isBoton2Presionado(){return boton2Presionado;}
   public void setPoint(Point pMouse){setPoint(pMouse.x,pMouse.y);}
   public void setPoint(int pX,int pY){x=pX; y=pY;}
}