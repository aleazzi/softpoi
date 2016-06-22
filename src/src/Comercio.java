package src;
public class Comercio extends POI{
	
	private int altura;
	private int piso;
	private String departamento;
	private String unidad;
	private String codigoPostal;
	private Rubro rubro;
	
	// ***************************************************************************
		// Constructor
		// ***************************************************************************
		public Comercio(String nombre, double latitud, double longitud, Rubro unRubro) {
			super.nombre = nombre;
			super.latitud = latitud;
			super.longitud = longitud;
			this.rubro = unRubro;
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
		
		public Rubro getRubro(){
			return rubro;
		}
		// ***************************************************************************
		// Metodos
		// ***************************************************************************
		
		
//      no corresponde este metodo, ya que tiene un horario
//		public boolean estaDisponible(Servicio objServicio){
//			// Pendiente: Hay que ver la logica
//			return true;
//		}
		
		public boolean estaCercaMio(){
			// Pendiente: Hay que ver la logica
			return true;
		}

		public String tipoPOI(){
			// Pendiente: Hay que ver la logica
			return "ni idea";
		}

}
