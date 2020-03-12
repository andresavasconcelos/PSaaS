package modelo.fases;

import static principal.Principal.printAndWait;

public class FaseImplementacao {
	
	public static void printFase () {
  
		printAndWait("Checando testes...", 500);
    
		printAndWait("Esperando aceite da área de negócios...\n", 500);
		
		printAndWait("Aguardando criação de espaço na nuvem...\n", 1000);
		
		printAndWait("Subindo software para produção...", 500);
				
		System.out.println("Fim da fase de implementação.\n\n\n------------------------------------------------\n\n");
		
	}
}
