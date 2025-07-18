package modelo;


import interfaces.IPersona;
import interfaces.IListaAutos;

public class Persona implements IPersona {
	
	
	private int dni;
	private String nombre;
	// La persona debe estar anidada a los vehiculos, lo hacemos por medio de una lista
	private IListaAutos listaVehiculos;
	
	
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public IListaAutos getListaVehiculos() {
		return listaVehiculos;
	}
	public void setListaVehiculos(IListaAutos listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}
	
	
	
	public Persona(int dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.listaVehiculos = new ListaAutos();// Solo se crea la lista FUNDAMENTAL CONSTRUIR LA LISTA
	}
	
	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	} // Pongo solo los datos de la persona porque los de el vehiculo estan en ese tostring
	
	public void mostrarPersona() {
		
		System.out.println(this);
		listaVehiculos.mostrarLista();
	}
	
	
	
	
	

}
