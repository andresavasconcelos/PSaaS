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
		
		
		// teste de sistema
		
		
		// teste de aceitacao operacional
	}
}
