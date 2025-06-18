package interfaces;

public interface IGrafo<T> {
	
	public void agregarNodo(T dato);
	public void añadirArista(T origen, T destino);
	public void mostrarMatrizAdyacencia();
	public void bfs(T inicio) ;
	public void dfs(T inicio) ;

}
