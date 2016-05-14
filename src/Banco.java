import java.util.ArrayList;

public class Banco extends POI {
	
	private int altura;
	private int piso;
	private String departamento;
	private String unidad;
	private String codigoPostal;
	private ArrayList<Servicio> servicios = new ArrayList<Servicio>();
	

	// ***************************************************************************
	// Constructor
	// ***************************************************************************
	public Banco(String nombre, double latitud, double longitud) {
		super.nombre = nombre;
		super.latitud = latitud;
		super.longitud = longitud;		
	}

	
	// ***************************************************************************
	// Setters
	// ***************************************************************************
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public void setPiso(int piso) {
		this.piso = piso;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	public void setServicios(ArrayList<Servicio> servicios) {
		this.servicios = servicios;
	}

	
	// ***************************************************************************
	// Getters
	// ***************************************************************************
	public int getAltura() {
		return altura;
	}
	
	public int getPiso() {
		return piso;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public String getUnidad() {
		return unidad;
	}
	
	public String getCodigoPostal() {
		return codigoPostal;
	}
	
	public ArrayList<Servicio> getServicios() {
		return servicios;
	}
	
	
	// ***************************************************************************
	// Metodos
	// ***************************************************************************
	
	public void agregarServicio(Servicio objServicio){
		this.servicios.add(objServicio);
	}
	
	public boolean estaDisponible(Servicio objServicio){
		// Pendiente: Hay que ver la logica
		return true;
	}
	
	public boolean estaCercaMio(){
		// Pendiente: Hay que ver la logica
		return true;
	}

	public String tipoPOI(){
		// Pendiente: Hay que ver la logica
		return "ni idea";
	}

	public Servicio dameUnServicio(){
		// esto es de prueba
		return servicios.get(0);
	}
	
}
