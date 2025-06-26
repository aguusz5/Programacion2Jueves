package test;

import modelo.*;
import interfaces.*;

import java.util.*;

public class TestMatriz {
	public static void main(String[] args) {
        IGrafo grafo = new Grafo();

        INodo s1 = new Nodo("S1");
        INodo s2 = new Nodo("S2");
        INodo s3 = new Nodo("S3");
        INodo s4 = new Nodo("S4");
        INodo s5 = new Nodo("S5");
        INodo t  = new Nodo("T");

        grafo.agregarArista(s1, s2, 3);
        grafo.agregarArista(s1, t, 8);
        grafo.agregarArista(s2, t, 7);
        grafo.agregarArista(s3, t, 2);
        grafo.agregarArista(s4, t, 6);
        grafo.agregarArista(s5, t, 4);
        grafo.agregarArista(s3, s4, 5);
        
        List<INodo> nodos = Arrays.asList(s1, s2, s3, s4, s5, t);
        System.out.println("\nMatriz de adyacencia desde Grafo:");
        grafo.matrizDeAdyacencia(nodos);
		
	}

}
