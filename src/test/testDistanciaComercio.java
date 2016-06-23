package test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.util.ArrayList;

import src.CGP;
import src.Comercio;
import src.Comuna;
import src.Rubro;
import src.POI;
import src.DispositivoConsulta;

public class testDistanciaComercio {

@Test
	
	public void testDistanciaCGP() {
	
	System.out.println("Iniciando testDistancia Dispositivo - POI tipo Comercio");
	
	//creo DispositivoConsulta
	DispositivoConsulta dispositivo3 = new DispositivoConsulta("disp Caballito1", 100.0, 150.0, "Caballito Norte");
	
	//creo un Rubro para el Comercio
	Rubro rubroMerceria = new Rubro ("Merceria", 400.0);
	
	//creo un POI Comercio de prueba
	Comercio merceriaJose = new Comercio("Merceria Jose",100.1,150.0,rubroMerceria);
	
	assertEquals("Verificamos que el Comercio este cerca del dispositivo", true, dispositivo3.estaCercaMio(merceriaJose));
	//System.out.println(super.rubroMerceria.distancia(dispositivo3.getLatitud(),dispositivo3.getLongitud(),rubroMerceria.latitud,rubroMerceria.longitud));
}
	
}
