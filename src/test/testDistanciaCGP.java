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
		DispositivoConsulta dispositivo2 = new DispositivoConsulta("disp Flores2", 0.350219707, 0.715584993, "Flores Norte");
		
		//creo una Comuna para el CGP
		Comuna comunaFlores = new Comuna (0.350219707, 0.52475748, 0.715584993, 0.698131701);
		
		//creo un POI CGP de prueba
		CGP cgpFlores = new CGP("CGP Flores",0.42475748,0.698131701);
		cgpFlores.setComuna(comunaFlores);
		
		assertEquals("Verificamos que el CGP este cerca del dispositivo", true, dispositivo2.estaCercaMio(cgpFlores));
		//System.out.println(dispositivo1.estaCercaMio(callaoCordoba132));
}
}
