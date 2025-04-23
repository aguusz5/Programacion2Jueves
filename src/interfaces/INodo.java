package interfaces;

import modelo.Nodo;
import modelo.Vehiculo;

public interface INodo {
	
	public Vehiculo getAuto();
	public void setAuto(Vehiculo dato);
	public Nodo getSiguiente();
	public void setSiguiente(Nodo siguiente);
	public Nodo getAnterior();
	public void setAnterior(Nodo anterior);
	public String toString();
	
	
	
	
	

}
