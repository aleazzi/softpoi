
public abstract class POI {
	protected String nombre;              //el nombre lo agregue por el metodo esValido()
	protected float latitud;              
	protected float longitud;              
	private String pais;                //aca no iria un objeto de tipo pais?
	private String provincia;			
	private String barrio;
	private String localidad;
	private String calle;
	private String calle_interseccion;
	
	public Boolean esValido(){
		return !(this.nombre == null || 
				 this.latitud > 90 || this.latitud < -90 ||
				 this.longitud > 180 || this.longitud < -180);
	}
	public Boolean estaCercaDe(POI otroPOI){
		return true;
	}
}
