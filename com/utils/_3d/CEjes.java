package com.utils._3d;
/* Esf�ricas: 
 *    r, j (�ngulo con el eje z), 
 *        q (�ngulo de la proyecci�n sobre el plano z = 0 con el eje x)
 * Paso de esf�ricas a cartesianas: 
 *     x = cos q r sen j 
 *     y = sen q r sen j 
 *     z =       r cos j
 * Paso de cartesianas a esf�ricas: 
 *     r = (x^2 + y^2 + z^2) ^ 1/2
 *     q = arc tg (y / x)
 *     j = arc cos [ z / (x^2 + y^2 + z^2) ^ 1/2 ]
 *     
 *     
 *     Sin( 0�)=0.00, Cos( 0)�=1.00
 *     Sin(90�)=1.00, Cos(90)�=0.00
 */
import java.awt.*;

public class CEjes
{  public static double ISOMETRICO_X= 0;
   public static double ISOMETRICO_Y= 0;
   public static double ISOMETRICO_Z=45;
   private EEjes   eje;
   private int     a,b,x,y,z,zx,zy,r;
   private double  a2,a3;
   private Color[] color=new Color[] {Color.RED,Color.GREEN,Color.BLUE};
   private boolean enRadianes=false;

   public CEjes(int pA,int pB,int pX,int pY,int pZ){this(EEjes.NONE,pA,pB,pX,pY,pZ);}
   public CEjes(EEjes pEje,int pA,int pB,int pX,int pY,int pZ)
   {  eje=pEje; a=pA; b=pB; ISOMETRICO_X%=360; ISOMETRICO_Y%=360; ISOMETRICO_Z%=360; 
      x=(int)(pX*Math.cos(Math.toRadians(ISOMETRICO_X))*Math.sin(Math.toRadians(ISOMETRICO_Z))); 
      y=(int)(pY*Math.sin(Math.toRadians(ISOMETRICO_Y))*Math.sin(Math.toRadians(ISOMETRICO_Z))); 
      z=(int)(pZ                                       *Math.cos(Math.toRadians(ISOMETRICO_Z))); 
         zx=(int)(z*Math.cos(Math.toRadians(ISOMETRICO_Z))); 
         zy=(int)(z*Math.sin(Math.toRadians(ISOMETRICO_Z)));
      r  =(int)(Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2)));
      a2 =(x==0?(y==0?0:(y>0?90:270)):Math.toDegrees(Math.atan(y/x)));
      a3 =Math.toDegrees( Math.acos(z/Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2))) );
   }
   public CEjes(int pA,int pB,int pR,double pA2,double pA3,boolean pEnRadianes){this(EEjes.NONE,pA,pB,pR,pA2,pA3,pEnRadianes);}
   public CEjes(EEjes pEje,int pA,int pB,int pR,double pA2,double pA3,boolean pEnRadianes)
   {  ISOMETRICO_X%=360; ISOMETRICO_Y%=360; ISOMETRICO_Z%=360; eje=pEje; a=pA; b=pB; r=pR; a2=pA2; a3=pA3; enRadianes=pEnRadianes; 
      if(!enRadianes){a2=Math.toRadians(a2);a3=Math.toRadians(a3);}
      x=(int)( r*Math.cos(ISOMETRICO_X+a2)*Math.sin(ISOMETRICO_Z+a3) );
      y=(int)( r*Math.sin(ISOMETRICO_Y+a2)*Math.sin(ISOMETRICO_Z+a3) );
      z=(int)( r                          *Math.cos(ISOMETRICO_Z+a3) );
         zx=(int)(z*Math.cos(Math.toRadians(ISOMETRICO_Z)));
         zy=(int)(z*Math.sin(Math.toRadians(ISOMETRICO_Z)));       
   }
   public void dibujar(Graphics2D g){dibujar(g,color[eje.getValor()]);}
   public void dibujar(Graphics2D g,Color color)
   {  g.setColor(color);
      switch(eje)
      {  case NONE:  break;
         case EJE_X: g.drawLine(a,b,xa(),yb()); 
                     g.drawString("X="+x,xa(),yb());break;
         case EJE_Y: g.drawLine(a,b,xa(),yb()); 
                     g.drawString("Y="+y,xa(),yb());break;
         case EJE_Z: g.drawLine(a,b,za(),zb());  
                     g.drawString("Z="+z,za(),zb());break;
      }
   }
   public int a(){return a;}
   public int b(){return b;}
   public int x(){return x;}
   public int y(){return y;}
   public int z(){return z;}
   public int xa(){return(a+x);}
   public int yb(){return(b+y);}
   public int za(){return(a-zx);}
   public int zb(){return(b+zy);}
   public int r(){return r;}
   public double a2(){return a2;}
   public double a3(){return a3;}
   
   public Point p() {return new Point(a,b);}
   public Point px(){return new Point(xa(),b);}
   public Point py(){return new Point(a,yb());}
   public Point pz(){return new Point(za(),zb());}
   
   public String toString()
   {  String texto="r:%4d,a2:%3.0f,a3:%3.0f,C(%4d,%4d,%4d)";
      texto=String.format(texto,r,a2,a3,x,y,z);
      return texto;
   }
}

enum EEjes
{  NONE(0), EJE_X(1), EJE_Y(2), EJE_Z(3);
   private int valor;
   private EEjes(int pValor)
   {  valor=pValor;
   }
   public int getValor()
   { return valor;
   }
}