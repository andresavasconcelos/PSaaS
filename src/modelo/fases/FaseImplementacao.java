package modelo.fases;

import static principal.Principal.printAndWait;

public class FaseImplementacao {
	
	public static void printFase () {
  
		printAndWait("Checando testes...", 500);
    
		printAndWait("Esperando aceite da area de negocios...\n", 500);
		
		printAndWait("Aguardando criacao de espaco na nuvem...\n", 1000);
		
		printAndWait("Subindo software para produco...", 500);
				
		System.out.println("Fim da fase de implementação.\n\n\n------------------------------------------------\n\n");
		
	}
}
