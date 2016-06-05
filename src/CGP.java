import java.util.ArrayList;


public class CGP extends POI{
	private int altura;
	private int piso;
	private String departamento;
	private String unidad;
	private String codigoPostal;
	private ArrayList<Servicio> servicios = new ArrayList<Servicio>();

	
	// ***************************************************************************
	// Constructor
	// ***************************************************************************
	public CGP(String nombre, double latitud, double longitud) {
		super.nombre = nombre;
		super.latitud = latitud;
		super.longitud = longitud;		
	}
	
	// ***************************************************************************
	// Setters
	// ***************************************************************************
	
	public void setAltura(int altura){
		this.altura = altura;
	}
	
	public void setPiso(int piso){
		this.piso = piso;
	}
	
	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	
	public void setUnidad(String unidad){
		this.unidad = unidad;
	}
	
	public void setCodigoPostal(String codigoPostal){
		this.codigoPostal= codigoPostal;
	}
	
	public void setServicios(ArrayList<Servicio> servicios) {
		this.servicios = servicios;
	}
	// ***************************************************************************
	// Getters
	// ***************************************************************************
	
	public int getAltura(){
		return altura;
	}
	
	public int getPiso(){
		return piso;
	}
	
	public String getDepartamento(){
		return departamento;	
	}
	
	public String getUnidad(){
		return unidad;
	}
	
	public String getCodigoPostal(){
		return codigoPostal;
	}
	
	public ArrayList<Servicio> getServicios() {
		return servicios;
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