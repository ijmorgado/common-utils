package com.utils._3d;
import java.awt.*;

public class CFiguraEjes3D
{  private CFiguraLinea3D X,Y,Z;
   
   public CFiguraEjes3D(Dimension D){this(D,2000,2000,2000);}
   public CFiguraEjes3D(Dimension D,int pX, int pY,int pZ)
   {  this(D,pX,pY,pZ,2);  }
   public CFiguraEjes3D(Dimension D,int pX, int pY,int pZ,int estilo)
   {  X=new CFiguraLinea3D(D,pX,0,0,estilo);
      Y=new CFiguraLinea3D(D,0,pY,0,estilo);
      Z=new CFiguraLinea3D(D,0,0,pZ,estilo);        
   }
   public void actualizaRotacion(int dx,int dy)
   {  X.actualizaRotacion(dx,dy);
      Y.actualizaRotacion(dx,dy);
      Z.actualizaRotacion(dx,dy);
   }
   public void dibujar(Graphics2D g){dibujar(g,null);}
   public void dibujar(Graphics2D g,Color color)
   {  if(color==null) { X.dibujar(g,Color.RED); Y.dibujar(g,Color.GREEN); Z.dibujar(g,Color.BLUE); }
      else            { X.dibujar(g); Y.dibujar(g); Z.dibujar(g); }
   }   
}
