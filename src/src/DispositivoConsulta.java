package src;
import java.sql.Date;
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
		
		// ***************************************************************************
		// Methods
		// ***************************************************************************
		
		//public boolean estaCercaMio(POI unPoi){
		
		//return (unPoi.estaCercaMio(unPoi.latitud, unPoi.longitud));			
				
		//}faltaria definir estacercamio en POI		
		
		//	public boolean estaDisponible(POI unPoi, Servicio unServicio, Date unaFecha, String unaHora){
		//return (unPoi.estaDisponible(unServicio,unaFecha,unaHora));
		//}
		
		
		// Funcion que calcula la distancia entre 2 coordenadas (sin el uso de internet)
		public static double distancia(double lat1, double lon1, double lat2, double lon2){
			// En millas
			//double radioTierra = 3958.75;
			
			// En kilometros
			double radioTierra = 6371;
			
			double dLat = Math.toRadians(lat2 - lat1);
			double dLon = Math.toRadians(lon2 - lon1);
			
			double senoLat = Math.sin(dLat / 2);
			double senoLon = Math.sin(dLon / 2);
			
			double aux1 = Math.pow(senoLat, 2) + Math.pow(senoLon, 2) * Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2));
			double aux2 = 2 * Math.atan2(Math.sqrt(aux1), Math.sqrt(1 - aux1));
			
			double distancia = radioTierra * aux2;
			//System.out.println("Distancia: " + distancia);
			return distancia;
			
		}
}

