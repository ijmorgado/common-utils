package com.utils.animation;

/******************************************
 ************** RECORRIDO *****************
 *****************************************/
public class URecorrido
{  private int     valor; 
   private int     menor;
   private int     mayor;
   private boolean sentido;
   
   public URecorrido(int pMayor){this(0,pMayor+1);}
   public URecorrido(int pMayor,boolean pAleatorio){this(0,pMayor+1,pAleatorio);  }
   public URecorrido(int pMenor, int pMayor)
   {  this(pMenor,pMayor,false);
   }
   public URecorrido(int pMenor, int pMayor, boolean pAleatorio)
   {  menor=pMenor;
      mayor=pMayor;
      valor=pAleatorio?UGenera.aleatorio(pMenor,pMayor):pMenor;
      sentido=pAleatorio?UGenera.logico():true;
   }
   public int recorrer(){ return(recorrer(1)); }
   public int recorrer(int pvelocidad)
   {  if(sentido)valor+=pvelocidad; else valor-=pvelocidad;
      if(valor<menor){valor=menor; sentido=true; } 
      if(valor>mayor-1){valor=mayor-1; sentido=false;}
      return(valor);
   }
   public int ciclar(){ return(ciclar(1)); }
   public int ciclar(int pvelocidad)
   {  if(sentido)valor+=pvelocidad; else valor-=pvelocidad;
      if(valor<menor)valor=mayor-1; 
      if(valor>mayor-1)valor=menor;
      return(valor);
   }
   public int     getValor(){return(valor);}
   public int     getMayor(){return(mayor);}
   public boolean getSentido(){return(sentido);}
   public boolean getCero(){boolean cero=recorrer()==0; if(cero)recorrer(); return(cero);}
   public void setSentido(boolean psentido){sentido=psentido;}
   public void setValor(int pValor){valor=pValor; if(valor<menor)valor=menor; if(valor>mayor-1)valor=mayor-1;}
   public void setValorTope(int pValor){valor=pValor; if(valor<menor)valor=menor+(menor-valor); if(valor>mayor-1)valor=mayor-(valor-mayor)-1;}
   public void setMaximo(){mayor++;}
   public void setMayor(int pmayor){mayor=pmayor;}
   public void setMenor(int pmenor){menor=pmenor;}
   public void reiniciar(){setValor(0); setSentido(true); }
   public void reiniciarTope(){setValor(mayor); setSentido(false); }
}