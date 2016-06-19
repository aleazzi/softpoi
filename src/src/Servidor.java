package src;
import java.util.ArrayList;
import java.util.List;


public class Servidor {
	// Constructor
	public ArrayList<POI> colPOIs = new ArrayList<POI>();
	public ArrayList<Administrador> colAdmins = new ArrayList<Administrador>();

	// ***************************************************************************
	// Setters
	// ***************************************************************************
		public void addAdmin(Administrador unAdmin) {
			this.colAdmins.add(unAdmin);
		}
		
		public void cargarPOI(POI unPOI) {
			this.colPOIs.add(unPOI);
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
	public boolean obtenerEstadisticas(){
		return true;
	}
	
	public boolean loguin(ArrayList<Administrador> colAdmins, Administrador adminBuscado){
		for (Administrador s: colAdmins)
		{
			if(s.equals(adminBuscado))
				return true;
		}
		return false;

		}
	
	
	public void eliminarAdmin(Administrador unAdmin){
		if(colAdmins.contains(unAdmin) == true){
		colAdmins.remove(unAdmin);
		}
	}	
	
	public void eliminarPOI(POI unPOI){
		if(colPOIs.contains(unPOI) == true){
		colPOIs.remove(unPOI);
		}
	}	
	
	public void modificarPOI(POI unPOI, String atributo, String nuevoValor){
		//unPOI.atributo = nuevoValor;		
	}
	
	}
