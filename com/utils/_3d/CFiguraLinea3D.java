package com.utils._3d;
import java.awt.*;

public class CFiguraLinea3D extends CFigura3D
{  public CFiguraLinea3D(Dimension pD,int pX,int pY,int pZ)
   {  this(pD,pX,pY,pZ,2);      
   }
   public CFiguraLinea3D(Dimension pD,int pX,int pY,int pZ,int estilo)
   {  this(pD,pX,pY,pZ,0,0,0,estilo);      
   }
   public CFiguraLinea3D(Dimension pD,int pX,int pY,int pZ,int pOx,int pOy,int pOz)
   {  this(pD,pX,pY,pZ,pOx,pOy,pOz,2);      
   }
   public CFiguraLinea3D(Dimension pD,int pX,int pY,int pZ,int pOx,int pOy,int pOz,int estilo)
   {  super(pD,pX,pY,pZ,pOx,pOy,pOz);
      /*             
                    /*****************
                   / *              /*
                  /  *             / *
                 /   *          1 /  *
                /----------------/   *
                |    *        // |   *
                |    *      //   |   *
                |    *   //      |   *
                |    * //        |   *
                |  0 ************|****  
                |   /            |   /
                |  /             |  / 
                | /              | /  
                |/               |/   
                |________________|  
              
     */   
      agregarVertice(ox  ,oy  ,oz  ); //0
      agregarVertice(ox+x,oy+y,oz+z); //1
      agregarLinea(0,1,Color.ORANGE,estilo);
      actualizaValores();
   }
}