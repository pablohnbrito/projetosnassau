package Ex_18_Orientacao_Objetos;

import java.util.ArrayList;

public class PedidoBasico {
	
	private String nome; 
	
	private Gerente gerente;
	
	private ArrayList<Pedido> pedidos = new ArrayList<>();
	
	public PedidoBasico() {
		
	}

	public PedidoBasico(String nome) {
		
		super();
		this.nome = nome;
	}

	public String getNome() {
		
		return nome;
	}

	public void setNome(String nome) {
		
		this.nome = nome;
	}

	public Gerente getGerente() {
		
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		
		this.gerente = gerente;
	}
	
}
