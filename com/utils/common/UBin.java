package com.utils.common;
import java.text.NumberFormat;

/**
 * Convierte a <code>DECIMAL</code> <code>BINARIO</code> <code>HEXADECIMAL</code> <code>OCTAL</code>.
 * <p>Ejemplos:<blockquote><pre>
 *     String b="00001111"     Bin2Hex(b)       //"f"
 *                             Bin2Int(b)       //15
 *                             
 *     double d=3.0            Dbl2Bin(d)       //"0��10000000��1000 0000 0000 0000 0000 000"
 *                             Dbl2Hex(d)       //"0x1.8p1"
 *                             
 *     float f=3.0             Flt2Hex(f)       //"0x1.8p1"
 *                             
 *     String h="f"            Hex2Bin(h)       //"1111"
 *     int i=15                Int2Bin(i,8)     //"00001111"
 *                             Int2Hex(i,4)     //"000f"
 *                             
 * </pre></blockquote> 
 * 
 * @param      i     numero entero.
 * @param      largo cantidad de bits del resultado.
 * @param      d     numero double.
 * @param      f     numero flotante.
 * @param      b     numero binario.
 * 
 *    
 */
public class UBin
{  public static String int2Bin(int i, int largo)
   {  return(UStr.separeL(UStr.padL(""+Integer.toBinaryString(i),"0",largo)," ",4));
   }

   public static String int2Hex(int i, int largo)
   {  return(UStr.separeL(UStr.padL(""+Integer.toHexString(i),"0",largo)," ",2));
   }

   public static String dbl2Bin(double d)
   {  NumberFormat nf   =NumberFormat.getNumberInstance();
      String   S        =nf.format(d); S+=(S.length()<2?".0":"");
      String[] s        =S.replace(".", ":").split(":",2); 
      long     i        =Long.parseLong("0"+s[0]); 
      String   signo    =(Long.signum(i)==-1?"1":"0"); if(Long.signum(i)==-1) i=Math.abs(i);
      String   mantisa  =Long.toBinaryString(i).substring(1); 
      String   exponente=UStr.padL(((mantisa.length()>0)?Integer.toBinaryString(mantisa.length()+127):""),"0",8);
      String   bin      =signo +"��"+ UStr.separeL(exponente," ",4) +"��"+ UStr.separeL(UStr.padR(mantisa,"0", 23)," ",4);
      return(bin);
   }
   
   public static String dbl2Hex(double d)
   {  NumberFormat nf   =NumberFormat.getNumberInstance();
      String   S        =nf.format(d); S+=(S.length()<2?".0":"");
      String[] s        =S.replace(".", ":").split(":",2); 
      long     i        =Long.parseLong("0"+s[0]); 
      String   signo    =(Long.signum(i)==-1?"1":"0"); if(Long.signum(i)==-1) i=Math.abs(i);
      String   uno      =(Long.signum(i)==0?"0":"1");
      int      largo    =Long.toBinaryString(i).substring(1).length();
      String   mantisa  =UStr.padR(Long.toBinaryString(i).substring(1),"0",23); 
      String   exponente=UStr.padL(((largo>0)?Integer.toBinaryString(largo+127):""),"0",8);
      String   manhex   =((largo>0)?UStr.trimR(bin2Hex(mantisa.substring(0,4))+bin2Hex(mantisa.substring(4,8))+bin2Hex(mantisa.substring(8,12))+bin2Hex(mantisa.substring(12,16))+bin2Hex(mantisa.substring(16,20))+bin2Hex(mantisa.substring(20,23)),"0"):"0");
      String   hex=(signo.equals("1")?"-":"")+"0x"+uno+"."+manhex+"p"+((largo>0)?bin2Int(exponente)-127:"0");
      return(hex);
   }

   public static String flt2Hex(float f)
   {   return(Float.toHexString(f));
   }   
   
   public static int bin2Int(String b)
   {  b=b.replaceAll(" ",""); 
      return(Integer.parseInt(b,2));
   }
   
   public static String bin2Hex(String b)
   {   return(Integer.toHexString(Integer.parseInt(b,2)));
   }   
   
   public static String hex2Bin(String h)
   {   String b=""; for(int i=0;i<h.length();i++) b+=UBin.int2Bin(Integer.decode("0x"+h.charAt(i)).intValue(),4)+" "; 
       return(b);  
   }   
}
