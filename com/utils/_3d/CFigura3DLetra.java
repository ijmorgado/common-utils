package com.utils._3d;
import java.awt.*;
import java.io.File;
import com.utils.files.*;

public class CFigura3DLetra
{  private CFiguraVertice3D[] aV=new CFiguraVertice3D[0];
   
   public CFigura3DLetra(Dimension D,int x,int y,int z,String pLetra)
   {  this(D,x,y,z,null,pLetra);      
   }
   public CFigura3DLetra(Dimension D,int x,int y,int z,String pArchivo,String pLetra)
   {  if(pArchivo!=null){File f=new File(pArchivo); if(!f.exists())pArchivo=null;}
      UJarExtractor je=null; UArchivo arch=null; String letras="ajm/figuras3d/Letras3D.txt"; 
      if(pArchivo!=null){ je=new UJarExtractor(pArchivo); je.getData(letras);}
      else arch=new UArchivo("../ajm/"+letras);
      String linea="";
      do
      {  if(pArchivo!=null) linea=je.getLinea();
         else               linea=arch.leerCadena();
         if(linea!=null)
         {  String[] aL=linea.split(",");
            if(aL[0].equals(pLetra))
            {  aV=new CFiguraVertice3D[Integer.parseInt(aL[1])*2]; 
               for(int i=0;i<aV.length/2;i++)
               {  if(pArchivo!=null) linea=je.getLinea();
                  else               linea=arch.leerCadena();
                  String[] aP=linea.split(",");
                  aV[i]=new CFiguraVertice3D(D,x+Integer.parseInt(aP[0]),y+Integer.parseInt(aP[1]),z+Integer.parseInt(aP[2]));
                  aV[i+aV.length/2]=new CFiguraVertice3D(D,x+Integer.parseInt(aP[0]),y+Integer.parseInt(aP[1]),z+Integer.parseInt(aP[2]+50));
                  if(aP.length>3){aV[i].conectado=false; aV[i+aV.length/2].conectado=false;}                  
               }
               break;
            }
         }
      }while(linea!=null);
      if(pArchivo!=null) je=null;
      else               arch.cerrar();
   }
   public void actualizaRotacion(int x,int y) 
   {  for(int i=0;i<aV.length;i++) aV[i].actualizaRotacion(y,x);
   }
   public void dibujar(Graphics2D g,int rx,int ry)
   {  for(int i=0;i<aV.length;i++)
      {  aV[i].dibujar(g);
         aV[i].actualizaRotacion(rx,ry);  
      }g.setColor(Color.white);
      for(int i=0;i<aV.length;i++)
      {  if(aV[i].conectado)g.drawLine(aV[i].getOrigen().x,aV[i].getOrigen().y,aV[(i==aV.length-1?aV.length/2+1:i+1)].getOrigen().x,aV[(i==aV.length-1?aV.length/2+1:i+1)].getOrigen().y);
         if(i==aV.length/2)
         {  g.setColor(Color.cyan);for(int j=0;j<i;j++) {g.drawLine(aV[j].getOrigen().x,aV[j].getOrigen().y,aV[j+aV.length/2].getOrigen().x,aV[j+aV.length/2].getOrigen().y);}
            g.setColor(Color.yellow);
         }
      }
   }
}
