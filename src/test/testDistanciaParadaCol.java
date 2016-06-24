package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.DispositivoConsulta;
import src.ParadaColectivo;

public class testDistanciaParadaCol {

@Test
	
	public void methDistanciaParada() {
		System.out.println("Iniciando testDistancia Dispositivo - POI");
	
		//creo DispositivoConsulta
		DispositivoConsulta dispositivo1 = new DispositivoConsulta("disp Palermo1", 100.0, 150.0, "Palermo soho");
		
		//creo un POI de prueba
		ParadaColectivo callaoCordoba132 = new ParadaColectivo("132 Callao Cordoba",200.0,250.0);
		callaoCordoba132.setEmpresa("Nuevos Rumbos S.A.");
		callaoCordoba132.setNumeroDeLinea(132);
		System.out.println("tipo de POI:" + callaoCordoba132.tipoPOI());
		
		assertEquals("Verificamos que la parada este cerca del dispositivo", false, dispositivo1.estaCercaMio(callaoCordoba132));
		System.out.println(dispositivo1.estaCercaMio(callaoCordoba132));
		
		//assertEquals("callaoCordoba132.tipoPOI(): ", "ParadaColectivo", callaoCordoba132.tipoPOI());
		//estaAMenosDe(POI unPOI, double metros)
	}
	
}
