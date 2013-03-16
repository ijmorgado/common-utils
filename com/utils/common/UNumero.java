package com.utils.common;

import javax.swing.JOptionPane;

/******************************************
 *********** CAPTURA NUMERO ***************
 *****************************************/
public class UNumero
{  public static int entero(String pMensaje)
   {  int Numero=0;
      boolean incorrecto=true;
      while(incorrecto)
      {  try{ Numero=Integer.parseInt("0"+JOptionPane.showInputDialog(pMensaje)); incorrecto=false; }
         catch (NumberFormatException e) { JOptionPane.showMessageDialog(null,"Incorrecto: No es un n�mero entero.","N�mero entero",JOptionPane.ERROR_MESSAGE); }
      }
      return(Numero);
   }
   public static double doble(String pMensaje)
   {  double Numero=0;
      boolean incorrecto=true;
      while(incorrecto)
      {  try{ Numero=Double.parseDouble("0"+JOptionPane.showInputDialog(pMensaje)); incorrecto=false; }
         catch (NumberFormatException e) { JOptionPane.showMessageDialog(null,"Incorrecto: No es un n�mero double.","N�mero doble",JOptionPane.ERROR_MESSAGE); }
      }
      return(Numero);
   }
}