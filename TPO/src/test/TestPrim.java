package test;

import modelo.*;
import interfaces.*;

import java.util.*;

public class TestPrim {
	
	public static void main(String[] args) {
        // Creamos el grafo
        IGrafo grafo = new Grafo();

        // Creamos los nodos (satélites y Tierra)
        INodo s1 = new Nodo("S1");
        INodo s2 = new Nodo("S2");
        INodo s3 = new Nodo("S3");
        INodo s4 = new Nodo("S4");
        INodo s5 = new Nodo("S5");
        INodo t  = new Nodo("T"); // Tierra

        // Agregamos aristas con latencias (en milisegundos)
        grafo.agregarArista(s1, s2, 3);
        grafo.agregarArista(s1, t, 8);
        grafo.agregarArista(s2, t, 7);
        grafo.agregarArista(s3, t, 2);
        grafo.agregarArista(s4, t, 6);
        grafo.agregarArista(s5, t, 4);
        grafo.agregarArista(s3, s4, 5);
        
        // Ejecutamos el algoritmo de Prim comenzando desde Tierra (T)
        IAlgoritmoPrim prim = new AlgoritmoPrim();
        Set<IArista> mst = prim.ejecutar(grafo, t);
        
        System.out.println("Árbol de expansión mínima desde T:");
        double total = 0;
        for (IArista a : mst) {
        	System.out.println("");
            System.out.println(a);
            total += a.getPeso();
        }

        // Mostramos la latencia total mínima
        System.out.printf("\nLatencia total: %.2f ms%n", total);
        
 
    }

}
