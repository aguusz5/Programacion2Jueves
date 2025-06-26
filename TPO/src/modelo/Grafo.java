package modelo;

import interfaces.*;
import java.util.*;

public class Grafo implements IGrafo{
	private final Map<INodo, List<IArista>> adyacencias = new HashMap<>();
	
	@Override
    public void agregarNodo(INodo nodo) {
        adyacencias.putIfAbsent(nodo, new ArrayList<>());
	}
	
	@Override
    public void agregarArista(INodo origen, INodo destino, double peso) {
        agregarNodo(origen);
        agregarNodo(destino);
        adyacencias.get(origen).add(new Arista(origen, destino, peso));
        adyacencias.get(destino).add(new Arista(destino, origen, peso)); // Grafo no dirigido, se agrega de una lado hacia otro
    }

    @Override
    public List<IArista> obtenerAdyacentes(INodo nodo) {
        return adyacencias.getOrDefault(nodo, Collections.emptyList());
    }

    @Override
    public Set<INodo> obtenerNodos() {
        return adyacencias.keySet();
    }
    
    @Override
    public void matrizDeAdyacencia(List<INodo> nodos) {
        int n = nodos.size();
        double[][] matriz = new double[n][n];

        // Inicializamos con -1 (sin conexión)
        for (int i = 0; i < n; i++) {
            Arrays.fill(matriz[i], -1);
        }

        // Llenamos con los pesos reales
        for (INodo nodo : nodos) {
            List<IArista> adyacentes = obtenerAdyacentes(nodo);
            for (IArista arista : adyacentes) {
                int i = nodos.indexOf(arista.getOrigen());
                int j = nodos.indexOf(arista.getDestino());
                matriz[i][j] = arista.getPeso();
            }
        }

        // Imprimimos encabezado
        System.out.print("     ");
        for (INodo nodo : nodos) {
            System.out.printf("%5s", nodo.getNombre());
        }
        System.out.println();

        // Imprimimos filas
        for (int i = 0; i < n; i++) {
            System.out.printf("%5s", nodos.get(i).getNombre());
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == -1)
                    System.out.printf("%5s", "∞");
                else
                    System.out.printf("%5.0f", matriz[i][j]);
            }
            System.out.println();
        }
    }


}
