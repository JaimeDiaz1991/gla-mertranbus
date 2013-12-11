package Dominio;

public class Administrador extends Empleado{
	private String departamento;

	public Administrador(String departamento) {
		super(departamento, departamento, departamento, departamento);
		this.departamento = departamento;
	}
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	

}
