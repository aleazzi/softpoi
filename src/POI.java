import java.util.ArrayList;
import maps.java.*; //propiedades-java build path-libraries-add external jars-MapsJavaJar
	
public abstract class POI {
	protected String nombre;              //el nombre lo agregue por el metodo esValido()
	protected double latitud;              
	protected double longitud;              
	//private String pais;                //aca no iria un objeto de tipo pais?
	//private String provincia;			
	//private String barrio;
	//private String localidad;
	//private String calle;
	//private String calle_interseccion;
	
	public boolean esValido(){
		return !(this.nombre == null || 
				 this.latitud > 90 || this.latitud < -90 ||
				 this.longitud > 180 || this.longitud < -180);
	}
	public boolean estaAMenosDe(POI otroPOI, double metros){
		return (distancia(this.latitud, this.longitud, otroPOI.latitud, otroPOI.longitud) < metros );
	}
	
	public double distancia(double lat1, double lon1, double lat2, double lon2){
			double distancia = 0;
//			System.out.println("Arranca");
			Geocoding ObjGeocod=new Geocoding();
		    Route ObjRout=new Route();
			try {
				ArrayList<String> puntogeografico1=ObjGeocod.getAddress(lat1,lon1);
				ArrayList<String> puntogeografico2=ObjGeocod.getAddress(lat2,lon2);
//				System.out.println(puntogeografico1.get(0));
//				System.out.println(puntogeografico2.get(0));
				@SuppressWarnings("unused")
				String[][] resultado=ObjRout.getRoute(puntogeografico1.get(0), puntogeografico2.get(0), null, Boolean.TRUE, Route.mode.walking, Route.avoids.nothing);
				ArrayList<Integer> distancias = ObjRout.getTotalDistance();
//				System.out.println("La distancia es " + distancias.get(0));
				distancia = distancias.get(0);
			} catch (Exception e) {
				System.out.println("Se pudrio todo obteniendo la distancia...necesita internet!");
			}
//			System.out.println("Termina");
			return distancia;
	}
	
	
	
}
