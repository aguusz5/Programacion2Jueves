package interfaces;

import modelo.Nodo;
import modelo.Vehiculo;

public interface IListaAutos {
	
	public Nodo getPrimero();
	public void setPrimero(Nodo primero);
	public String toString();
	
	
	// agregar
	public void agregarUltimo(Vehiculo d);
	public void agregarPrimero(Vehiculo d);
	
	//eliminar
	public int eliminarPrimero(); 
	
	//obtener elemento, solo visualizarlo
	public int obtenerGenerico(int pos);
	
	// extras
	public void mostrarLista();
	public int cantidadElementos();
	public void imprimirDesdeFinal() ;
	public void insertarAntesDe(String patenteReferencia, Vehiculo nuevoVehiculo);
	
}
