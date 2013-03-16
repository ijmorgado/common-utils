package com.utils._3d;
import java.awt.*;
import com.utils.animation.URecorrido;

public abstract class CFigura3D
{  private Dimension D;
   private int[]     aVertices;
   private float[]   aVerticesAuxiliares;
   private int       MAXVertices,nVertices;
   private int[]     aConexiones;   
   private int       MAXConexiones,nConexiones;
   private Color[]   aColores;
   private Stroke[]  aStrokes;
   private CMatrix3D matrizValores=new CMatrix3D(),
                     matrizIdentidad=new CMatrix3D(),
                     matrizTranspuesta=new CMatrix3D();
   private   float   factorX=0.7f;
   private   int     rx=20,ry=20,rz=0;
   protected final  int     x,y,z,ox,oy,oz;
   private URecorrido r=new URecorrido(20,100,true);
   
   public CFigura3D(Dimension pD,int pX,int pY,int pZ)
   {  this(pD,pX,pY,pZ,0,0,0);      
   }
   public CFigura3D(Dimension pD,int pX,int pY,int pZ,int pOx,int pOy, int pOz)
   {  D=pD; x=pX; y=pY; z=pZ; ox=pOx; oy=pOy; oz=pOz;
      matrizIdentidad.yrot(ry);
      matrizIdentidad.xrot(rx);
      matrizIdentidad.zrot(rz);      
   }
   public int agregarVertice(float x,float y,float z)
   {  int i=nVertices;
      if(i>=MAXVertices)
      {   if(aVerticesAuxiliares==null)
         {  MAXVertices=100;
            aVerticesAuxiliares=new float[MAXVertices*3];
         }else
         {  MAXVertices*=2;
            float nv[]=new float[MAXVertices*3];
            System.arraycopy(aVerticesAuxiliares,0,nv,0,aVerticesAuxiliares.length);
            aVerticesAuxiliares=nv;
         }
      }
      i*=3;
      aVerticesAuxiliares[i]=x;
      aVerticesAuxiliares[i+1]=y;
      aVerticesAuxiliares[i+2]=-z;
      return nVertices++;
   }
   public void moverVertice(float x,float y,float z)
   {  int i=0;
      aVerticesAuxiliares[i]=x;
      aVerticesAuxiliares[i+1]=y;
      aVerticesAuxiliares[i+2]=-z;
   }
   public void agregarLinea(int p1,int p2,Color pColor,int pStroke)
   {  int i=nConexiones;
      if(p1>=nVertices||p2>=nVertices) return;
      if(i>=MAXConexiones) if(aConexiones==null)
      {  MAXConexiones=100;
         aConexiones=new int[MAXConexiones];
         aColores=new Color[MAXConexiones];
         aStrokes=new Stroke[MAXConexiones];
      }else
      {  MAXConexiones*=2;
         int nv[]=new int[MAXConexiones];
         System.arraycopy(aConexiones,0,nv,0,aConexiones.length);
         aConexiones=nv;
      }
      if(p1>p2)
      {  int t=p1;
         p1=p2;
         p2=t;
      }
      aConexiones[i]=(p1<<16)|p2;
      aColores[i]=pColor;
      switch(pStroke)
      {  case 0: aStrokes[i]=new BasicStroke(1f); break;
         case 1: aStrokes[i]=new BasicStroke(1f, BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL, 1f, new float[]{10f,5f},10f); break;
         case 2: aStrokes[i]=new BasicStroke(10f,BasicStroke.CAP_ROUND,BasicStroke.JOIN_BEVEL); break;
         case 3: aStrokes[i]=new BasicStroke(1f, BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL, 1f, new float[]{10f,5f},10f); break;
         default:aStrokes[i]=new BasicStroke(1f); break;
      }
      nConexiones=i+1;      
   }   
   public void dibujar(Graphics2D g){ dibujar(g,null);}
   public void dibujar(Graphics2D g,Color pColor)
   {  if(actualizaValores()) 
      {  for(int i=0;i<nConexiones;i++)
         {  int T=aConexiones[i];
            int p1=((T>>16)&0xFFFF)*3;
            int p2=(T&0xFFFF)*3;
            g.setStroke(aStrokes[i]);
            g.setColor((pColor!=null?pColor:aColores[i]));
            g.drawLine(aVertices[p1],aVertices[p1+1],aVertices[p2],aVertices[p2+1]);
         }
      }
   }   
   public void dibujar(Graphics2D g,Color pColor,boolean bGrosor)
   {  if(actualizaValores()) 
      {  for(int i=0;i<nConexiones;i++)
         {  int T=aConexiones[i];
            int p1=((T>>16)&0xFFFF)*3;
            int p2=(T&0xFFFF)*3;
            g.setStroke(new BasicStroke(r.recorrer()/10,BasicStroke.CAP_ROUND,BasicStroke.JOIN_BEVEL));//aStrokes[i]);
            g.setColor((pColor!=null?pColor:aColores[i]));
            g.drawLine(aVertices[p1],aVertices[p1+1],aVertices[p2],aVertices[p2+1]);
         }
      }
   }   
   public boolean actualizaValores()
   {  boolean lActualizado=false;
      matrizValores.unit();
      matrizValores.mult(matrizIdentidad);
      matrizValores.scale(factorX,-factorX,16*factorX/D.width);
      matrizValores.translate(D.width/2,D.height/2,0);
      if(aVerticesAuxiliares!=null && nVertices>0) 
      {  if(aVertices==null||aVertices.length<nVertices*3) aVertices=new int[nVertices*3];
         matrizValores.transform(aVerticesAuxiliares,aVertices,nVertices);
         lActualizado=true; if(nConexiones<=0||nVertices<=0) lActualizado=false;         
      }
      return lActualizado;
   }
   public void actualizaRotacion(int dx,int dy)
   {  matrizTranspuesta.unit();
         float xtheta=dx*360.0f/D.width;
         float ytheta=dy*360.0f/D.height;
      matrizTranspuesta.xrot(xtheta);
      matrizTranspuesta.yrot(ytheta);
      matrizIdentidad.mult(matrizTranspuesta);      
   }
   public String toString()
   {  String texto=String.format(" x=%4d, y=%4d, z=%4d,\n" +
                                 "ox=%4d,oy=%4d,oz=%4d,\n" +
                                 "rx=%4d,ry=%4d,rz=%4d",
                                 x,y,z,ox,oy,oz,rx,ry,rz);
      return texto;
   }
   public Point getOrigen(){return getOrigen(0);}
   public Point getOrigen(int i)
   {  if(aVertices==null||aVertices.length<nVertices*3) aVertices=new int[nVertices*3];
      int T=aConexiones[i]; 
      int p1=((T>>16)&0xFFFF)*3;
      return new Point(aVertices[p1],aVertices[p1+1]);
   }
   public Point getDestino(){return getDestino(0);}
   public Point getDestino(int i)
   {  if(aVertices==null||aVertices.length<nVertices*3) aVertices=new int[nVertices*3];
      int T=aConexiones[i];
      int p2=(T&0xFFFF)*3;
      return new Point(aVertices[p2],aVertices[p2+1]);
   }
}