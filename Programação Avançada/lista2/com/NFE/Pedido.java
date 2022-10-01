package Ex_18_Orientacao_Objetos;

import java.util.Date;

public class Pedido {
	
	private Date dataPedido;
	private boolean status; 
	private double valorPedido;
	private ItemPedido itempedido;
	
	public Pedido() {
		
	}

	public Pedido(Date dataPedido, boolean status, ItemPedido itempedido, double valorPedido) {
		
		super();
		this.dataPedido = dataPedido;
		this.status = status;
		this.valorPedido = valorPedido;
		this.itempedido = itempedido;
	}

	public Date getDataPedido() {
		
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		
		this.dataPedido = dataPedido;
	}

	public boolean isStatus() {
		
		return status;
	}

	public void setStatus(boolean status) {
		
		this.status = status;
	}

	public double getValorPedido() {
		
		return valorPedido;
	}

	public void setValorPedido(double valorPedido) {
		
		this.valorPedido = valorPedido;
	}
	
	public ItemPedido getItempedido() {
		
		return itempedido;
	}

	public void setItempedido(ItemPedido itempedido) {
		
		this.itempedido = itempedido;
	}
	
	public void statusPedido() {
		
		if(status == true) {
			
			System.out.println("Pedido Realizado com sucesso");
			
		} else {
			
			System.out.println("Pedido ainda não realizado, processo de estoque");
		}
	}
	
	
}
