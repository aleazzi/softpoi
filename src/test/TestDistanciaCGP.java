package test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import src.DispositivoConsulta;
import src.Comuna;
import src.CGP;


public class TestDistanciaCGP {
	
@Test
	
	public void methDistanciaCGP() {
	
		System.out.println("Iniciando testDistancia Dispositivo - POI tipo CGP");
	
		//creo DispositivoConsulta
		DispositivoConsulta dispositivo2 = new DispositivoConsulta("disp Flores2", 0.350219708, 0.715584992, "Flores Norte");
		System.out.println("dispositivo: " + dispositivo2.getNombre() + ", latitud: " + dispositivo2.getLatitud() + ", longitud: " + dispositivo2.getLongitud());

		//creo una Comuna para el CGP
		Comuna comunaFlores = new Comuna (0.350219707, 0.52475748, 0.698131701, 0.715584993);
		System.out.println("Comuna, limite Sur: " + comunaFlores.getLimSur() + ", Limite Norte: " + comunaFlores.getLimNorte() + ", Limite Este: " + comunaFlores.getLimEste() + ", Limite Oeste: " + comunaFlores.getLimOeste());		
				
		//creo un POI CGP de prueba
		CGP cgpFlores = new CGP("CGP Flores",0.36,0.70);
		cgpFlores.setComuna(comunaFlores);
		System.out.println(cgpFlores.tipoPOI()+ ": " + cgpFlores.getNombre() + ", latitud: " + cgpFlores.getLatitud() + ", longitud: " + cgpFlores.getLongitud());		
				
		assertEquals("Verificamos que el CGP este cerca del dispositivo", true, dispositivo2.estaCercaMio(cgpFlores));

}
}
