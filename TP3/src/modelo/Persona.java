package modelo;

public class Persona {
	
	private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    

    public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	@Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }

    
    
    // ayudan luego a comparar e indexar claves correctamente
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona p = (Persona) o;
        return this.nombre.equals(p.nombre) && this.edad == p.edad;
    }

    @Override
    public int hashCode() {
        return nombre.hashCode() + edad;
    }
}
