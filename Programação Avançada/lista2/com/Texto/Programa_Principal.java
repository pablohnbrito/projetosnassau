package Ex_16_Orientacao_Objetos;

public class Programa_Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arquivos ar = new Arquivos();
		Assunto as = new Assunto();
		Destinatario de = new Destinatario(); 
		Email e = new Email();
		Texto te = new Texto(); 
		
		Arquivos ar1 = new Arquivos();
		Assunto as1 = new Assunto();
		Destinatario de1 = new Destinatario(); 
		Email e1 = new Email();
		Texto te1 = new Texto(); 
		
		ar.setNomeArquivo("foto.jpeg");
		ar.setFormato("Jpeg");
		ar.setTamanho(50);
		
		ar.Anexar(ar);
		ar.Remover(ar);
		
		te.setMensagem("Estou enviando para você uma imagem");
		e.setNomeDoEmail(8);
		de.setEmailDestinatario(6);
		
		te1.setMensagem("Já Recebi a foto");
		e1.setNomeDoEmail(5);
		de1.setEmailDestinatario(3);
		
		de.Adicionar(e);
		de.Buscar();
		de.Apagar(e);
		
		e.Escrever(te, as);
		e.Excluir(te, ar, as);
		e.Anexar(te, ar, as);
		e.Responder(te, as);
		
		e1.Escrever(te1, as);
		e1.Excluir(te1, ar, as);
		e1.Anexar(te1, ar, as);
		e1.Responder(te1, as);
	}

}
