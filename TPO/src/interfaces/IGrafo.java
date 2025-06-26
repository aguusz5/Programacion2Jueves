package interfaces;


import java.util.List;
import java.util.Set;

public interface IGrafo {
	
	void agregarNodo(INodo nodo);
    void agregarArista(INodo origen, INodo destino, double peso);
    List<IArista> obtenerAdyacentes(INodo nodo);
    Set<INodo> obtenerNodos();
    public void matrizDeAdyacencia(List<INodo> nodos) ;

}
