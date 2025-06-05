package modelo;

import interfaces.INodo;
import interfaces.IVehiculo;

public class Nodo implements INodo{
	
	//Atributos
	private IVehiculo dato;
	private INodo siguiente;
	private INodo anterior;
	
	
	public IVehiculo getDato() {
		return dato;
	}



	public void setDato(IVehiculo dato) {
		this.dato = dato;
	}



	public INodo getSiguiente() {
		return siguiente;
	}



	public void setSiguiente(INodo nodo) {
		this.siguiente = nodo;
	}



	public INodo getAnterior() {
		return anterior;
	}



	public void setAnterior(INodo nodo) {
		this.anterior = nodo;
	}



	public Nodo(IVehiculo dato) {
		super();
		this.dato = dato;
		this.siguiente = null;
		this.anterior = null;
	}
	
	
	
	@Override
	public String toString() {
	    String sig = (siguiente != null) ? siguiente.getDato() : "null";
	    String ant = (anterior != null) ? anterior.getDato() : "null";
	    return "Nodo{dato=" + dato + ", siguiente=" + sig + ", anterior=" + ant + "}";
	}
	
	
	
	
	
	
	
	

}
