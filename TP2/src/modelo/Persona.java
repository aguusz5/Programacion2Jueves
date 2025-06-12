package modelo;

import interfaces.IPersona;

public class Persona implements IPersona, Comparable<IPersona>{
	
	private String dni;
	private String nombre;
	
	public Persona( String nombre,String dni) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}

	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	
	@Override
	public int compareTo(IPersona otra) {
	    int comparacionNombre = this.nombre.compareTo(otra.getNombre());

	    if (comparacionNombre != 0) {
	        return comparacionNombre;
	    } else {
	        int dniThis = Integer.parseInt(this.dni);
	        int dniOtra = Integer.parseInt(otra.getDni());
	        return Integer.compare(dniThis, dniOtra);
	    }
	}

	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;

	    Persona otra = (Persona) obj;
	    return nombre.equals(otra.nombre) && dni.equals(otra.dni);
	}


	
	
	
	
	

}
