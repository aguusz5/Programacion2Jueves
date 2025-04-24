package interfaces;


public interface IListaAutos {
	
	public INodo getPrimero();
	public void setPrimero(INodo primero);
	public String toString();
	
	
	// agregar
	public void agregarUltimo(IVehiculo d);
	public void agregarPrimero(IVehiculo d);
	
	//eliminar
	public IVehiculo eliminarPrimero(); 
	
	//obtener elemento, solo visualizarlo
	public IVehiculo obtenerGenerico(int pos);
	
	// extras
	public void mostrarLista();
	public int cantidadElementos();
	public void imprimirDesdeFinal() ;
	public void insertarAntesDe(String patenteReferencia, IVehiculo nuevoVehiculo);
	public void ordenarAutos();
	
}
