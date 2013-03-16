package com.utils.animation;

import java.awt.*;

/******************************************
 ************** RECORRIDO X y Y ************
 *****************************************/
public class URecorridoXY
{  public URecorrido X,Y; 
   
   public URecorridoXY(){this(Toolkit.getDefaultToolkit().getScreenSize());}
   public URecorridoXY(boolean pAleatorio){this(Toolkit.getDefaultToolkit().getScreenSize(),true);}
   public URecorridoXY(Dimension d){this(d.width, d.height);}
   public URecorridoXY(Dimension d,boolean pAleatorio){this(d.width, d.height,true);}
   public URecorridoXY(int pX, int pY,boolean pAleatorio){X=new URecorrido(pX,true); Y=new URecorrido(pY,true);}
   public URecorridoXY(int pX, int pY){X=new URecorrido(pX); Y=new URecorrido(pY);}
   public URecorridoXY(int pMenorX,int pMayorX,int pMenorY,int pMayorY){X=new URecorrido(pMenorX,pMayorX); Y=new URecorrido(pMenorY,pMayorY);}
   public URecorridoXY(int pMenorX,int pMayorX,boolean pAleatorioX,int pMenorY,int pMayorY,boolean pAleatorioY){X=new URecorrido(pMenorX,pMayorX,pAleatorioX); Y=new URecorrido(pMenorY,pMayorY,pAleatorioY);}
   public Point   recorrer() {return new Point(X.recorrer(),Y.recorrer());}
   public Point   recorrer(int pVelocidad){return new Point(X.recorrer(pVelocidad),Y.recorrer(pVelocidad));}
   public int     recorrerX(){return X.recorrer();}
   public int     recorrerY(){return Y.recorrer();}
   public int     getValorX(){return X.getValor();}
   public int     getValorY(){return Y.getValor();}
   public int     getMayorX(){return X.getMayor();}
   public int     getMayorY(){return Y.getMayor();}
   public boolean getSentidoX(){return X.getSentido();}
   public boolean getSentidoY(){return Y.getSentido();}
   public boolean getCeroX(){return X.getCero();}
   public boolean getCeroY(){return Y.getCero();}
   public void setSentido (boolean pSentidoX, boolean pSentidoY){X.setSentido(pSentidoX); Y.setSentido(pSentidoY);}
   public void setSentidoX(boolean pSentidoX){X.setSentido(pSentidoX);}
   public void setSentidoY(boolean pSentidoY){Y.setSentido(pSentidoY);}
   public void setValor (int pValorX, int pValorY){X.setValor(pValorX); Y.setValor(pValorY);}
   public void setValorX(int pValorX){X.setValor(pValorX);}
   public void setValorY(int pValorY){Y.setValor(pValorY);}
   public void setMaximo (){X.setMaximo();Y.setMaximo();}
   public void setMaximoX(){X.setMaximo();}
   public void setMaximoY(){Y.setMaximo();}   
   public void setMayor (int pMayorX,int pMayorY){X.setMayor(pMayorX); Y.setMayor(pMayorY);}
   public void setMayorX(int pMayorX){X.setMayor(pMayorX);}
   public void setMayorY(int pMayorY){Y.setMayor(pMayorY);}
   public void setMenor (int pMenorX,int pMenorY){X.setMenor(pMenorX); Y.setMenor(pMenorY);}
   public void setMenorX(int pMenorX){X.setMenor(pMenorX);}
   public void setMenorY(int pMenorY){Y.setMenor(pMenorY);}
}
