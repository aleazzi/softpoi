package src;

import java.util.Date;

public class ParadaColectivo extends POI {
	private String empresa;
	private int numeroDeLinea;
	
	// Constructor
	public ParadaColectivo(String nombre, double latitud, double longitud) {
		super.nombre = nombre;
		super.latitud = latitud;
		super.longitud = longitud;		
	}
	
	// ***************************************************************************
	// Setters
	// ***************************************************************************
	
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	public void setNumeroDeLinea(int numeroDeLinea){
		this.numeroDeLinea= numeroDeLinea;
	}
	
	// ***************************************************************************
	// Getters
	// ***************************************************************************
	
	public String getEmpresa() {
		return empresa;
	}
	
	public int getNumeroDeLinea(){
		return numeroDeLinea;
	}
	
	// ***************************************************************************
	// Methods
	// ***************************************************************************
	
	public boolean estaDisponible(String unServicio, Date unDia, String unaHora){
		return true;
	}

	
	public String tipoPOI(){
		// Pendiente: Hay que ver la logica
		return this.getClass().getName().substring(4);
	}
	
	public boolean estaCercaDe(DispositivoConsulta unDispositivo){
		
		if (distancia(unDispositivo.getLatitud(),unDispositivo.getLongitud(),this.latitud,this.longitud) <100) {// ver si son 5 cuadras, 500 mts o que...{
			return true;
			}	
		else
			{
				return false;
			}
		}
	
}
