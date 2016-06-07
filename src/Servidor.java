import java.util.ArrayList;
import java.util.List;

public class Servidor {
	// Constructor
	private ArrayList<POI> colPOIs = new ArrayList<POI>();
	private ArrayList<Administrador> colAdmins = new ArrayList<Administrador>();

	// ***************************************************************************
	// Setters
	// ***************************************************************************
		public void iniccolPOIs() {
			List<POI> colPOIs = new ArrayList<POI>();
		}
	
		public void cargarPOI(POI unPOI) {
			this.colPOIs.add(unPOI);
		}
		public void iniccolAdmins() {
			List<Administrador> colAdmins = new ArrayList<Administrador>();
		}
	
		public void addAdmin(Administrador unAdmin) {
			this.colAdmins.add(unAdmin);
		}
		
	// ***************************************************************************
	// Getters
	// ***************************************************************************
		public ArrayList<POI> getcolPOIs() {
			return colPOIs;
		}
		
		public ArrayList<Administrador> getcolAdmins() {
			return colAdmins;
		}
	
	// Metodos
	public boolean ObtenerEstadisticas(){
		return true;
	}
	
	public boolean Loguin(Administrador[] colAdmins, String adminBuscado){
		for (Administrador s: colAdmins)
		{
			if(s.equals(adminBuscado))
				return true;
		}
		return false;

		}
	
	public void eliminarPOI(POI unPOI){
		if(colPOIs.contains(unPOI) == true){
		colPOIs.remove(unPOI);
		}
	}	
	
	public void eliminarAdmin(Administrador unAdmin){
		if(colAdmins.contains(unAdmin) == true){
		colAdmins.remove(unAdmin);
		}
	}	
	
	}
