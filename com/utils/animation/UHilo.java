package com.utils.animation;

public class UHilo extends Thread
{  private int tiempo;

   public UHilo(int pTiempo)
   {  this("Hilo",pTiempo);
   }
   public UHilo(String pNombre, int pTiempo)
   {  super(pNombre);
      tiempo=pTiempo;
   }
   public void retardar()
   {  retardar(tiempo);      
   }
   public static void retardar(int pTiempo)
   {  try{sleep(pTiempo);}catch (Exception e){}
   }
}
