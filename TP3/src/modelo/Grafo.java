package modelo;

import java.util.Map;
import java.util.HashMap;
import interfaces.IGrafo;
import interfaces.INodo;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Grafo<T> implements IGrafo<T>{
	
	private Map<T, Nodo<T>> nodos;
	
	public Grafo() {
		this.nodos= new HashMap<>();
	}
	
	
	public void agregarNodo(T dato) {
		if (!nodos.containsKey(dato)) {
			nodos.put(dato, new Nodo<>(dato));	
		}
	}
	
	
	public void añadirArista(T origen, T destino) {
		if(nodos.containsKey(origen) && nodos.containsKey(destino)){
			Nodo<T> nodoOrigen= nodos.get(origen);
			Nodo<T> nodoDestino = nodos.get(destino);
			nodoOrigen.agregarVecino(nodoDestino);
			nodoDestino.agregarVecino(nodoOrigen);
		}
	}
	
	public void mostrarMatrizAdyacencia() {
		System.out.println("Matriz de adyacencia: ");
		List<T> claves = new ArrayList<>(nodos.keySet());
		for (T origen : claves) {
	        for (T destino : claves) { // Doble bucle para simular la matriz
	            INodo<T> nodoOrigen = nodos.get(origen); //Busca el nodo origen
	            boolean conectado = nodoOrigen.getVecinos() // devuelve una lista de vecinos del nodo origen.
	                                          .stream() //convierte esa lista en un flujo.
	                                          .anyMatch(vecino -> vecino.getDato().equals(destino)); // revisa si algún vecino tiene como dato el valor destino
	            System.out.print((conectado ? "1 " : "0 "));
	        }
	        System.out.println(); // Salto de línea al terminar la fila
	    }
		
	}
	
	public void bfs(T inicio) {
		
		if (!nodos.containsKey(inicio)) return; 
		
		Set<T> visitados = new HashSet<>();
		Queue<INodo<T>> cola = new LinkedList<>();
		
		Nodo<T> nodoInicio = nodos.get(inicio);
		cola.add(nodoInicio);
		visitados.add(inicio);
		System.out.println( "Recorrido BFS del grafo: ");
		while (!cola.isEmpty()){
			INodo<T> actual = cola.poll();
			System.out.print(actual.getDato() + "" );
			for (INodo<T> vecino : actual.getVecinos()) {
			    T datoVecino = vecino.getDato();
			    if (!visitados.contains(datoVecino)) {
			        visitados.add(datoVecino);
			        cola.add(vecino); 
			    }
			}

		}
		System.out.println();
	}
	
	
	public void dfs(T inicio) {
		if (!nodos.containsKey(inicio)) return;
		Set<T> visitados = new HashSet<>();
		System.out.println(" Recorrido DFS del grafo: ");
		dfsRec(nodos.get(inicio), visitados);
		System.out.println();
	}
	
	private void dfsRec(INodo<T> actual, Set<T> visitados) {
		visitados.add(actual.getDato());
		System.out.print(actual.getDato());
		List<INodo<T>> vecinos = actual.getVecinos();
		for (int i = vecinos.size() - 1; i >= 0; i--) {
			INodo<T> vecino = vecinos.get(i);
			if (!visitados.contains(vecino.getDato())) {
				dfsRec( vecino, visitados);
			}
		}
	}

}
