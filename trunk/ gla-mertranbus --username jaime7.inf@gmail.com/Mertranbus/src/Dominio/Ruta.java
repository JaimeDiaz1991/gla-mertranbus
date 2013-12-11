package Dominio;

public class Ruta {
	int id;
	double km;
	String origen;
	String destino;
	String descripcion;
	
	
	public Ruta(int id,double km, String origen, String destino, String descripcion) {
		//this.id=id;
		this.km = km;
		this.origen = origen;
		this.destino = destino;
		this.descripcion = descripcion;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return "Origen; " + origen + " Destinoestino " 
				+ destino + " Descripcion " + descripcion 
				+ " kilometros " + km + ".";
	}
	
}
