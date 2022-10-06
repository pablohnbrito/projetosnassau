package lista2.com.NFE;

public class ItemPedido {
	
	private int quantidade;
	
	private Produto produto;
	
	public ItemPedido() {
		
	}

	public ItemPedido(int quantidade, Produto produto) {
		
		super();
		this.quantidade = quantidade;
		this.produto = produto;
	}

	public int getQuantidade() {
		
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		
		return produto;
	}

	public void setProduto(Produto produto) {
		
		this.produto = produto;
	}
	
	@Override
	public String toString() {
		
		return getProduto().getNome() + ", " 
		+ " Quantidade: " + quantidade + ", " 
		+ " Peso: " + produto.getPeso() + ", " 
		+ " Valor: " + produto.getValor() + ", " 
		+ " Descrição: " + produto.getDescricao();			
	}
}
