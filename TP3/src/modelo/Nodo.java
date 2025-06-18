package modelo;

import java.util.ArrayList;
import java.util.List;

import interfaces.INodo;




public class Nodo<T> implements INodo<T> {
	
	private T dato;
    private List<INodo<T>> vecinos;

    public Nodo(T dato) {
        this.dato = dato;
        this.vecinos = new ArrayList<>();
    }

    
    public T getDato() {
        return dato;
    }


    public void setDato(T dato) {
        this.dato = dato;
    }


    public void agregarVecino(INodo<T> vecino) {
    	if (!vecinos.contains(vecino)) {
        	vecinos.add(vecino);
    	}
    }

    
    public List<INodo<T>> getVecinos() {
        return vecinos;
    }


	@Override
	public String toString() {
		return "Nodo [dato=" + dato + ", vecinos=" + vecinos + "]";
	}
    
    
}