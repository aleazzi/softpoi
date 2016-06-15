package src;
import java.util.ArrayList;
import java.util.Date;

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
	
	public void setServicios(Servicio unServicio) {
		this.servicios.add(unServicio);
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
	
	public void agregarServicio(Servicio unServicio){
		this.servicios.add(unServicio);
	}
	
	/*
	public boolean estaDisponible(Servicio unServicio, Date unDia, String unaHora){
		// Pendiente: Hay que ver la logica
		boolean existe = false; 
		
		for(Servicio unServicioDelBanco : servicios)
		{
		    if(unServicioDelBanco.getServicio().equals(unServicio.getServicio())){
		    	if (unServicioDelBanco.estaDisponible(unDia, unaHora)){
		    		existe = true;
			    	break;
		    	}
		    }
		}
		
		return existe;	
	}
	*/
	
	public boolean estaDisponible(String unServicio, Date unDia, String unaHora){
		// Pendiente: Hay que ver la logica
		
		boolean existe = false;
 	
		for(Servicio unServicioDisponible : servicios)
		{
		    if(unServicioDisponible.getServicio().equals(unServicio)){
		    	if (unServicioDisponible.estaDisponible(unDia, unaHora)){
		    		existe = true;
		    		break;
		    	}
		    }
		}
		
		return existe;		
	}


	public boolean estaCercaMio(double latitud, double longitud){
		if (super.distancia(this.latitud, this.longitud, latitud, longitud) < 500){
			return true;
		}
		return false;
	}


	public Banco tipoPOI(){
		return this;
	}

	public Servicio dameUnServicio(String servicio){
		// esto es de prueba
		return servicios.get(0);
	}
	
}
