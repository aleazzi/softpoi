package test;
import org.junit.Test;
import static org.junit.Assert.*;
import src.*;

public class testBusqueda {

	@Test
	public void testBusquedadeString() {
		System.out.println("Iniciando testBusquedadeString");
		System.out.println("------------------------------");
		
		
		Servicio servca = new Servicio();
		servca.setServicio("apertura de caja de ahorro");
		Servicio servcc = new Servicio();
		servcc.setServicio("apertura de cuenta corriente");
		
		Servicio servcasamiento = new Servicio();
		servcasamiento.setServicio("Casamientos por civil");
		
		Banco bancoFrances = new Banco("BANCO FRANCES", -34.603075, -58.381653);
		bancoFrances.setServicios(servca);
		bancoFrances.setServicios(servcc);

		Banco bancoNacion = new Banco("BANCO NACION", -34.603075, -58.381653);
		bancoNacion.setServicios(servca);

		ParadaColectivo parada1 = new ParadaColectivo("Parada 59 Las Heras y Billingurst", -34.5832488, -58.4042595);
		ParadaColectivo parada2 = new ParadaColectivo("Parada 10 Las Heras y Ocampo", -34.5831289, -58.40384);
		
		Comercio comercio1 = new Comercio("ResTaurant CAballitoNAC", 15, 25, new Rubro("Restaurante", 900));
		Comercio comercio2 = new Comercio("Restaurant OTRO REST.lanus", 15, 25, new Rubro("Restaurante", 900));
		
		CGP cgp1 = new CGP("Palermo", 55, 54);
		cgp1.setServicios(servcasamiento);
		
		Servidor servidor = new Servidor();
		servidor.cargarPOI(bancoFrances);
		servidor.cargarPOI(bancoNacion);
		servidor.cargarPOI(parada1);
		servidor.cargarPOI(parada2);
		servidor.cargarPOI(comercio1);
		servidor.cargarPOI(comercio2);
		servidor.cargarPOI(cgp1);
		
		String cadenaabuscar = new String("cAsaM");
		System.out.println("Los POI que machean con la condicion " + cadenaabuscar + " son:" );
		for(POI unpoi : servidor.buscaPOI(cadenaabuscar)){
			System.out.println(unpoi.getNombre());
		}
		
		
		//assertEquals("Esta Disponible (apertura de cuenta corriente): ", true, bancoFrances.estaDisponible("apertura de cuenta corriente", FechayHora.fechaHoy(), FechayHora.horaHoy()));
		System.out.println("Test Finalizado !");
	}

}
