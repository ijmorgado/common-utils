package com.utils.common;

import java.awt.*;

import javax.swing.*;

/**
 * <b>UDialog</b>  ->pertenece al Paquete AJM Utilerias<br>
 * Esta clase permite mostrar un mensaje de texto dentro de una ventana.
 * 
 * @param pTexto  Es la cadena de texto que se desea mostrar.
 * @param pTituto Es el Titulo de la Ventana que se mostrara.
 * @param pFuente Es la fuente o estilo de letra con el que se desea mostrar el texto.
 * <blockquote>
 * Ejemplo: <i>UDialog.mostrarMensaje("Hola",new Font("Arial",Font.BOLD,24));</i>
 * Mostrara el mensaje <b>Hola</b> con el Tipo de Letra Arial, Negrita y Tama�o 24
 * </blockquote>         
 */
public class UDialog
{  private static int  numero=1;
   private String      texto,titulo;
   private Font        fuente;
   private JTextArea   textoArea;
   private JScrollPane scrollPanel;
   private int         filas,columnas,oldSeleccion=0;
  
   public UDialog()
   {  this("");
   }
   public UDialog(String pTexto)
   {  this(pTexto,"Resultados "+numero++);
   }
   public UDialog(String pTexto,int pFilas,int pColumnas)
   {  this(pTexto,"Resultados "+numero++,pFilas,pColumnas);
   }
   public UDialog(String pTexto,String pTitulo)
   {  this(pTexto,pTitulo,new Font("Courier",Font.PLAIN,14));
   }
   public UDialog(String pTexto,String pTitulo,int pFilas,int pColumnas)
   {  this(pTexto,pTitulo,new Font("Courier",Font.PLAIN,14),pFilas,pColumnas);
   }
   public UDialog(String pTexto,Font pFuente)
   {  this(pTexto,"Resultados "+numero++,pFuente);      
   }
   public UDialog(String pTexto,Font pFuente,int pFilas,int pColumnas)
   {  this(pTexto,"Resultados "+numero++,pFuente,pFilas,pColumnas);      
   }
   public UDialog(String pTexto,String pTitulo,Font pFuente)
   {  this(pTexto,pTitulo,pFuente,0,0);
   }
   public UDialog(String pTexto,String pTitulo,Font pFuente,int pFilas,int pColumnas)
   {  texto=pTexto; titulo=pTitulo; fuente=pFuente; filas=pFilas; columnas=pColumnas;
      textoArea=new JTextArea(filas,columnas);
        textoArea.setFont(fuente);
        textoArea.setEditable(false);
      scrollPanel=new JScrollPane(textoArea);
      agregarMensaje(texto);
   }
   public void agregarMensaje(String pTexto)
   {  agregarMensaje(pTexto,filas,columnas);
   }  
   public void agregarMensaje(String pTexto, int pFilas, int pColumnas)
   {  filas=pFilas; columnas=pColumnas;
      textoArea.setRows(filas); textoArea.setColumns(columnas);
      textoArea.append(pTexto);
      textoArea.setSelectionStart(oldSeleccion); oldSeleccion=textoArea.getText().length();
      textoArea.setSelectionEnd(oldSeleccion);
      JOptionPane.showMessageDialog(null,scrollPanel,titulo,JOptionPane.INFORMATION_MESSAGE);
   }  
   
   //*****************************************************************
   //**********************EVENTOS TIPO STATIC************************
   //*****************************************************************
   public static void mostrarMensaje(String pTexto)
   {  mostrarMensaje(pTexto,"Resultados "+numero++);
   }
   public static void mostrarMensaje(String pTexto,int pFilas,int pColumnas)
   {  mostrarMensaje(pTexto,"Resultados "+numero++,pFilas,pColumnas);
   }
   public static void mostrarMensaje(String pTexto,String pTitulo)
   {  mostrarMensaje(pTexto,pTitulo,new Font("Courier",Font.PLAIN,14));
   }
   public static void mostrarMensaje(String pTexto,String pTitulo,int pFilas,int pColumnas)
   {  mostrarMensaje(pTexto,pTitulo,new Font("Courier",Font.PLAIN,14),pFilas,pColumnas);
   }
   public static void mostrarMensaje(String pTexto,Font pFuente)
   {  mostrarMensaje(pTexto,"Resultados "+numero++,pFuente);
   }
   public static void mostrarMensaje(String pTexto,Font pFuente,int pFilas,int pColumnas)
   {  mostrarMensaje(pTexto,"Resultados "+numero++,pFuente,pFilas,pColumnas);
   }
   public static void mostrarMensaje(String pTexto,String pTitulo,Font pFuente)
   {  mostrarMensaje(pTexto, pTitulo, pFuente,0,0);
   }
   public static void mostrarMensaje(String pTexto,String pTitulo,Font pFuente,int pFilas,int pColumnas)
   {  JTextArea   textoArea=new JTextArea(pTexto,pFilas,pColumnas);
                  textoArea.setFont(pFuente);
                  textoArea.setEditable(false);
      JScrollPane scrollPanel=new JScrollPane(textoArea);
               
      JOptionPane.showMessageDialog(null,scrollPanel,pTitulo,JOptionPane.INFORMATION_MESSAGE);
   }
}
