import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

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
	public boolean estaDisponible(LocalTime horaActual){
		return this.compararHoras(horaActual);
	}
	
	 private boolean compararHoras(LocalTime laHoraActual){
		//String horaInicial = "13:30";
		//String horaFinal = "12:20";
		try{
			DateFormat dateFormat = new SimpleDateFormat("HH:mm");
			Date horaIni;
			Date horaFin;	
			horaIni = dateFormat.parse(this.apertura.toString());
			horaFin = dateFormat.parse(this.cierre.toString());
			if (horaIni.compareTo(horaFin) < 0) {
			    System.out.println("correcta");
			    return true;
			} else {
			    System.out.println("incorrecta");
			    return false;
			}
		
        } catch (ParseException ex) {
            //Logger.getLogger(Main2.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Posee errores");
            return false;
        }
		
	 }
	 
}
