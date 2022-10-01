package Ex_15_Orientacao_Objetos;

import java.util.ArrayList;
import java.util.List;

public class Parceiro {
	
	private String tipoPessoa;
	private double desempenho; 
	
	List<Fisica> fisicas = new ArrayList<>();
	List<Juridica> juridicas = new ArrayList<>();
	
	public Parceiro() {
		
	}

	public Parceiro(String tipoPessoa, double desempenho) {
		
		super();
		this.tipoPessoa = tipoPessoa;
		this.desempenho = desempenho;
	}

	public String getTipoPessoa() {
		
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		
		this.tipoPessoa = tipoPessoa;
	}

	public double getDesempenho() {
		
		return desempenho;
	}

	public void setDesempenho(double desempenho) {
		
		this.desempenho = desempenho;
	}
	
	public void cadastrar(Fisica fisica, Juridica juridica) {
		
		fisicas.add(fisica);
		
		System.out.println("Pessoa Fisica Cadastrada com sucesso: " + fisica.getCpf() + "\n " + fisica.getRg() + "\n" + fisica.getGenero() + "\n" + fisica.getNasc()); 
		
		juridicas.add(juridica);
		
		System.out.println("Pessoa Jurídica Cadastrada com sucesso: " + juridica.getCnpj() + "\n" + juridica.getInscricaoEstadual() + "\n" + juridica.getFundacao());
	}
	
	public void excluir(Fisica fisica, Juridica juridica) {
		
		fisicas.remove(fisica);
		
		System.out.println("Pessoa Fisica Removida com sucesso: "); 
		
		juridicas.remove(juridica);
		
		System.out.println("Pessoa Jurídica Removida com sucesso: ");
		
	}
	
	public void bloquear(Fisica fisica, Juridica juridica) {
		
		
	}

}
