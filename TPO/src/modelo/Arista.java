package modelo;

import interfaces.IArista;
import interfaces.INodo;

public class Arista implements IArista {
	
	private final INodo origen;
    private final INodo destino;
    private final double peso; // double permite valores con decimales
    
    
	public Arista(INodo origen, INodo destino, double peso) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.peso = peso;
	}


	public INodo getOrigen() {
		return origen;
	}


	public INodo getDestino() {
		return destino;
	}


	public double getPeso() {
		return peso;
	}
	
	@Override
    public int compareTo(IArista otra) {
        return Double.compare(this.peso, otra.getPeso());
    }

	@Override
	public String toString() {
	    return String.format("%s -- %.1f ms --> %s",
	            origen.getNombre(), peso, destino.getNombre());
	}
}
