package dominio;

public class Pedido {
	private int iD;
	private String PoblacionOrigen;
	private String CalleOrigen;
	private int numeroOrigen;
	private String EscaleraOrigen;
	private String PoblacionDestino;
	private String CalleDestino;
	private String EscaleraDestino;
	private int numeroDestino;
	private String TipodePaquete;
	private int IDUsuario;
	
	
	
	public Pedido(int iD, String poblacionOrigen, String calleOrigen,
			int numeroOrigen, String escaleraOrigen, String poblacionDestino,
			String calleDestino, int numeroDestino, String escaleraDestino,
			String tipodePaquete,int IDUsuario) {
		this.iD = iD;
		PoblacionOrigen = poblacionOrigen;
		CalleOrigen = calleOrigen;
		this.numeroOrigen = numeroOrigen;
		EscaleraOrigen = escaleraOrigen;
		PoblacionDestino = poblacionDestino;
		CalleDestino = calleDestino;
		EscaleraDestino = escaleraDestino;
		this.numeroDestino = numeroDestino;
		TipodePaquete = tipodePaquete;
		this.IDUsuario=IDUsuario;
	}
	
	
	
	
	
	public int getIDUsuario() {
		return IDUsuario;
	}


	public void setIDUsuario(int iDUsuario) {
		IDUsuario = iDUsuario;
	}

	public String getEscaleraDestino() {
		return EscaleraDestino;
	}
	public void setEscaleraDestino(String escaleraDestino) {
		EscaleraDestino = escaleraDestino;
	}
	public String getEscaleraOrigen() {
		return EscaleraOrigen;
	}
	public void setEscaleraOrigen(String escaleraOrigen) {
		EscaleraOrigen = escaleraOrigen;
	}
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public String getPoblacionOrigen() {
		return PoblacionOrigen;
	}
	public void setPoblacionOrigen(String poblacionOrigen) {
		PoblacionOrigen = poblacionOrigen;
	}
	public String getPoblacionDestino() {
		return PoblacionDestino;
	}
	public void setPoblacionDestino(String poblacionDestino) {
		PoblacionDestino = poblacionDestino;
	}
	public String getCalleOrigen() {
		return CalleOrigen;
	}
	public void setCalleOrigen(String calleOrigen) {
		CalleOrigen = calleOrigen;
	}
	public String getCalleDestino() {
		return CalleDestino;
	}
	public void setCalleDestino(String calleDestino) {
		CalleDestino = calleDestino;
	}
	public int getNumeroDestino() {
		return numeroDestino;
	}
	public void setNumeroDestino(int numeroDestino) {
		this.numeroDestino = numeroDestino;
	}
	public int getNumeroOrigen() {
		return numeroOrigen;
	}
	public void setNumeroOrigen(int numeroOrigen) {
		this.numeroOrigen = numeroOrigen;
	}
	public String getTipodePaquete() {
		return TipodePaquete;
	}
	public void setTipodePaquete(String tipodePaquete) {
		TipodePaquete = tipodePaquete;
	}
	
	
}