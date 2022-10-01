package Ex_18_Orientacao_Objetos;

public class Produto {
	
	private String nome;
	private double peso; 
	private double valor;
	private String descricao; 

	public Produto(String nome, double peso, double valor, String descricao) {
		super();
		
		this.nome = nome;
		this.peso = peso;
		this.valor = valor;
		this.descricao = descricao;
	}

	public double getPeso() {
		
		return peso;
	}

	public void setPeso(double peso) {
		
		this.peso = peso;
	}

	public String getNome() {
		
		return nome;
	}

	public void setNome(String nome) {
		
		this.nome = nome;
	}

	public double getValor() {
		
		return valor;
	}

	public void setValor(double valor) {
		
		this.valor = valor;
	}

	public String getDescricao() {
		
		return descricao;
	}

	public void setDescricao(String descricao) {
		
		this.descricao = descricao;
	}
}
