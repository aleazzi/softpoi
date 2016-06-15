package src;

public class ParadaColectivo extends POI {
	private String empresa;
	private int numeroDeLinea;
	
	// Constructor
	public ParadaColectivo(String nombre, double latitud, double longitud) {
		super.nombre = nombre;
		super.latitud = latitud;
		super.longitud = longitud;		
	}
	
	// ***************************************************************************
	// Setters
	// ***************************************************************************
	
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	public void setNumeroDeLinea(int numeroDeLinea){
		this.numeroDeLinea= numeroDeLinea;
	}
	
	// ***************************************************************************
	// Getters
	// ***************************************************************************
	
	public String getEmpresa() {
		return empresa;
	}
	
	public int getNumeroDeLinea(){
		return numeroDeLinea;
	}
	
	// ***************************************************************************
	// Methods
	// ***************************************************************************
	
	public boolean estaDisponible(){
		return true;
	}
//	public boolean estaCercaMio(double latitud, double longitud){
//		
//		super.distancia(lat1, lon1, lat2, lon2)
//	}
	
	public String tipoPOI(){
		// Pendiente: Hay que ver la logica
		return "ni idea";
	}
}