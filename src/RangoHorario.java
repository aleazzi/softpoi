import java.time.LocalTime;

public class RangoHorario {
	
	private LocalTime apertura;
	private LocalTime cierre;

	
	// ***************************************************************************
	// Constructor
	// ***************************************************************************
	public RangoHorario(LocalTime apertura, LocalTime cierre) {
		this.apertura = apertura;
		this.cierre = cierre;
	}
	
	
	// ***************************************************************************
	// Setters
	// ***************************************************************************
	public void setApertura(LocalTime apertura) {
		this.apertura = apertura;
	}
	
	public void setCierre(LocalTime cierre) {
		this.cierre = cierre;
	}
	
	
	// ***************************************************************************
	// Getters
	// ***************************************************************************
	public LocalTime getApertura() {
		return apertura;
	}
	
	public LocalTime getCierre() {
		return cierre;
	}
	
	
	// ***************************************************************************
	// Metodos
	// ***************************************************************************
	
	
}
