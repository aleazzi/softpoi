
public class ParadaColectivo extends POI {
	//private String empresa;
	//private int numeroDeLinea;
	
	// Constructor
	public ParadaColectivo(String nombre, double latitud, double longitud) {
		super.nombre = nombre;
		super.latitud = latitud;
		super.longitud = longitud;		
	}
	
	// Metodo
	public boolean estaDisponible(){
		return true;
	}
//	public boolean estaCercaMio(double latitud, double longitud){
//		
//		super.distancia(lat1, lon1, lat2, lon2)
//	}
}
