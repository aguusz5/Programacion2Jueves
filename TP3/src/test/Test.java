package test;

import interfaces.IGrafo;
import modelo.Grafo;
import modelo.Persona;

public class Test {
	
	public static void main(String[] args) {
		
		IGrafo<Persona> grafo = new Grafo<>();

        Persona agustin = new Persona("agustin", 30);
        Persona franco = new Persona("franco", 25);
        Persona rodriguez = new Persona("rodriguez", 28);

        grafo.agregarNodo(agustin);
        grafo.agregarNodo(franco);
        grafo.agregarNodo(rodriguez);

        grafo.añadirArista(agustin, franco);
        grafo.añadirArista(franco, rodriguez);
        grafo.añadirArista(rodriguez, agustin);

        System.out.println("\n--- Matriz de Adyacencia ---");
        grafo.mostrarMatrizAdyacencia();

        System.out.println("\n--- BFS desde Alice ---");
        grafo.bfs(agustin);

        System.out.println("\n--- DFS desde Alice ---");
        grafo.dfs(agustin);
	}
}
