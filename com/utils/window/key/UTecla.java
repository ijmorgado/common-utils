package com.utils.window.key;

import java.awt.event.KeyEvent;

public class UTecla
{  private static UTecla[] aUTeclas=new UTecla[50];
   private static int      tec=0;
   private int             tecla1,tecla2;
   private boolean         presionada,segundaVez;
   
   public UTecla(int pTecla1)
   {  this(pTecla1,-1);
   }
   public UTecla(int pTecla1,int pTecla2)
   {  tecla1=pTecla1; tecla2=pTecla2;
      aUTeclas[tec++]=this;
   }
   public boolean isTecla(int pTecla)
   {  if(tecla1==pTecla)presionada=true;
      else if(tecla2==pTecla)presionada=true;
      return presionada;
   }
   public boolean isTeclaNoRepetida(int pTecla)
   {  presionada=false;
      if(!segundaVez)
      {  segundaVez=true;
         if(tecla1==pTecla)presionada=true;
         else if(tecla2==pTecla)presionada=true;
      }
      return presionada;
   }
   public void setApagada(){presionada=false;segundaVez=false;}
   public void setApagada(int pTecla)
   {  if(tecla1==pTecla)presionada=false;
      else if(tecla2==pTecla)presionada=false;
   }
   public boolean isPresionada(){return presionada;}
   public int getTecla1()       {return tecla1;}
   public int getTecla2()       {return tecla2;}
   public String getTecla()     {return KeyEvent.getKeyText(tecla1);}
   
   public static String getTeclas()          {String texto=""; for(int i=0;i<tec;i++)texto+=((i>0?",":"")+aUTeclas[i].getTecla()); return texto;}
   public static void setApagadas(int pTecla){for(int i=0;i<tec;i++)aUTeclas[i].setApagada(pTecla);}
}
