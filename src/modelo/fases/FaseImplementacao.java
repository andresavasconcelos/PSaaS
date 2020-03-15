package modelo.fases;

import static principal.Principal.*;

import java.util.ArrayList;

public class FaseImplementacao {
	
	public static void printFase (ArrayList<String> requisitos) {
  
		printAndWait("Checando testes...", 500);
    
		printAndWait("Esperando aceite da área de negócios...\n", 500);
		
		if (aprovacaoSoftware(requisitos, requisitos))
			System.out.println("Requisitos compatíveis com a demanda. Software aceito pela área de negócios.");
		
		printAndWait("Iniciando esteira de produção...\n", 500);
		
		printAndWait("Criando versão executável do software...\n", 1000);
		
		printAndWait("Aguardando criação de espaço na nuvem...\n", 1000);
		
		printAndWait("Passando software do ambiente de desenvolvimento para o ambiente de produção...\n", 1000);
		
		printAndWait("Subindo software para produção...", 500);
		
		printAndWait("Configurando...", 500);
		
		printAndWait("Inicializando software...", 500);

		System.out.println("Fim da fase de implementação.\n\n\n------------------------------------------------\n\n");
		
	}
	
	public static boolean aprovacaoSoftware (ArrayList<String> requisitosNegocio, ArrayList<String> requisitosSoftware) {
		if (requisitosNegocio.equals(requisitosSoftware)) 
			return true;
		return false;			
	}
	
}
