import java.util.ArrayList;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Aca empieza la verdad de la milanga...");
		ParadaColectivo parada1 = new ParadaColectivo("",90.0f,91);
		System.out.println(parada1.estaDisponible());
		System.out.println(parada1.esValido());
		System.out.println(parada1.getClass());
		
		ParadaColectivo obelisco = new ParadaColectivo("Obelisco",-34.603075, -58.381653);
		ParadaColectivo plazamayo = new ParadaColectivo("Plaza de Mayo",-34.608333, -58.371944);
		
		System.out.println("esta a menos metros que el otro? = " + obelisco.estaAMenosDe(plazamayo, 1300));

	}

}
