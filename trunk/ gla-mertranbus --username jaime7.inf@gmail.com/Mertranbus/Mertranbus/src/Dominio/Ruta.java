package Dominio;

public class Ruta {
	
	int ID;
	String origen;
	String destino;
	double km;
	String descripcion;
	
	
	public Ruta(int ID,String origen, String destino,double km, String descripcion) {
		this.ID=ID;
		this.km = km;
		this.origen = origen;
		this.destino = destino;
		this.descripcion = descripcion;
	}
	public Ruta(String origen, String destino,double km, String descripcion) {
		this.km = km;
		this.origen = origen;
		this.destino = destino;
		this.descripcion = descripcion;
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String toString() {
		return "Origen: " + origen + " Destino: " 
				+ destino + " Descripcion: " + descripcion 
				+ " kilometros: " + km + ".";
	}
	public String toString1() {
		return "ID: "+ ID +" Origen: " + origen + " Destino: " 
				+ destino + " kilometros: " + km + ".";
	}
	
}
