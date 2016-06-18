package src;
public class DispositivoConsulta {

	private double longitud;
	private double latitud;
	private String zona;
	//nuevo rodo

	
	
	
	// *****no deberia tener un nombre?


	
		
	// ***************************************************************************
// Setters
// ***************************************************************************
		
		public void setLatitud(Double latitud) {
			this.latitud = latitud;
		}
		
		public void setLongitud(Double longitud){
			this.longitud= longitud;
		}
		
		public void setZona(String zona){
			this.zona= zona;
		}



		// ***************************************************************************
		// Getters
		// ***************************************************************************
		
		public double getLatitud(){
			return latitud;
		}
		
		public double getLongitud(){
			return longitud;
		}
		
		public String getZona(){
			return zona;
		}
}
		// ***************************************************************************
		// Methods
		// ***************************************************************************