package com.utils.common;

/**
 * Regresa los caracteres una cadena de <code>texto</code> que cumplen el criterio.
 * <p>El n�mero de caracteres se especifica en <code>largo</code>.
 * Si el <code>largo</code> es mayor que la longitud de <code>texto</code>, 
 * se devuelve el <code>texto</code> completo. 
 * <p>Ejemplos:<blockquote><pre>
 *     String c="1234567890"   Right(c,3)       //"890"
 *                             Left(c,3)        //"123"
 *                             Mid(c,3)         //"34567890"
 *                             Mid(c,3,2)       //"34"
 *                             Replicate(c,3)   //"123456789012345678901234567890"
 *                             PadR(c,"#",16)   //"1234567890######"
 *                             PadL(c,"#",16)   //"######1234567890"
 *                             PadC(c,"#",16)   //"###1234567890###"
 *                             SepareR(c,":",3) //"123:456:789:0"
 *                             SepareL(c,":",3) //"1:234:567:890"
 *                             TrimR("0000123450000","0")  //"000012345"
 *                             TrimL("0000123450000","0")  //"123450000"
 *                             Trim("0000123450000","0")   //"12345"
 *                             
 * </pre></blockquote> 
 * 
 * @param      texto  la cadena de caracteres.
 * @param      cadena substring que puede ser aumentada o restada del texto.
 * @param      largo  cantidad de caracteres seleccionados.
 * @param      inicio indica la posici�n del primer caracter seleccionado.
 * @param      fin    indica la posici�n del �ltimo caracter seleccionado.
 * 
 *    
 */
public class UStr
{  public static String left(String texto,int largo)
   {  return (texto.length()<largo) ? texto : texto.substring(0,largo);
   }

   public static String right(String texto, int largo)
   {  return (texto.length()<largo) ? texto : texto.substring(texto.length() - largo, texto.length());
   }

   public static String mid(String texto, int inicio)
   {  return (texto.length() < inicio + 1) ? "" : texto.substring(inicio, texto.length()-inicio+1);
   }
   
   public static String mid(String texto, int inicio, int fin)
   {  return (texto.length()<fin+1) ? texto.substring(inicio, texto.length()-1) : texto.substring(inicio, fin+1);
   }
   
   public static String replicate(String texto, int largo)
   {  String cadena=""; for(int i=0;i<largo;i++) cadena+=texto;
      return (cadena);
   }
   
   public static String padR(String texto, String cadena ,int largo)
   {  return (left(texto+replicate(cadena,largo),largo));
   }
   
   public static String padL(String texto, String cadena ,int largo)
   {  return (right(replicate(cadena,largo)+texto,largo));
   }
   
   public static String padC(String texto, String cadena ,int largo)
   {  return (padL(left(padR(texto,cadena,largo),largo-cadena.length()),cadena,largo));
   }
   
   public static String separeR(String texto, String cadena, int largo)
   {  String result=""; for(int i=0;i<texto.length();i++) result+=texto.charAt(i)+((i>0 && i%largo==0)?cadena:""); 
      return (result);
   }
   
   public static String separeL(String texto, String cadena, int largo)
   {  String result=""; for(int i=texto.length()-1;i>=0;i--) result=((i>0 && i%largo==0)?cadena:"")+texto.charAt(i)+result; 
      return (result);
   }
   
   public static String trimR(String texto, String cadena)
   {  for(int i=texto.length()-1;i>0;i--) if(right(texto,1).equals(cadena)) texto=left(texto,texto.length()-1); 
      return (texto);
   }
   
   public static String trimL(String texto, String cadena)
   {  for(int i=0;i<texto.length()-1;i++) if(left(texto,cadena.length()).equals(cadena)) texto=mid(texto,cadena.length()); 
      return (texto);
   }
   
   public static String trim(String texto, String cadena)
   {  return (trimL(trimR(texto,cadena),cadena));
   }
   
}
