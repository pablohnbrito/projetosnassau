package Ex_18_Orientacao_Objetos;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
	
	private List<Gerente> gerentes = new ArrayList<Gerente>();
	private ArrayList<PedidoBasico> pedidos_basicos = new ArrayList<PedidoBasico>();
	
	public Funcionario() {
		
	}
	
	public void listarPedidos() {
		
		for(int i = 0; i < pedidos_basicos.size(); i++) {
			
			PedidoBasico pb = pedidos_basicos.get(i);  
			
			System.out.println("Nome do Pedido Básico: " + pb.getNome());
			
		}
	}
	
	public void editarPedidos(String novo) {
		
		for(int i = 0; i < pedidos_basicos.size(); i++) {
			
			if(pedidos_basicos.get(i).getNome().equals(pedidos_basicos)) {
				
				pedidos_basicos.get(i).setNome(novo);
			}
		}
	}
}
