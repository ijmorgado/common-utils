package com.utils.files;
import java.io.*;
import java.util.*;
import java.util.zip.*;

public class UJarExtractor
{  private Hashtable<String,Integer> m_sizes      = new Hashtable<String,Integer>();
   private Hashtable<String,byte[]> m_jarContents = new Hashtable<String,byte[]>();
   private String    m_jarFileName;
   private byte[]    data;
   private int       pos;
   
   public UJarExtractor(String jarFileName)
   {  this.m_jarFileName=jarFileName;
      initialize();
   }   
   public byte[] getImageData(String name)
   {  return (byte[]) m_jarContents.get(name);
   }
   public byte[] getData(String name)
   {  data=getImageData(name); pos=0;
      return data;      
   }
   public String getLinea()
   {  String linea=null; 
      while(pos<data.length && data[pos]!=13)if(linea==null)linea=""+(char)data[pos++]; else linea+=(char)data[pos++]; 
      while(pos<data.length && (data[pos]==13 || data[pos]==10))pos++; 
      return linea;
   }
   private void initialize()
   {  ZipFile zf = null;
      try
      {  // Asigna el tama�o
         zf = new ZipFile(m_jarFileName);
         Enumeration<?> e = zf.entries();
         while (e.hasMoreElements())
         {  ZipEntry ze = (ZipEntry) e.nextElement();
            m_sizes.put(ze.getName(),new Integer((int) ze.getSize()));
         }
         zf.close();
         zf = null;
         // pone los recursos dentro de m_jarContents
         FileInputStream     fis = new FileInputStream(m_jarFileName);
         BufferedInputStream bis = new BufferedInputStream(fis);
         ZipInputStream      zis = new ZipInputStream(bis);
         ZipEntry ze = null;
         while ((ze = zis.getNextEntry()) != null)
         {  if(ze.isDirectory())
            {  continue;
            }
            int size = (int) ze.getSize();
            if(size == -1)
            {  size = ((Integer) m_sizes.get(ze.getName())).intValue();
            }
            byte[] b = new byte[(int) size];
            int rb = 0;
            int chunk = 0;
            while (((int) size - rb) > 0)
            {  chunk = zis.read(b,rb,(int) size - rb);
               if(chunk == -1)
               {  break;
               }
               rb += chunk;
            }
            m_jarContents.put(ze.getName(),b);
         }
         zis.close();
      }catch (NullPointerException e)
      {System.out.println("ERROR 1:Puntero nulo.");
      }catch (FileNotFoundException e)
      {System.out.println("ERROR 2:Archivo no encontrado.");
      }catch (IOException e)
      {System.out.println("ERROR 3:Error de Entrada/Salida");
      }
   }
}