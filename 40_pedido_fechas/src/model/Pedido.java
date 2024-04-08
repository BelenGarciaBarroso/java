package model;

import java.util.Date;

public class Pedido {
	private String producot;
	private int unidades;
	private Date fecha;
	public Pedido(String producot, int unidades, Date fecha) {
		super();
		this.producot = producot;
		this.unidades = unidades;
		this.fecha = fecha;
	}
	
	public Pedido() {
		super();
	}

	public String getProducot() {
		return producot;
	}
	public void setProducot(String producot) {
		this.producot = producot;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	

}
