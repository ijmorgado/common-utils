package com.utils.files;
import java.io.*;

public class UArchivo
{  private String         archivo;
   private BufferedReader br;
   private BufferedWriter bw;
   private boolean        escritor; 
   
   public UArchivo(String pArchivo) {this(pArchivo,false,false);}
   public UArchivo(String pArchivo,boolean pEscritor) {this(pArchivo,pEscritor,false);}
   public UArchivo(String pArchivo,boolean pEscritor,boolean pAppend)
   {  archivo=pArchivo; escritor=pEscritor;
      if(escritor) try{ bw=new BufferedWriter(new FileWriter(archivo,pAppend)); }catch(IOException e){ e.printStackTrace(); }
      else 
      {  try
         {  /*if(!new File(archivo).exists()) 
            { bw=new BufferedWriter(new FileWriter(archivo,pAppend)); 
              bw.close();
            }*/
            br=new BufferedReader(new FileReader(archivo)); 
         }catch(IOException e){ e.printStackTrace(); }
      }
   }
   public int leerInt()
   {  int valor=0; String sValor="";
      try{ sValor=br.readLine(); }catch(IOException e) {}
      if(sValor!=null) valor=Integer.parseInt(sValor); 
      return valor;  
   }
   public String leerCadena()
   {  String valor="";
      try{ valor=br.readLine(); }catch(IOException e){}
      return valor;  
   }
   public void escribir(int valor)
   {  try{ bw.write(valor+"\n"); }catch(IOException e){ e.printStackTrace(); } 
   }
   public void escribir(String cadena)
   {  try{ bw.write(cadena+"\n"); }catch(IOException e){ e.printStackTrace(); } 
   }
   public void cerrar()
   {  if(escritor) try{ bw.close(); }catch(IOException e){ e.printStackTrace(); }
      else         try{ br.close(); }catch(IOException e){ e.printStackTrace(); }
   }
}