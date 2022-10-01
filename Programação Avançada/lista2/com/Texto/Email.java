package Ex_16_Orientacao_Objetos;

import java.util.ArrayList;
import java.util.List;

public class Email {
	
	private int NomeDoEmail;
	
	List<Texto> textos = new ArrayList<>();
	List<Arquivos> arquivo = new ArrayList<>();
	List<Assunto> assuntos = new ArrayList<>();
 	
	public Email() {
		
	}
	
	public Email(int nomeDoEmail) {
		
		super();
		NomeDoEmail = nomeDoEmail;
	}

	public int getNomeDoEmail() {
		
		return NomeDoEmail;
	}

	public void setNomeDoEmail(int nomeDoEmail) {
		
		NomeDoEmail = nomeDoEmail;
	}
	
	public void Anexar(Texto texto, Arquivos arquivos, Assunto assunto) {
		
		textos.add(texto);
		arquivo.add(arquivos);
		assuntos.add(assunto);
		
		System.out.println("Textos, Arquivos e Assuntos enviado com sucesso: \n");
	}
	
	public void Excluir(Texto texto, Arquivos arquivos, Assunto assunto) {
		
		textos.remove(texto); 
		arquivo.remove(arquivos);
		assuntos.remove(assunto); 
		
		System.out.println("Excluido com sucesso os textos, arquivos e assuntos: \n");
	}
	
	public void Escrever(Texto texto, Assunto assunto) {
		
		textos.add(texto);
		assuntos.add(assunto);
		
		System.out.println("Menssagem e Assunto enviado com sucesso: \n" + texto.getMensagem());
	}
	
	public void Responder(Texto texto, Assunto assunto) {
		
		textos.add(texto);
		assuntos.add(assunto);
		
		System.out.println("Menssagem e Assunto enviado com sucesso: \n" + texto.getMensagem());
	}
}
