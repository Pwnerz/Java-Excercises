package com.alejandro;

public class Bicicleta { 
	public int marcha; 
	public int velocidad; 
	
           //constructor 
	public Bicicleta(int velocidadInicial, int marchaInicial) { 
	marcha = marchaInicial; 
	velocidad = velocidadInicial; 
	} 
	//m�todos 
	public void setMarcha(int nuevoValor) { 
	marcha = nuevoValor; 
	} 
	 
	public void frenar(int decremento) { 
	velocidad -= decremento; 
	} 
	 
	public void acelerar(int incremento) { 
	velocidad += incremento; 
	} 

}
