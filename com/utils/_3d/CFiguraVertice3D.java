package com.utils._3d;
import java.awt.*;

public class CFiguraVertice3D extends CFigura3D
{  public boolean conectado=true;
   
   public CFiguraVertice3D(Dimension pD,int pX,int pY, int pZ)
   {  super(pD,pX,pY,pZ,0,0,0);      
      /*             
                    /*****************
                   / *              /*
                  /  *             / *
                 /   *          0 /  *
                /--------------- O   *
                |    *        /  |   *
                |    *      /    |   *
                |    *    /      |   *
                |    * /         |   *
                |    ************|****  
                |   /            |   /
                |  /             |  / 
                | /              | /  
                |/               |/   
                |________________|  
              
     */   
      agregarVertice(x,y,z); //0
      agregarLinea(0,0,Color.ORANGE,2);
      actualizaValores();
   }
}