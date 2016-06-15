package src;
import java.util.ArrayList;

public class Servidor {
	// Constructor
	private ArrayList<POI> colPOIs = new ArrayList<POI>();
	private ArrayList<Administrador> colAdmins = new ArrayList<Administrador>();

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
	
}

