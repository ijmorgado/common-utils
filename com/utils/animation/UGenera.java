package com.utils.animation;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;

/******************************************
 *************** GENERA *******************
 *****************************************/
public class UGenera
{  public static int aleatorio(int n)
   {  return((int)(Math.random()*n));
   }
   public static int aleatorio(int minimo,int maximo)
   {  return(aleatorio(maximo-minimo)+minimo);
   }
   public static boolean logico()
   {  return(aleatorio(2)==0);
   }
   public static boolean logico(int rango)
   {  return(aleatorio(rango)==0);
   }
   public static Point punto()
   {  Dimension D=Toolkit.getDefaultToolkit().getScreenSize();
      return punto(D.width,D.height);
   }
   public static Point punto(int pAncho, int pLargo)
   {  return new Point(UGenera.aleatorio(pAncho),UGenera.aleatorio(pLargo));
   }
   public static Color color()
   {  return color(255);
   }
   public static Color color(boolean pAlfa)
   {  return color(aleatorio(256));
   }
   public static Color color(int pAlfa)
   {  return color(aleatorio(256),aleatorio(256),aleatorio(256),pAlfa);
   }
   public static Color color(int pRojo,int pVerde,int pAzul)
   {  return color(pRojo,pVerde,pAzul,255);
   }
   public static Color color(int pRojo,int pVerde,int pAzul,boolean pAlfa)
   {  return color(pRojo,pVerde,pAzul,aleatorio(256));
   }
   public static Color color(int pRojo,int pVerde,int pAzul,int pAlfa)
   {  return new Color(pRojo,pVerde,pAzul,pAlfa);
   }
}