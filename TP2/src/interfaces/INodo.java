package interfaces;

import modelo.Persona;

public interface INodo {
	
	public IPersona getPersona();
	public void setPersona(IPersona persona);
	public INodo getIzquierdo();
	public void setIzquierdo(INodo izquierdo);
	public INodo getDerecho();
	public void setDerecho(INodo derecho);

}
