package interfaces;


public interface IPersona {
	
	public int getDni();
	public void setDni(int dni);
	public String getNombre() ;
	public void setNombre(String nombre);
	public IListaAutos getListaVehiculos();
	public void setListaVehiculos(IListaAutos listaVehiculos);
	public void mostrarPersona() ;
	public String toString();

}
