package com.utils._3d;
import java.awt.*;

public class CFiguraPoligono3D
{  private Dimension D;
   private Polygon   p=new Polygon();
   private CFiguraVertice3D[] aL;
   private int      lados,ox=0,oy=0,oz=0,r;
   private double   ang2,ang3,rotacion=90;  
   
   public CFiguraPoligono3D(Dimension pD){this(pD,3);}
   public CFiguraPoligono3D(Dimension pD,int pLados){this(pD,pLados,500);}
   public CFiguraPoligono3D(Dimension pD,int pLados,int pRadio)
   {  D=pD; lados=pLados; r=pRadio; aL=new CFiguraVertice3D[lados];
      ang2=0; ang3=360/aL.length;
      crearPuntos();
   }
   private void crearPuntos()
   {  for(int i=0;i<aL.length;i++)
      {  //CEjes e=new CEjes(EEjes.NONE,0,0,0,ang2,ang3*i+rotacion,false);
         CEjes e=new CEjes(0,0,r,ang2,ang3*i+rotacion,false);
         //aL[i]=new CFiguraVertice3D(D,ox+e.x(),oy+e.y(),oz+e.z());     
         aL[i]=new CFiguraVertice3D(D,ox+e.x(),oy+e.y(),oz+e.z());
      }
      actualizaRotacion(0,0);
   }
   public void actualizaRotacion(int dx,int dy)
   {  p=new Polygon();
      for(int i=0;i<aL.length;i++)
      {  aL[i].actualizaRotacion(dx,dy);
         p.addPoint(aL[i].getOrigen(0).x,aL[i].getOrigen(0).y);
      }
   }
   public void dibujar(Graphics2D g){dibujar(g,Color.CYAN);}
   public void dibujar(Graphics2D g,Color color)
   {  for(int i=0;i<aL.length;i++)
      {  aL[i].dibujar(g);  
         g.setColor(Color.WHITE); g.drawString(""+i,aL[i].getOrigen(0).x+20,aL[i].getOrigen(0).y-10);
         int x=aL[i].x,y=aL[i].y,z=aL[i].z;
         g.setColor(Color.YELLOW);g.drawString("("+x+","+y+","+z+")",aL[i].getOrigen(0).x+20,aL[i].getOrigen(0).y+10);
      }
      g.setStroke(new BasicStroke(2)); g.setColor(color); g.drawPolygon(p);
      //ang2=(ang2+0.5)%360;
      //ang3=(ang3+3)%360; 
      //crearPuntos();
   }   
}
