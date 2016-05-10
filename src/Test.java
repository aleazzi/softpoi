
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
		

	}

}
