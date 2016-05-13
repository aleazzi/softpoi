
public class ParadaColectivo extends POI {
	//private String empresa;
	//private int numeroDeLinea;
	
	public ParadaColectivo(String nombre, double latitud, double longitud) {
		super.nombre = nombre;
		super.latitud = latitud;
		super.longitud = longitud;		
	}
	public boolean estaDisponible(){
		return true;
	}
}
