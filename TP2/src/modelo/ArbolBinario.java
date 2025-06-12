package modelo;

import interfaces.IArbolBinario;
import interfaces.INodo;
import interfaces.IPersona;

public class ArbolBinario implements IArbolBinario{
	
	private INodo raiz;

	public ArbolBinario() {
		this.raiz = null;
	}
	
	
	
	
	
	
	@Override
	public void insertar(IPersona p) {
		raiz= insertarPer(raiz, p);
	}
	
	
	
	private INodo insertarPer(INodo nodoRaiz, IPersona p) {
		if(nodoRaiz == null) {
			return new Nodo(p);
		}

	    if (p.compareTo(nodoRaiz.getPersona()) < 0) {
	        nodoRaiz.setIzquierdo(insertarPer(nodoRaiz.getIzquierdo(), p));
	    } else {
	        nodoRaiz.setDerecho(insertarPer(nodoRaiz.getDerecho(), p));
	    }

	    return nodoRaiz;
	}
	
	
	@Override
	public void preorden() {
		preordenRec(raiz);
	}
	
	
	private void preordenRec(INodo nodo) {
		if (nodo != null) {
			System.out.println(nodo.getPersona()+ "");
			preordenRec(nodo.getIzquierdo());
			preordenRec(nodo.getDerecho());
		}
	}
	
	@Override
	public void inorden() {
		inordenRec(raiz);
	}
	
	
	private void inordenRec(INodo nodo) {
		if (nodo != null) {
			inordenRec(nodo.getIzquierdo());
			System.out.println(nodo.getPersona()+ "");
			inordenRec(nodo.getDerecho());
		}
	}
	
	@Override
	public void postorden() {
		postordenRec(raiz);
	}
	
	
	private void postordenRec(INodo nodo) {
		if (nodo != null) {
			postordenRec(nodo.getIzquierdo());
			postordenRec(nodo.getDerecho());
			System.out.println(nodo.getPersona()+ "");
		}
	}
	
	@Override
	public INodo buscarPersona(String nombre, String dni) {
		IPersona p = new Persona(nombre, dni);
		return buscarPersonaRec(raiz,p);
	}
	
	private INodo buscarPersonaRec(INodo nodo, IPersona p) {
	    if (nodo == null || nodo.getPersona().equals(p)) {
	        return nodo;
	    }
	    if (p.compareTo(nodo.getPersona()) < 0) {
	        return buscarPersonaRec(nodo.getIzquierdo(), p);
	    } else {
	        return buscarPersonaRec(nodo.getDerecho(), p);
	    }
	}
	
	
	public INodo eliminar(String nombre, String dni) {
		IPersona p = new Persona(nombre, dni);
		return raiz = eliminarRec(raiz, p);
	}
	
	
	private INodo eliminarRec(INodo n, IPersona p) {
		if (n == null) return null;
		
		if((p.compareTo(n.getPersona()) < 0)) {
			n.setIzquierdo(eliminarRec(n.getIzquierdo(),p));
		}else if((p.compareTo(n.getPersona()) > 0)){
			n.setDerecho(eliminarRec(n.getDerecho(),p));
		}else {
			// No tiene hijos, los dos nodos asociados son nulos
			if (n.getIzquierdo() == null && n.getDerecho()== null  ) {
				return null;
			}
			// Tiene un solo hijo
			if (n.getIzquierdo() == null) { //Tiene un hijo a la derecha
				return n.getDerecho();
			}
			if(n.getDerecho() == null) { //Tiene un hijo a la izquierda
				return n.getIzquierdo();
			}
			
			//Tiene dos hijos
			
			INodo heredero = encontrarMin(n.getDerecho());
			n.setPersona(heredero.getPersona());
			n.setDerecho(eliminarRec(n.getDerecho(), heredero.getPersona()));
		}
		return n;
	}
	
	private INodo encontrarMin(INodo n) {
		while (n.getIzquierdo()!= null) {
			n = n.getIzquierdo();
		}
		return n;
	}
	
	
	
	
	




}
	
	

