package Ex_16_Orientacao_Objetos;

public class Texto {
	
	private String Mensagem; 
	
	public Texto() {
		
	}

	public Texto(String mensagem) {
		
		super();
		Mensagem = mensagem;
	}

	public String getMensagem() {
		
		return Mensagem;
	}

	public void setMensagem(String mensagem) {
		
		Mensagem = mensagem;
	}
}
