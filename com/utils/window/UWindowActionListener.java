package com.utils.window;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class UWindowActionListener extends UWindowContainer implements ActionListener
{  public UWindowActionListener()
   {  super(); 
   }
   public UWindowActionListener(String pTitulo)
   {  super(pTitulo);  
   }
   public UWindowActionListener(String pTitulo,int pX,int pY)
   {  super(pTitulo,pX,pY); 
   }
   public UWindowActionListener(String pTitulo,boolean pPantallaCompleta)
   {  super(pTitulo,pPantallaCompleta); 
   }
   public UWindowActionListener(String pTitulo,Dimension pD)
   {  super(pTitulo,pD); 
   }
   public UWindowActionListener(String pTitulo,int pX,int pY,int pAncho,int pLargo)
   {  super(pTitulo,pX,pY,pAncho,pLargo); 
   }
   public UWindowActionListener(String pTitulo,int pX,int pY,int pAncho,int pLargo,boolean pPrincipal)
   {  super(pTitulo,pX,pY,pAncho,pLargo,pPrincipal); 
   }
   public void actionPerformed(ActionEvent e){}
   public void add(Component c,int pX,int pY,int pAncho,int pLargo,ActionListener pAccion)
   {  container.add(c); c.setBounds(pX,pY,pAncho,pLargo);
      if(c instanceof JButton) ((JButton)c).addActionListener(pAccion);       
   }
}
