package test;

import interfaces.IArbolBinario;
import interfaces.INodo;
import interfaces.IPersona;
import modelo.ArbolBinario;
import modelo.Persona;

public class TestBuscarPersona {
	public static void main(String[]args) {
		IArbolBinario arbol= new ArbolBinario();
		
		
		IPersona pe1 = new Persona("Agustin", "47180937");
		IPersona pe2 = new Persona("Valentin", "35543284");
		IPersona pe3 = new Persona("Fabian", "299399");
		IPersona pe4 = new Persona("Franco", "50898432");
		IPersona pe5 = new Persona("Franco", "36098231");
		IPersona pe6 = new Persona("Marcos", "209832134");
		IPersona pe7 = new Persona("Pedro", "5676893");
		IPersona pe8 = new Persona("Facundo", "13625486");
		IPersona pe9 = new Persona("Peter", "3890246");
		IPersona pe10 = new Persona("Francisco", "9012324");
		IPersona pe11 = new Persona("Oscar", "10648372");
		IPersona pe12 = new Persona("Pepe", "3456217");
		IPersona pe13 = new Persona("Pablo", "1000000");
		IPersona pe14 = new Persona("Daniela", "52716346");
		IPersona pe15 = new Persona("Francisca", "52716346");
		
		arbol.insertar(pe1);
		arbol.insertar(pe2);
		arbol.insertar(pe3);
		arbol.insertar(pe4);
		arbol.insertar(pe5);
		arbol.insertar(pe6);
		arbol.insertar(pe7);
		arbol.insertar(pe8);
		arbol.insertar(pe9);
		arbol.insertar(pe10);
		arbol.insertar(pe11);
		arbol.insertar(pe12);
		arbol.insertar(pe13);
		arbol.insertar(pe14);
		arbol.insertar(pe15);
		
		

		INodo buscar= arbol.buscarPersona("Marcos", "209832134");
		System.out.println(buscar != null ? "Persona encontrada: "+ buscar.getPersona() : "No se encontró");
		
	}
	

}
