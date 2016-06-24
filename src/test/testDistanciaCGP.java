package test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import src.DispositivoConsulta;
import src.Comuna;
import src.CGP;


public class testDistanciaCGP {
	
@Test
	
	public void methDistanciaCGP() {
	
		System.out.println("Iniciando testDistancia Dispositivo - POI tipo CGP");
	
		//creo DispositivoConsulta
		DispositivoConsulta dispositivo2 = new DispositivoConsulta("disp Flores2", 100.0, 150.0, "Flores Norte");
		
		//creo una Comuna para el CGP
		Comuna comunaFlores = new Comuna (50.0, 250.0, 100.0, 300.0);
		
		//creo un POI CGP de prueba
		CGP cgpFlores = new CGP("CGP Flores",200.0,250.0);
		cgpFlores.setComuna(comunaFlores);
		
		assertEquals("Verificamos que el CGP este cerca del dispositivo", true, dispositivo2.estaCercaMio(cgpFlores));
		//System.out.println(dispositivo1.estaCercaMio(callaoCordoba132));
}
}
