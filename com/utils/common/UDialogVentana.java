package com.utils.common;

import java.awt.*;
import javax.swing.*;
import com.utils.animation.UVentanasCG;

/**
 * <b>UDialogVentana</b>  ->pertenece al Paquete AJM Utilerias<br>
 * Esta clase permite mostrar un mensaje de texto dentro de una ventana.
 * 
 * @param pTexto  Es la cadena de texto que se desea mostrar.
 * @param pTituto Es el Titulo de la Ventana que se mostrar�.
 * @param pFuente Es la fuente o estilo de letra con el que se desea mostrar el texto.
 * <blockquote>
     Ejemplo:<br><i>UDialogVentana.mostrarMensaje("Hola",new Font("Arial",Font.BOLD,24));</i><br>
     Mostrar� el mensaje <b>Hola</b> con el Tipo de Letra:(Arial, Negrita y Tamaño 24)
   </blockquote>         
 */
public class UDialogVentana extends UVentanasCG
{  private static int       numero=1;
   private Font             fuente;
   private JTextArea        textoArea;
   private static Dimension tamaño,D=Toolkit.getDefaultToolkit().getScreenSize();
   
   public UDialogVentana()
   {  this(false);
   }
   public UDialogVentana(int pX,int pY)
   {  this(false);
      this.setLocation(pX,pY);
   }
   public UDialogVentana(boolean pUnica)
   {  this("",pUnica);
   }
   public UDialogVentana(String pTexto)
   {  this(pTexto,false);
   }
   public UDialogVentana(String pTexto,int pX,int pY)
   {  this(pTexto,"Dialogo "+numero++);
      this.setLocation(pX,pY);
   }
   public UDialogVentana(String pTexto,boolean pUnica)
   {  this(pTexto,"Dialogo "+numero++,pUnica);
   }
   public UDialogVentana(String pTexto,int pX,int pY,boolean pUnica)
   {  this(pTexto,"Dialogo "+numero++,pUnica);
      this.setLocation(pX,pY);
   }
   public UDialogVentana(String pTexto,String pTitulo)
   {  this(pTexto,pTitulo,false);
   }
   public UDialogVentana(String pTexto,String pTitulo,boolean pUnica)
   {  this(pTexto,pTitulo,new Font("Courier",Font.PLAIN,14),pUnica);
   }
   public UDialogVentana(String pTexto,Font pFuente)
   {  this(pTexto,pFuente,false);      
   }
   public UDialogVentana(String pTexto,Font pFuente,boolean pUnica)
   {  this(pTexto,"Dialogo "+numero++,pFuente,pUnica);      
   }
   public UDialogVentana(String pTexto,String pTitulo,Font pFuente)
   {  this(pTexto,pTitulo,pFuente,false);    
   }
   public UDialogVentana(String pTexto,String pTitulo,Font pFuente,boolean pUnica)
   {  super(pTitulo);
      fuente=pFuente;
      textoArea=new JTextArea(pTexto);
      textoArea.setFont(fuente);
      textoArea.setEditable(false);
      textoArea.setBackground(Color.WHITE); 
      setTamaño(pTexto);
                  
      this.add(textoArea,BorderLayout.CENTER);
      this.setLocation((D.width-textoArea.getWidth())/2,(D.height-textoArea.getHeight())/2);
      this.setDefaultCloseOperation(pUnica?JFrame.EXIT_ON_CLOSE:JFrame.DISPOSE_ON_CLOSE);
      this.setVisible(true);
   }
   public void nuevoMensaje(String pTexto)
   {  textoArea.setText(pTexto);
      setTamaño(pTexto);
   }
   public void agregarMensaje(String pTexto)
   {  textoArea.append(pTexto);
   }   
   private void setTamaño(String pTexto)
   {  
      
      tamaño=getTamaño(pTexto);
      textoArea.setSize(tamaño.width*(textoArea.getFontMetrics(fuente).getWidths()[0]+1)-10,tamaño.height*textoArea.getFontMetrics(fuente).getHeight()+10);
      this.setSize(textoArea.getSize());
      //this.setLocation((D.width-this.getWidth())/2,(D.height-this.getHeight())/2);      
   }
   
   //*****************************************************************
   //**********************EVENTOS TIPO STATIC************************
   //*****************************************************************
   public static void mostrarMensaje(String pTexto)
   {  mostrarMensaje(pTexto,false);
   }
   public static void mostrarMensaje(String pTexto,boolean pUnica)
   {  mostrarMensaje(pTexto,"Dialogo "+numero++,pUnica);
   }
   public static void mostrarMensaje(String pTexto,String pTitulo)
   {  mostrarMensaje(pTexto,pTitulo,false);
   }
   public static void mostrarMensaje(String pTexto,String pTitulo,boolean pUnica)
   {  mostrarMensaje(pTexto,pTitulo,new Font("Courier",Font.PLAIN,14),pUnica);
   }
   public static void mostrarMensaje(String pTexto,Font pFuente)
   {  mostrarMensaje(pTexto,pFuente,false);
   }
   public static void mostrarMensaje(String pTexto,Font pFuente,boolean pUnica)
   {  mostrarMensaje(pTexto,"Dialogo "+numero++,pFuente,pUnica);
   }
   public static void mostrarMensaje(String pTexto,String pTitulo,Font pFuente,boolean pUnica)
   {  JTextArea textoArea=new JTextArea(pTexto);
                textoArea.setFont(pFuente);
                textoArea.setEditable(false);
                textoArea.setBackground(Color.WHITE);
                tamaño=getTamaño(pTexto); System.out.println(tamaño);
                textoArea.setSize(tamaño.width*(textoArea.getFontMetrics(pFuente).getWidths()[0]+1)-10,tamaño.height*(textoArea.getFontMetrics(pFuente).getHeight()+1)+10);
      UVentanasCG jFrame=new UVentanasCG(pTitulo,(D.width-textoArea.getWidth())/2,(D.height-textoArea.getHeight())/2,textoArea.getSize(),pUnica);            
                jFrame.add(textoArea,0,0,tamaño.width,tamaño.height);
                jFrame.setVisible(true);
   }
   private static Dimension getTamaño(String pTexto)
   {  Dimension d=new Dimension(); String[] aLineas=pTexto.split(Character.toString((char)10));
      d.height=aLineas.length+1;
      for(int i=0;i<aLineas.length;i++)
      {  if(aLineas[i].length()>d.width)d.width=aLineas[i].length();
      }
      return d;
   }
}
