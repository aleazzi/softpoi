import java.util.ArrayList;


public class Disponibilidad {

	private String dia; // LUN-MAR-MIE-JUE-VIE-SAB-DOM
	private ArrayList<RangoHorario> horarios = new ArrayList<RangoHorario>();
	
	
	// ***************************************************************************
	// Setters
	// ***************************************************************************
	public void setDia(String dia) {
		this.dia = dia;
	}
	
	public void setHorarios(ArrayList<RangoHorario> horarios) {
		this.horarios = horarios;
	}
	

	// ***************************************************************************
	// Getters
	// ***************************************************************************
	public String getDia() {
		return dia;
	}

	public ArrayList<RangoHorario> getHorarios() {
		return horarios;
	}

	
	// ***************************************************************************
	// Metodos
	// ***************************************************************************
	public void agregarRangoHorario(RangoHorario objRangoHorario){
		this.horarios.add(objRangoHorario);
	}
	
	
}