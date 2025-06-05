package modelo;


import interfaces.IListaAutos;
import interfaces.INodo;
import interfaces.IVehiculo;


public class ListaAutos implements IListaAutos{
	
	// Atributos
	private INodo primero;

	public boolean estaVacia() {
		
		return primero == null;
	}
	
	
	@Override
	public void ordenarAutos() {
		if (!estaVacia()) {
			
			boolean huboCambios= true;
			
			while ( huboCambios == true) {
				
				huboCambios= false;
				INodo actual = primero;
				
				while (actual.getSiguiente() != null) {
					
					IVehiculo v1= actual.getDato();
					IVehiculo v2= actual.getSiguiente().getDato();
					
					if (v1.getPatente().compareTo(v2.getPatente()) >0 ) {
						
						IVehiculo temp= actual.getDato();
						actual.setDato(actual.getSiguiente().getDato());
						actual.getSiguiente().setDato(temp);
						huboCambios= true;
					}
					
					actual = actual.getSiguiente();
				}
			
				
			}
			
			
			
		}else {
			System.out.println("La lista esta vacia");
			return;
		}
		
		
		
	}
	
	@Override
	public void agregarPrimero(IVehiculo d) {
		INodo nuevoNodo = new Nodo(d);
		if(estaVacia()== false) {
			nuevoNodo.setSiguiente(this.primero);
			primero.setAnterior(nuevoNodo);
			this.primero= nuevoNodo;
			
		}else {
			this.primero= nuevoNodo;
		}
		
		
	}
	
	@Override
	public void mostrarLista() {
		
		INodo actual = primero;
		while (actual != null) {
			// getDato--- del nodo--- vehiculo!!!!
			System.out.print(actual.getDato()+"\n");
			actual = actual.getSiguiente();		}
		
	}
	
	
	
	@Override
	public void agregarUltimo(IVehiculo d) {
		INodo nuevoNodo= new Nodo(d);
		
		if (!estaVacia()) {
			INodo actual= this.primero;
			
			while(actual.getSiguiente()!= null) {
				
				actual= actual.getSiguiente();
				
			}
			
			actual.setSiguiente(nuevoNodo);
			nuevoNodo.setAnterior(actual);
			}
			
			
		}
		
		
	@Override	
	public int cantidadElementos() {
		if(estaVacia()) {
			return 0;
		}else {
			int cantidad = 1;
			INodo actual= this.primero;
			while(actual.getSiguiente()!=null) {
				actual = actual.getSiguiente();
				cantidad++;
			}
			return cantidad;
		
		}
	}
	@Override
	public IVehiculo obtenerGenerico(int pos) {
		if(!estaVacia() && pos <cantidadElementos()) {
			int contador= 0;
			INodo actual= this.primero;
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
	
	@Override
	public IVehiculo eliminarPrimero() {
		if(!estaVacia()) {
			IVehiculo datoEliminar= primero.getDato();
			primero= primero.getSiguiente();
			primero.setAnterior(null);
			return datoEliminar;
			
		}else {
			return null;
		}
	}
	@Override
	public void imprimirDesdeFinal() {
		if(!estaVacia()) {
			INodo actual = primero;
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
	@Override
	public void insertarAntesDe(String patenteReferencia, IVehiculo nuevoVehiculo) {
		if(!estaVacia()) {
			
			INodo actual = primero;
			
			while(actual != null) {
				IVehiculo vehiculoActual= (IVehiculo) actual.getDato();
				if(vehiculoActual.getPatente() == patenteReferencia) {
					INodo nuevoNodo = new Nodo(nuevoVehiculo);
					if(actual == primero) {
						primero.setAnterior(nuevoNodo);
						nuevoNodo.setSiguiente(primero);
						primero= nuevoNodo;
					}else {
						INodo anterior = actual.getAnterior();
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
	
	
	
	

	
	public INodo getPrimero() {
		return primero;
	}

	public void setPrimero(INodo primero) {
		this.primero = primero;
	}

	public ListaAutos(INodo primero) {
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
