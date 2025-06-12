package interfaces;

public interface IPersona {

	public String getDni() ;
	public void setDni(String dni); 
	public String getNombre() ;
	public void setNombre(String nombre);
	public String toString();
	public int compareTo(IPersona otra);
	
	
	
}
