package modelo;

import interfaces.IAlgoritmoPrim;
import interfaces.IArista;
import interfaces.INodo;
import interfaces.IGrafo;



import java.util.*;

public class AlgoritmoPrim implements IAlgoritmoPrim{
	
	@Override
    public Set<IArista> ejecutar(IGrafo grafo, INodo inicio) {
        Set<INodo> visitados = new HashSet<>(); // Guarda los nodos ya incluidos en el arbol
        Set<IArista> resultado = new HashSet<>(); // Guarda las arista que forman el arbol de expansion minima
        PriorityQueue<IArista> cola = new PriorityQueue<>(); // Es la cola que nos da la arista con menor latencia posible

        visitados.add(inicio);
        cola.addAll(grafo.obtenerAdyacentes(inicio));

        while (!cola.isEmpty()) { // Mientras queden aristas por recorrer
            IArista arista = cola.poll(); // extraemos a la arista de menor latencia
            INodo destino = arista.getDestino(); // conseguimos el nodo de destino de la arista

            if (!visitados.contains(destino)) { // Si el nodo no esta en el arbol
                visitados.add(destino); // lo visitamos 
                resultado.add(arista); // añadimos la arista

                for (IArista ady : grafo.obtenerAdyacentes(destino)) { // Para cada arista que sale del nodo visitado
                    if (!visitados.contains(ady.getDestino())) { // Si el nodo al que conecta no lo visitamos
                        cola.add(ady); // La agregamos a la cola de prioridad de aristas
                    }
                }
            }
        }

        return resultado;
    }
	
	
	

}
