package interfaces;


public interface IArbolBinario {
	public void insertar(IPersona p);

	public void preorden();
	public void inorden() ;
	public void postorden();
	

	public INodo buscarPersona(String nombre, String dni);
	
	public INodo eliminar(String nombre, String dni);
}
