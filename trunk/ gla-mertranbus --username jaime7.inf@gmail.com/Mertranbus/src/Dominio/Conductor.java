package Dominio;

public class Conductor extends Empleado{
	private String vehiculo;

	public Conductor(String dNI, String nombre, String apellidos, String pass,
			String vehiculo) {
		super(dNI, nombre, apellidos, pass);
		this.vehiculo = vehiculo;
	}

	public String getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	

}
