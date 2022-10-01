package Ex_15_Orientacao_Objetos;

public class Pessoa {
	
	private int id;
	private String nome;
	private String nomeFantasia;
	private String logradouro;
	private int numero;
	private String complemento;
	private String bairro;
	private String cep;
	private String cidade;
	private String uf;
	
	public Pessoa() {
		
	}

	public Pessoa(int id, String nome, String nomeFantasia, String logradouro, int numero, String complemento,
			String bairro, String cep, String cidade, String uf) {
		super();
		this.id = id;
		this.nome = nome;
		this.nomeFantasia = nomeFantasia;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
	}

	public int getId() {
		
		return id;
	}

	public void setId(int id) {
		
		this.id = id;
	}

	public String getNome() {
		
		return nome;
	}

	public void setNome(String nome) {
		
		this.nome = nome;
	}

	public String getNomeFantasia() {
		
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		
		this.nomeFantasia = nomeFantasia;
	}

	public String getLogradouro() {
		
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		
		this.logradouro = logradouro;
	}

	public int getNumero() {
		
		return numero;
	}

	public void setNumero(int numero) {
		
		this.numero = numero;
	}

	public String getComplemento() {
		
		return complemento;
	}

	public void setComplemento(String complemento) {
		
		this.complemento = complemento;
	}

	public String getBairro() {
		
		return bairro;
	}

	public void setBairro(String bairro) {
		
		this.bairro = bairro;
	}

	public String getCep() {
		
		return cep;
	}

	public void setCep(String cep) {
		
		this.cep = cep;
	}

	public String getCidade() {
		
		return cidade;
	}

	public void setCidade(String cidade) {
		
		this.cidade = cidade;
	}

	public String getUf() {
		
		return uf;
	}

	public void setUf(String uf) {
		
		this.uf = uf;
	}
	
	
}
