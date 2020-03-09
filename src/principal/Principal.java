package principal;

import java.util.ArrayList;
import java.util.Collections;

import modelo.Classe1;
import modelo.Classe2;

public class Principal {

	public static void main(String[] args) {
		// fase de requisitos
		ArrayList<String> requisitos = montaListaRequisitos(1, 12);
		printFaseRequisitos(requisitos);
		// fase de projeto
		
		
		
		// fase de construcao

		

		// fase de testes
		
		
		// fase de implementacao
	}
	
	public static ArrayList<String> montaListaRequisitos(int numInicial, int quantidade) {
		ArrayList<String> requisitos = new ArrayList<>();
		
		for(int i = numInicial; i <= quantidade + numInicial; i++) {
			requisitos.add(String.format("requisito%02d", i));
		}
		
		Collections.shuffle(requisitos);
		return requisitos;
	}
	
	public static void printAndWait(String msg, int millis) throws InterruptedException {
		System.out.println(msg);
		Thread.sleep(millis);
	}
	
	public static void printFaseRequisitos(ArrayList<String> requisitos) {
		// o try-catch esta aqui por causa dos Thread.sleep()
		try {
			printAndWait("Iniciando coleta de requisitos...\nRecebendo requisitos...", 1000);
			System.out.println("Os requisitos recebidos sao: " + requisitos + "\n");
			
			// estudo de viabilidade
			printAndWait("Iniciando estudo de viabilidade...", 1000);
			System.out.println("Os requisitos sao viaveis de serem implementados.\n");
			
			// elicitacao e analise
			printAndWait("Ajustando a prioridade dos requisitos...", 1000);
			Collections.sort(requisitos);
			System.out.println("Os requisitos em ordem sao: " + requisitos + "\n");
			
			printAndWait("Definindo tipo dos requisitos...", 1500);
			System.out.println("Os requisitos funcionais sao: " + requisitos.get(0) + ", " + requisitos.get(1) + ", " + requisitos.get(7) + ", " + requisitos.get(8));
			System.out.println("Os requisitos nao funcionais sao: " + requisitos.get(2) + ", " + requisitos.get(9));
			System.out.println("Os requisitos de dominio sao: " + requisitos.get(3) + ", " + requisitos.get(10));
			System.out.println("Os requisitos de dados sao: " + requisitos.get(4) + ", " + requisitos.get(11));
			System.out.println("As regras de negocio sao: " + requisitos.get(5) + ", " + requisitos.get(12) + "\n");
			
			// especificacao
			printAndWait("Definindo especificacoes dos requisitos...", 500);
			printAndWait("Gerando modelo UML...", 1000);
			printAndWait("Gerando especificacao formal...", 1000);
			System.out.println("Modelos e especificacoes geradas com sucesso.\n");
			
			// validacao
			printAndWait("Validando completude e consistencia dos requisitos...", 1500);
			System.out.println("Requisitos validados com sucesso.\n");
			
			
			System.out.println("Fim da fase de requisitos.\n\n----\n");
		} catch (InterruptedException e) {}
	}
	
	public static void printInicioFaseProjeto(ArrayList<String> requisitos1, ArrayList<String> requisitos2) {
		System.out.println("Iniciando o projeto do sistema...");
		
		System.out.println("Os requisitos: " + requisitos1 + " serao associados a classe: " + Classe1.class);
		System.out.println("Os requisitos: " + requisitos2 + " serao associados a classe: " + Classe2.class);
	}
}











