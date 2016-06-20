package test;
import org.junit.Test;
import static org.junit.Assert.*;
	
import src.*;
import srcdeapoyo.FechayHora;


public class testComercio {

	@Test
	public void testPOIParadaColectivo() {

		System.out.println("Iniciando testPOIComercio");
		System.out.println("-------------------------");
				
		// *********************************************************************************************
		// Prueba de clase Comercio 
		// *********************************************************************************************
		Rubro restaurante = new Rubro("Restaurante", 15);
		RangoHorario rango1 = new RangoHorario("00:00:00", "23:59:59");
		Disponibilidad unDia = new Disponibilidad();
		unDia.setDia("LUNES");
		unDia.agregarRangoHorario(rango1);
		Servicio unServicio = new Servicio();
		unServicio.setServicio("apertura de caja de ahorro");
		unServicio.agregarDisponibilidad(unDia);

		
		
		Comercio comercio1 = new Comercio("Mc Donalls", -34.5836168,-58.4060661, restaurante);
		Comercio comercio2 = new Comercio("Caballito", -34.5836212,-58.4058086, restaurante);
		Comercio comercio3 = new Comercio("   ", -34.5836212,-58.4058086, restaurante);
		
		comercio1.setServicios(unServicio);

		System.out.println("comercio1.esValido()" + comercio1.esValido());
		System.out.println("comercio2.esValido()" + comercio2.esValido());
		System.out.println("comercio3.esValido()" + comercio3.esValido());
		
		
//		System.out.println("parada1.estaDisponible(...)" + parada1.estaDisponible("", FechayHora.fechaHoy() , FechayHora.horaHoy()));
//		System.out.println("parada2.estaDisponible(...)" + parada2.estaDisponible("", FechayHora.fechaHoy() , FechayHora.horaHoy()));
//		System.out.println("parada3.estaDisponible(...)" + parada3.estaDisponible("", FechayHora.fechaHoy() , FechayHora.horaHoy()));
//		System.out.println("parada4.estaDisponible(...)" + parada4.estaDisponible("", FechayHora.fechaHoy() , FechayHora.horaHoy()));
	
		assertEquals("comercio1.esValido(): ", true, comercio1.esValido());
		assertEquals("comercio2.esValido(): ", true, comercio2.esValido());
		assertEquals("comercio3.esValido(): ", false, comercio3.esValido());
		
//		assertEquals("parada1.estaDisponible(...): ", true, parada1.estaDisponible("", FechayHora.fechaHoy() , FechayHora.horaHoy()));
//		assertEquals("parada2.estaDisponible(...): ", true, parada2.estaDisponible("", FechayHora.fechaHoy() , FechayHora.horaHoy()));
//		assertEquals("parada3.estaDisponible(...): ", true, parada3.estaDisponible("", FechayHora.fechaHoy() , FechayHora.horaHoy()));
//		assertEquals("parada4.estaDisponible(...): ", true, parada4.estaDisponible("", FechayHora.fechaHoy() , FechayHora.horaHoy()));
		
		System.out.println("Test Finalizado !");
	}

}
