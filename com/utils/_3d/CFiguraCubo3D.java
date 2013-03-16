package com.utils._3d;


import java.awt.*;

public class CFiguraCubo3D extends CFigura3D
{  private int X=2000,Y=2000,Z=2000,oX=0,oY=0,oZ=0;

   public CFiguraCubo3D(Dimension pD,int pX,int pY, int pZ)
   {  this(pD,pX,pY,pZ,0,0,0);
   }
   public CFiguraCubo3D(Dimension pD,int pX,int pY, int pZ,int pOx,int pOy, int pOz)
   {  super(pD,pX,pY,pZ,pOx,pOy,pOz);
      /*           6               8  
                    /**************
                   / *           /*
                  /  *          / *
                 /   *      11 /  *
             10 /-------------/   *
                |    *        |   *
                |    *        |   *
                |  4 *********|**** 5
                |   /         |   /
                |  /          |  / 
                | /           | /  
                |/            |/   
              7 |_____________| 9
              
     */   
      //Ejes
      agregarVertice(oX,oY,oZ); //0
      agregarVertice(X ,oY,oZ); //1
      agregarVertice(oX,Y ,oZ); //2
      agregarVertice(oX,oY,Z ); //3
      agregarLinea(0,1,Color.WHITE,0);
      agregarLinea(0,2,Color.WHITE,0);
      agregarLinea(0,3,Color.WHITE,0);
      
      //Lados
      agregarVertice(ox  ,oy  ,oz  ); //4
      agregarVertice(ox+x,oy  ,oz  ); //5
      agregarVertice(ox  ,oy+y,oz  ); //6
      agregarVertice(ox  ,oy  ,oz+z); //7
      agregarLinea(4,5,Color.RED,2);
      agregarLinea(4,6,Color.GREEN,2);
      agregarLinea(4,7,Color.BLUE,2);
      
      agregarVertice(ox+x,oy+y,oz  ); //8
      agregarVertice(ox+x,oy  ,oz+z); //9
      agregarVertice(ox  ,oy+y,oz+z); //10
      agregarVertice(ox+x,oy+y,oz+z); //11
      
      agregarLinea(5,8,Color.YELLOW,3);
      agregarLinea(6,8,Color.YELLOW,3);
      agregarLinea(8,11,Color.YELLOW,3);
      agregarLinea(5,9,Color.PINK,3);
      agregarLinea(7,9,Color.PINK,3);
      agregarLinea(9,11,Color.PINK,3);
      agregarLinea(6,10,Color.MAGENTA,3);
      agregarLinea(7,10,Color.MAGENTA,3);      
      agregarLinea(10,11,Color.MAGENTA,3);
      
      agregarLinea(4,11,Color.ORANGE,2);
      actualizaValores();
   }
}
