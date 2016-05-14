import java.util.ArrayList;

public class Servicio {
	
	private String servicio;
	private ArrayList<Disponibilidad> disponibilidad = new ArrayList<Disponibilidad>();
	
	
	// ***************************************************************************
	// Setters
	// ***************************************************************************
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
	
	public void setDisponibilidad(ArrayList<Disponibilidad> disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
	
	// ***************************************************************************
	// Getters
	// ***************************************************************************
	public String getServicio() {
		return servicio;
	}
	
	public ArrayList<Disponibilidad> getDisponibilidad() {
		return disponibilidad;
	}
	
	
	// ***************************************************************************
	// Metodos
	// ***************************************************************************
	public void agregarDisponibilidad(Disponibilidad objDisponibilidad){
		this.disponibilidad.add(objDisponibilidad);
	}
	
	
}
