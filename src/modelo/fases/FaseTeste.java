package modelo.fases;

import static principal.Principal.printAndWait;

import java.util.ArrayList;

import modelo.mocks.Classe1;
import modelo.mocks.Classe2;

public class FaseTeste {
	public static void printFase(Class<Classe1> c1, Class<Classe2> c2, ArrayList<String> reqC1, ArrayList<String> reqC2) {
		printAndWait("Iniciando fase de testes...", 250);
		
		// teste de unidade
		TesteUnidade.rodaTeste(c1, c2, reqC1, reqC2);
		
		// teste de integracao
		System.out.println("Iniciando testes de inegracao...");
		printAndWait("Validando integracao entre as classes...", 500);
		printAndWait("Validando integracao entre as funcionalidades das classes...", 500);
		
		System.out.println("Validacoes bem sucedidas.");
		System.out.println("Fim dos testes de inegracao.\n\n\n---\n\n");
		
		// teste de sistema
		System.out.println("Iniciando testes de sistema...");
		printAndWait("Testando funcionalidades do sistema...", 250);
		printAndWait("Testando interfaces com o usuario...", 500);
		
		System.out.println("Testes concluidos com sucesso.");
		System.out.println("Fim dos testes de sistema.\n\n\n---\n\n");
		
		
		// teste de aceitacao operacional
		System.out.println("Iniciando testes de aceitacao operacional...");
		printAndWait("Testando requisito nao funcional " + reqC1.get(2) + "...", 250);
		printAndWait("Testando requisito nao funcional " + reqC2.get(2) + "...", 250);
		
		System.out.println("Testes concluidos com sucesso.");
		System.out.println("Fim dos testes de aceitacao operacional.\n\n\n---\n\n");
		
		System.out.println("Fim da fase de testes.\n\n\n------------------------------------------------\n\n");
	}
}
