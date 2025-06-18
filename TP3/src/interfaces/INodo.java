package interfaces;

import java.util.List;


public interface INodo<T> {
	
	 public T getDato();
	 public void setDato(T dato);
	 public void agregarVecino(INodo<T> vecino);
	 public List<INodo<T>> getVecinos();
	 
	
	

}
