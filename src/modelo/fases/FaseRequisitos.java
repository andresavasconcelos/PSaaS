package modelo.fases;

import static principal.Principal.printAndWait;

import java.util.ArrayList;

public class FaseRequisitos {
	
	public static ArrayList<String> montaListaRequisitos(int numInicial, int quantidade) {
		ArrayList<String> requisitos = new ArrayList<>();
		
		for(int i = numInicial; i <= quantidade + numInicial; i++) {
			requisitos.add(String.format("requisito%02d", i));
		}
		
		return requisitos;
	}
	
	public static void printFase(ArrayList<String> requisitos) {
		System.out.println("Iniciando fase de requisitos...\n");
		
		// estudo de viabilidade
		printAndWait("Iniciando estudo de viabilidade...", 1000);
		System.out.println("O software e viavel de ser implementado.\n");
		
		// elicitacao e analise
		printAndWait("Iniciando coleta de requisitos...\nRecebendo requisitos...", 1000);
		System.out.println("Os requisitos recebidos sao: " + requisitos + "\n");
		
		printAndWait("Definindo tipo dos requisitos...", 1500);
		System.out.println("Os requisitos funcionais sao: " + requisitos.get(0) + ", " + requisitos.get(1) + ", " + requisitos.get(6) + ", " + requisitos.get(7));
		System.out.println("Os requisitos nao funcionais sao: " + requisitos.get(2) + ", " + requisitos.get(8));
		System.out.println("Os requisitos de dominio sao: " + requisitos.get(3) + ", " + requisitos.get(9));
		System.out.println("Os requisitos de dados sao: " + requisitos.get(4) + ", " + requisitos.get(10));
		System.out.println("As regras de negocio sao: " + requisitos.get(5) + ", " + requisitos.get(11) + "\n");
		
		printAndWait("Ajustando a prioridade dos requisitos...", 1000);
		System.out.println("Prioridade ajustada.\n");
		
		// especificacao
		printAndWait("Definindo especificacoes dos requisitos...", 500);
		printAndWait("Gerando modelo UML abstrato do sistema...", 1000);
		printAndWait("Gerando especificacao formal do sistema...", 1000);
		System.out.println("Modelos e especificacoes geradas com sucesso.\n");
		
		// validacao
		printAndWait("Validando completude e consistencia dos requisitos...", 1500);
		System.out.println("Requisitos validados com sucesso.\n");
		
		System.out.println("Fim da fase de requisitos.\n\n\n------------------------------------------------\n\n");
	}
}
