package src;

public class Comuna {
	
	// ***************************************************************************
	// Constructor
	// ***************************************************************************
	private double limSur;
	private double limNorte;
	private double limEste;
	private double limOeste;
	
	// ***************************************************************************
	// Setters
	// ***************************************************************************
	
	public void setlimSur(double unLimSur){
		this.limSur = unLimSur;
	}
	
	public void setlimNorte(double unLimNorte){
		this.limNorte = unLimNorte;
	}

	public void setlimEste(double unLimEste){
		this.limEste = unLimEste;
	}
	
	public void setlimOeste(double unLimOeste){
		this.limOeste = unLimOeste;
	}
	
	// ***************************************************************************
	// Getters
	// ***************************************************************************
	
	public double getlimSur(){
		return limSur;
	}
	
	public double getlimNorte(){
		return limNorte;
	}
	
	public double getlimEste(){
		return limEste;
	}
	
	public double getlimOeste(){
		return limOeste;
	}
	
}
