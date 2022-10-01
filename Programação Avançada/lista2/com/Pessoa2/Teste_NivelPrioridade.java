package Ex_17_Orientacao_Objetos;

public class Teste_NivelPrioridade {
	
	 Nivel_Prioridade  nivel_prioridade; 
	 
	 Teste_NivelPrioridade(String nivel_prioridade){
		 
		 this.nivel_prioridade = Nivel_Prioridade.valueOf(nivel_prioridade);   
	 }
	 
	 public void selecao_nivel_prioridade() {
		 
		 switch(nivel_prioridade)  {
		 
		 case VERDE:
			 
			 System.out.println("Prioridade 1");
			 break;
			 
		 case AMARELO:
			 
			 System.out.println("Prioridade 2");
			 break;
			 
		 case VERMELHO:
			 
			 System.out.println("Prioridade 3");
			 break;
		 }
	 }
	   
}
