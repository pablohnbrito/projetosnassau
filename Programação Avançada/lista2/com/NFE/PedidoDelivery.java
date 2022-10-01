package Ex_18_Orientacao_Objetos;

import java.util.ArrayList;
import java.util.List;

public class PedidoDelivery {
	
	private Cliente cliente;
	
	private ArrayList<Pedido> pedidos = new ArrayList<>();
	
	public PedidoDelivery() {
		
	}

	public PedidoDelivery(Cliente cliente) {
		
		super();
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		
		return "Cliente: "+ getCliente().getNome() + ", " 
		+ "Cpf: " + cliente.getCpf() + ", " 
		+ "Nome Usuário: " + cliente.getNomeUsuario() + ", "
		+ "Cargo: " + cliente.getCargo() + ", " 
		+ "Salário: " + cliente.getSalario() + ", " 
		+ "Status: " + cliente.isStatus() + ", " 
		+ "Senha: " + cliente.getSenha();
	}
	
	public void RealizaPedido(Pedido pedido) {
		
		pedidos.add(pedido);
;	}
}
