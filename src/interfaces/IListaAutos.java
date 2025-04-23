package interfaces;

import modelo.Nodo;

public interface IListaAutos {
	
	public Nodo getPrimero();
	public void setPrimero(Nodo primero);
	public String toString();
	
	
	// agregar
	public void agregarUltimo(int d); // Cola - Pila
	public void agregarPrimero(int d);
	public void agregarGenerico(int d, int pos);
	
	//eliminar
	public int eliminar(int pos);
	public int eliminarPrimero(); // Cola
	public int eliminarUltimo();// Pila
	
	//obtener elemento, solo visualizarlo
	public int obtenerPrimero();// Cola
	public int obtenerUltimo();//Pila
	public int obtenerGenerico(int pos);
	
	
	
}
