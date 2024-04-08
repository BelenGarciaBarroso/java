package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import model.Pedido;

public class PedidosService {
	/*Programa para manejar pedidos. Un pedido se caracteriza por producto,unidades,fechaPedido.
	Se presenta el siguiente menú:
		1.- Nuevo pedido
		2.- Pedido más reciente
		3.- Pedidos entre dos fechas
		4.- Salir

		2: Muestra los datos del pedido más reciente
		3: Se solicitan dos fechas, y se muestran los pedidos realizados
		en ese rango de fechas*/
	
	HashSet <Pedido> pedidos = new HashSet<Pedido>();
	
	
	public void nuevoPedido (Pedido pedido) {
		pedidos.add(pedido);		
	}
	
	//**************************************************************
	public Pedido pedidoMasReciente () {
		Date aux =new Date(0);// 1-1-1790 - Se inicializa a la fecha más baja posible.
		Pedido pedidoreciente = null; //Se inicializa a nulo.
		for (Pedido p:pedidos) {
			if (p.getFecha().after(aux)) {
				aux = p.getFecha();
				pedidoreciente=p;
			}
		}
		return pedidoreciente;
	}
	
//*************************************************************************
	public ArrayList<Pedido> pedidosEntreFechas (Date fecha1, Date fecha2) {
		ArrayList<Pedido> aux = new ArrayList<Pedido>();
		for (Pedido p:pedidos) {
			// si la fecha del pedido es posterior o igual a fecha1 y
			// anterior o igual a fecha2, se incluye en el arraylist.
			if (p.getFecha().compareTo(fecha1)>=0 && p.getFecha().compareTo(fecha2)<=0) {
				aux.add(p);
			}
		}
		return aux;
		
	}

}
