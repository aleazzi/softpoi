package test;
import org.junit.Test;

import src.POI;
import src.DispositivoConsulta;
import src.ParadaColectivo;

public class testDistancia {

	@Test
	
	public void testDistanciaParadaCGP() {
		System.out.println("Iniciando testDistancia Dispositivo - POI");
		
		//creo DispositivoConsulta
		DispositivoConsulta dispositivo1 = new DispositivoConsulta();
		dispositivo1.setLatitud(120.0);
		dispositivo1.setLongitud(100.0);
		dispositivo1.setZona("Palermo");
		
		//creo un POI de prueba
		ParadaColectivo callaoCordoba132 = new ParadaColectivo("132 Callao Cordoba",200.0,250.0);
		callaoCordoba132.setEmpresa("Nuevos Rumbos S.A.");
		callaoCordoba132.setNumeroDeLinea(132);
		
		
		//estaAMenosDe(POI unPOI, double metros)
	}
	
}
