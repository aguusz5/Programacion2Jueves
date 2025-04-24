package interfaces;

public interface INodo {
	
	public IVehiculo getDato();
	public void setDato(IVehiculo dato);
	public INodo getSiguiente();
	public void setSiguiente(INodo siguiente);
	public INodo getAnterior();
	public void setAnterior(INodo anterior);
	public String toString();
	
	
	
	
	

}
