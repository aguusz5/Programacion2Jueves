package modelo;

import interfaces.INodo;

public class Nodo implements INodo{
	
	private final String nombre; // usamos final ya que el nombre del nodo no se debe cambiar, siempre será el mismo. Ej: "Tierra"

	public Nodo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Nodo [nombre=" + nombre + "]";
	}
	
	@Override
    public boolean equals(Object obj) { //Compara si dos objetos son iguales por contenido
        if (this == obj) return true;
        if (!(obj instanceof INodo)) return false;
        INodo other = (INodo) obj;
        return this.nombre.equals(other.getNombre());
    }

    @Override
    public int hashCode() {  // Asigna un número que represente al objeto (clave en mapas)
        return nombre.hashCode();
    }
    
	
	

}
