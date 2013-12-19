package dominio;

public class Cliente {
	
	private int iD;
	private String login;
	private String password;
	public Cliente(int iD, String login,
			String password) {
		this.iD=iD;
		this.login=login;
		this.password=password;
	}
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
