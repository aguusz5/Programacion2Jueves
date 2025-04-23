package modelo;

public class ListaAutos {
	
	// Atributos
	private Nodo primero;

	public boolean estaVacia() {
		
		return primero == null;
	}
	
	
	public void agregarPrimero(Vehiculo d) {
		Nodo nuevoNodo = new Nodo(d);
		if(estaVacia()== false) {
			nuevoNodo.setSiguiente(this.primero);
			primero.setAnterior(nuevoNodo);
			this.primero= nuevoNodo;
			
		}else {
			this.primero= nuevoNodo;
		}
		
		
	}
	
	
	public void mostrarLista() {
		
		Nodo actual = primero;
		while (actual != null) {
			// getDato--- del nodo--- vehiculo!!!!
			System.out.print(actual.getDato()+"\n");
			actual = actual.getSiguiente();		}
		
	}
	
	
	
	
	public void agregarUltimo(Vehiculo d) {
		Nodo nuevoNodo= new Nodo(d);
		
		if (!estaVacia()) {
			Nodo actual= this.primero;
			
			while(actual.getSiguiente()!= null) {
				
				actual= actual.getSiguiente();
				
			}
			
			actual.setSiguiente(nuevoNodo);
			nuevoNodo.setAnterior(actual);
			}
			
			
		}
		
		
		
	public int cantidadElementos() {
		if(estaVacia()) {
			return 0;
		}else {
			int cantidad = 1;
			Nodo actual= this.primero;
			while(actual.getSiguiente()!=null) {
				actual = actual.getSiguiente();
				cantidad++;
			}
			return cantidad;
		
		}
	}
	
	public Vehiculo obtenerGenerico(int pos) {
		if(!estaVacia() && pos <cantidadElementos()) {
			int contador= 0;
			Nodo actual= this.primero;
			while(contador!=pos) {
				actual = actual.getSiguiente();
				contador ++;
			}
			return actual.getDato();
		}else {
			System.out.println("La lista esta vacia o la posicion est fuera de rango");
			return null;
		}
	
	}
	
	
	public Vehiculo eliminarPrimero() {
		if(!estaVacia()) {
			Vehiculo datoEliminar= primero.getDato();
			primero= primero.getSiguiente();
			primero.setAnterior(null);
			return datoEliminar;
			
		}else {
			return null;
		}
	}
	
	public void imprimirDesdeFinal() {
		if(!estaVacia()) {
			Nodo actual = primero;
			while(actual.getSiguiente()!= null) {
				
				actual = actual.getSiguiente();
			}
			System.out.println("Lista desde atras hacia adelante");
			while(actual != null) {
				System.out.print("["+actual.getDato()+"]");
				if(actual.getAnterior() != null) {
					System.out.print("<-->");
				}
				actual = actual.getAnterior();
			}
		}	
	}

	public void insertarAntesDe(String patenteReferencia, Vehiculo nuevoVehiculo) {
		if(!estaVacia()) {
			
			Nodo actual = primero;
			
			while(actual != null) {
				Vehiculo vehiculoActual= (Vehiculo) actual.getDato();
				if(vehiculoActual.getPatente() == patenteReferencia) {
					Nodo nuevoNodo = new Nodo(nuevoVehiculo);
					if(actual == primero) {
						primero.setAnterior(nuevoNodo);
						nuevoNodo.setSiguiente(primero);
						primero= nuevoNodo;
					}else {
						Nodo anterior = actual.getAnterior();
						anterior.setSiguiente(nuevoNodo);
						nuevoNodo.setAnterior(anterior);
						nuevoNodo.setSiguiente(actual);
						actual.setAnterior(nuevoNodo);
					}
					System.out.println("El auto se inserto antes de la patente: " + patenteReferencia);
					return;
				}
				actual = actual.getSiguiente();
				
			}
			
		    System.out.println("No se encontró un auto con la patente: " + patenteReferencia);
		}
	}
	
	
		
	
	
	
	//-----------------------------------------------------------------------------------------//
	
	
	
	

	
	public Nodo getPrimero() {
		return primero;
	}

	public void setPrimero(Nodo primero) {
		this.primero = primero;
	}

	public ListaAutos(Nodo primero) {
		super();
		this.primero = primero;
	}
	
	//lista vacia
	public ListaAutos() {
		super();
		this.primero = null;
	}

	
	
	@Override
	public String toString() {
		return "ListaAutos [primero=" + primero + "]";
	}
	
	
	
	

}
