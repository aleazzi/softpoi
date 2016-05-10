
public class ParadaColectivo extends POI {
	private String empresa;
	private int numeroDeLinea;
	
	public ParadaColectivo(String nombre, float latitud, float longitud) {
		super.nombre = nombre;
		super.latitud = latitud;
		super.longitud = longitud;		
	}
	public Boolean estaDisponible(){
		return true;
	}
}
