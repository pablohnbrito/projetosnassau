package Ex_16_Orientacao_Objetos;

import java.util.ArrayList;
import java.util.List;

public class Arquivos {
	
	private String nomeArquivo;
	private int Tamanho;
	private String Formato;
	
	List<Arquivos> arquivo = new ArrayList<>();
	
	public Arquivos() {
		
	}

	public Arquivos(String nomeArquivo, int tamanho, String formato) {
		
		super();
		this.nomeArquivo = nomeArquivo;
		Tamanho = tamanho;
		Formato = formato;
	}

	public String getNomeArquivo() {
		
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		
		this.nomeArquivo = nomeArquivo;
	}

	public int getTamanho() {
		
		return Tamanho;
	}

	public void setTamanho(int tamanho) {
		
		Tamanho = tamanho;
	}

	public String getFormato() {
		
		return Formato;
	}

	public void setFormato(String formato) {
		
		Formato = formato;
	}
	
	public void Anexar(Arquivos arquivos) {
		
		arquivo.add(arquivos); 
		
		System.out.println("Arquivos Anexados com Sucesso: " + arquivos.getNomeArquivo() + "\n" + arquivos.getFormato() + "\n" + arquivos.getTamanho());
	}
	
	public void Remover(Arquivos arquivos) {
		
		arquivo.remove(arquivos); 
		
		System.out.println("Arquivos Removidos com Sucesso: ");
	}
}
