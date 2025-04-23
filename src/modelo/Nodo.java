package modelo;

public class Nodo {
	
	//Atributos
	private Vehiculo dato;
	private Nodo siguiente;
	private Nodo anterior;
	
	
	public Vehiculo getDato() {
		return dato;
	}



	public void setDato(Vehiculo dato) {
		this.dato = dato;
	}



	public Nodo getSiguiente() {
		return siguiente;
	}



	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}



	public Nodo getAnterior() {
		return anterior;
	}



	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}



	public Nodo(Vehiculo dato) {
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
