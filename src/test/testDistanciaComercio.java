package test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import src.Comercio;
import src.Rubro;
import src.DispositivoConsulta;

public class testDistanciaComercio {

@Test
	
	public void methDistanciaComercio() {
	
		System.out.println("Iniciando testDistancia Dispositivo - POI tipo Comercio");
	
		//creo DispositivoConsulta
		DispositivoConsulta dispositivo3 = new DispositivoConsulta("disp Caballito1", 0.350224555, 0.699552205, "Caballito Norte");
	
		//creo un Rubro para el Comercio
		Rubro rubroMerceria = new Rubro ("Merceria", 500.0);
	
		//creo un POI Comercio de prueba
		Comercio merceriaJose = new Comercio("Merceria Jose",0.350219707,0.699629775,rubroMerceria);
	
	
		assertEquals("Verificamos que el Comercio este cerca del dispositivo", true, dispositivo3.estaCercaMio(merceriaJose));
		//System.out.println(super.rubroMerceria.distancia(dispositivo3.getLatitud(),dispositivo3.getLongitud(),rubroMerceria.latitud,rubroMerceria.longitud));
}
	
}
