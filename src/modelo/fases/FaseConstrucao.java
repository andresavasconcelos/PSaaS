package modelo.fases;

import static principal.Principal.printAndWait;

import java.util.ArrayList;

import modelo.mocks.Classe1;
import modelo.mocks.Classe2;

public class FaseConstrucao {
	
	public static void printFase (ArrayList<String> funcoes) {
		printAndWait("Analisando diagrama de classes...", 500);
		printAndWait("Iniciando fase de construcao...\n", 500);
		
		printAndWait("Contabilizando variaveis necessarias...\n", 1000);
		
		printAndWait("Criando classes " + Classe1.class + " e " + Classe2.class + "...", 500);
		
		System.out.println("Criando as seguintes funcoes para a classe " + Classe1.class + ": " + funcoes.get(0) + ", " + funcoes.get(1) + ", " + funcoes.get(2));  
		System.out.println("Criando as seguintes funcoes para a classe " + Classe2.class + ": " + funcoes.get(3) + ", " + funcoes.get(4) + ", " + funcoes.get(5));
				
		System.out.println("Fim da fase de construcao.\n\n\n------------------------------------------------\n\n");
		
	}
	
	public static ArrayList<String> montaListaFuncoes(int numInicial, int quantidade) {
		ArrayList<String> funcoes = new ArrayList<>();
		
		for(int i = numInicial; i <= quantidade + numInicial; i++) {
			funcoes.add(String.format("funcao%02d", i));
		}
		
		return funcoes;
	}
}
