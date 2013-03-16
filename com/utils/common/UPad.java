package com.utils.common;

/******************************************
 *************** PAD ******************
 *****************************************/
public class UPad
{  public static String izq(int pMensaje,int pLargo)
   {  return(izq(pMensaje," ",pLargo));
   }
   public static String izq(int pMensaje,String pRelleno,int pLargo)
   {  return(izq(""+pMensaje," ",pLargo));
   }
   public static String izq(String pMensaje,int pLargo)
   {  return(izq(pMensaje," ",pLargo));
   }
   public static String izq(String pMensaje,String pRelleno,int pLargo)
   {  String relleno=""; for(int i=0;i<pLargo;i++)relleno=relleno+pRelleno;
      relleno=pMensaje+relleno; relleno=relleno.substring(0,pLargo);
      return(relleno);
   }
      
   public static String der(int pMensaje,int pLargo)
   {  return(der(pMensaje," ",pLargo));
   }
   public static String der(int pMensaje,String pRelleno,int pLargo)
   {  return(der(""+pMensaje,pRelleno,pLargo));
   }
   public static String der(String pMensaje,int pLargo)
   {  return(der(pMensaje," ",pLargo));
   }
   public static String der(String pMensaje,String pRelleno,int pLargo)
   {  String relleno=""; for(int i=0;i<pLargo;i++)relleno=relleno+pRelleno;
      relleno=relleno+pMensaje; relleno=relleno.substring(relleno.length()-pLargo,relleno.length());
      return(relleno);
   }
   
   public static String cen(int pMensaje,int pLargo)
   {  return(cen(pMensaje," ",pLargo));
   }
   public static String cen(int pMensaje,String pRelleno,int pLargo)
   {  return(cen(""+pMensaje,pRelleno,pLargo));
   }
   public static String cen(String pMensaje,int pLargo)
   {  return(cen(pMensaje," ",pLargo));
   }
   public static String cen(String pMensaje,String pRelleno,int pLargo)
   {  int pLar=(pLargo-pMensaje.length())/2;
      String relleno=""; for(int i=0;i<pLar;i++)relleno=relleno+pRelleno;
      relleno=relleno+pMensaje; for(int i=0;i<=pLar+1;i++)relleno=relleno+pRelleno;
      relleno=relleno.substring(0,pLargo);
      return(relleno);
   }
   
   public static String sep(String pMensaje,int pSep)
   { return(sep(pMensaje,pSep," "));
   }
   public static String sep(String pMensaje,int pSep,String pRelleno)
   {  String relleno=""; int largo=pMensaje.length()/pSep,i=0; 
      for(i=0;i<largo;i++)
      {  relleno=relleno+pMensaje.substring(i*pSep,(i+1)*pSep)+pRelleno;
      } if(relleno.length()<pMensaje.length()+largo) relleno=relleno+pMensaje.substring(i*pSep);
      return(relleno);
   }
}