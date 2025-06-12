package modelo;

import interfaces.INodo;
import interfaces.IPersona;

public class Nodo implements INodo {
	
	private IPersona persona;
	private INodo izquierdo;
	private INodo derecho;
	
	
	
	public Nodo(IPersona p) {
		super();
		this.persona = p;
		this.izquierdo = null;
		this.derecho = null;
	}


	
	public IPersona getPersona() {
		return persona;
	}



	public void setPersona(IPersona persona) {
		this.persona = persona;
	}



	public INodo getIzquierdo() {
		return izquierdo;
	}



	public void setIzquierdo(INodo izquierdo) {
		this.izquierdo = izquierdo;
	}



	public INodo getDerecho() {
		return derecho;
	}



	public void setDerecho(INodo derecho) {
		this.derecho = derecho;
	}
	
	
	
	
	
	

}
