package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import model.Pedido;
import service.PedidosService;


public class PedidosView {		
		static PedidosService service=new PedidosService();
		public static void main(String[] args) throws ParseException {
			Scanner sc=new Scanner(System.in);
			int opcion;
			do {
				presentarMenu();
				opcion=sc.nextInt();
				switch (opcion) {
					case 1:
						agregarPedido();
						break;
					case 2:
						pedidoMasReciente();
						break;
					case 3:
						pedidosEntreFechas();
						break;
					case 4:
						System.out.println("Adios");
						break;
					default:
						System.out.println("Opción no válida");
				}

			}while (opcion!=4);
		}
		
		
// PRESENTAR MENU Y ELEGIR OPCIÓN ***************************************
		static void presentarMenu() {
		String textoMenu =""" 
					
					
			Elige una opción:
					
				1.- Nuevo pedido
				2.- Pedido más reciente
				3.- Pedidos entre fechas
				4.- Salir """;
		System.out.println(textoMenu);
			
		}
		
//SOLICITAR NUEVO PEIDDO*************************************************
		static void agregarPedido ()  {
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			Scanner sc=new Scanner (System.in);
			System.out.println("Producto:");
			String producto=sc.nextLine();
			System.out.println("Unidades:");
			int unidades=Integer.parseInt(sc.nextLine());
			System.out.println("Fecha Pedido (dd/MM/yyyy:");
			try {
				Date fecha=sdf.parse(sc.nextLine());
				
				
				Pedido ped= new Pedido();
				
				service.nuevoPedido(ped);
			}
			catch (ParseException ex) {
				ex.printStackTrace(); //muestra donde está el error
				System.out.println("Fecha errónea y NO añadida");
			}
			
		}
		

//PEDIDO MAS RECIENTE *********************************************************
		static void pedidoMasReciente() {
			Pedido p=service.pedidoMasReciente();
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			System.out.print("Producto: "+p.getProducot()+" ");
			System.out.print("Unidades: "+p.getUnidades()+" ");
			System.out.println("Fecha pedido: "+sdf.format(p.getFecha())+" ");
			
		}
	
		
//PEDIDOS ENTRE FECHAS ********************************************************
		static void pedidosEntreFechas() throws ParseException {
			Scanner sc=new Scanner(System.in);
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");	
			System.out.println("Fecha inicio (dia/mes/año):");
			Date fecha1=sdf.parse(sc.nextLine());	
			System.out.println("Fecha límite (dia/mes/año):");
			Date fecha2=sdf.parse(sc.nextLine());	
			ArrayList<Pedido> pedidosEncontrados=service.pedidosEntreFechas(fecha1, fecha2);
			for(Pedido p:pedidosEncontrados) {
				System.out.print("Producto: "+p.getProducot()+" ");
				System.out.print("Unidades: "+p.getUnidades()+" ");
				System.out.println("Fecha pedido: "+sdf.format(p.getFecha())+" ");
			}
		}
		
}

