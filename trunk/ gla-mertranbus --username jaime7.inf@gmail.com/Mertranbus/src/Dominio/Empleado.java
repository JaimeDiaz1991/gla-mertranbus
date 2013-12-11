package Dominio;

public class Empleado {
	private String DNI;
	private String nombre;
	private String apellidos;
	private String pass;
	
	public Empleado(String dNI, String nombre, String apellidos, String pass) {
		
		DNI = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.pass = pass;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
