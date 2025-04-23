package test;

import modelo.Persona;
import modelo.Vehiculo;

public class TestLista {
	
	public static void main(String[]args) {
		
		Persona p = new Persona (47180937, "Agus Leal"); // Se crea la lista nula
		Vehiculo v = new Vehiculo ("31AE345", "Ford Ranger");
		Vehiculo a = new Vehiculo ("98BR344", "Fiat Toro");
		Vehiculo b = new Vehiculo ("11AR111", "Bugatti Veyron");
		
		p.getListaVehiculos().agregarPrimero(v);		
		p.getListaVehiculos().agregarPrimero(a);
		p.getListaVehiculos().agregarUltimo(b);
		
		p.mostrarPersona();
		
		System.out.println(p.getListaVehiculos().cantidadElementos());
		
		System.out.println(p.getListaVehiculos().obtenerGenerico(1));
		
		p.getListaVehiculos().imprimirDesdeFinal();

		p.getListaVehiculos().eliminarPrimero();
		
		p.mostrarPersona();
		
		p.getListaVehiculos().imprimirDesdeFinal();

		p.getListaVehiculos().insertarAntesDe("11AR111", new Vehiculo("28TY382", "Toyota Corolla"));
		
		p.mostrarPersona();

		

		

		
		
		
		
		
		
		
		
		
	}

}
