package model;

public class Ciudades {
	private String ciudad;
	private int habitantes;
	public String pais;
	public Ciudades(String ciudad, int habitantes, String pais) {
		super();
		this.ciudad = ciudad;
		this.habitantes = habitantes;
		this.pais = pais;
	}
	public Ciudades() {
		super();
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
}
