package Ex_16_Orientacao_Objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Destinatario {
	
	private int EmailDestinatario;
	
	private List<Email> emails = new ArrayList<>();
	private List<Destinatario> destinatarios = new ArrayList<>();
	
	public Destinatario() {
		
	}

	public Destinatario(int emailDestinatario) {
		
		super();
		EmailDestinatario = emailDestinatario;
	}

	public int getEmailDestinatario() {
		
		return EmailDestinatario;
	}

	public void setEmailDestinatario(int emailDestinatario) {
		
		EmailDestinatario = emailDestinatario;
		
	}
	
	public void Buscar() {
		
		Scanner sc = new Scanner(System.in);
		
		Destinatario des = new Destinatario();
		
		System.out.println("Informe o Destinatario: ");
		des.setEmailDestinatario(sc.nextInt());
		
		for(int i = 0; i < EmailDestinatario; i++) {
			
			if(des.getEmailDestinatario() >= 0) {
				
				 des.EmailDestinatario =  EmailDestinatario;
				
				break;
			}
		}
		
		if(EmailDestinatario != 0) {
			
			System.out.println("Email do Destinatario: " + des.getEmailDestinatario() + "\n ");
			
		} else {
			
			System.out.println("Sem Cadastro;");
		}
	}
	
	public void Adicionar(Email email) {
		
		emails.add(email); 
		
		System.out.println("Email Enviado para uma pessoa, enviado com sucesso. " + email.getNomeDoEmail());
	}
	
	public void Apagar(Email email) {
		
		emails.remove(email);
		
		System.out.println("Email Deletado com sucesso. ");
	}
}
