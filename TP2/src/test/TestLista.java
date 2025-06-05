package test;

import modelo.Persona;
import modelo.Vehiculo;

public class TestLista {
	
	public static void main(String[]args) {
		
		Persona p = new Persona (47180937, "Agus Leal"); // Se crea la lista nula
		Vehiculo v = new Vehiculo ("AA303AU", "Ford Ranger");
		Vehiculo a = new Vehiculo ("AA375AF", "Fiat Toro");
		Vehiculo b = new Vehiculo ("AB867AN", "Bugatti Veyron");
		
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

		p.getListaVehiculos().insertarAntesDe("AB867AN", new Vehiculo("AD213AV", "Toyota Corolla"));
		
		p.mostrarPersona();
		
		p.getListaVehiculos().ordenarAutos();
		
		p.mostrarPersona();

		

		

		
		
		
		
		
		
		
		
		
	}

}
