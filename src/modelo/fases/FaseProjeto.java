package modelo.fases;

import static principal.Principal.printAndWait;

import java.util.ArrayList;

import modelo.mocks.Classe1;
import modelo.mocks.Classe2;

public class FaseProjeto {
	public static void printFase(ArrayList<String> requisitos) {
		System.out.println("Iniciando fase de projeto...\n");
		
		printAndWait("Analisando as interacoes entre os requisitos...\n", 1000);
		
		System.out.println("Os requisitos funcionais " + requisitos.get(0) + " e " + requisitos.get(1) + " estao associados com o requisito nao funcional " + requisitos.get(2));
		System.out.println("Esses requisitos estao associados ao dominio " + requisitos.get(3) + " e os dados usados por esses requisitos estao associados a " + requisitos.get(4));
		printAndWait("A regra de negocio associada a esses requisitos e: " + requisitos.get(5) + "\n", 500);
		
		System.out.println("Os requisitos funcionais " + requisitos.get(6) + " e " + requisitos.get(7) + " estao associados com o requisito nao funcional " + requisitos.get(8));
		System.out.println("Esses requisitos estao associados ao dominio " + requisitos.get(9) + " e os dados usados por esses requisitos estao associados a " + requisitos.get(10));
		printAndWait("A regra de negocio associada a esses requisitos e: " + requisitos.get(11) + "\n", 500);
		
		printAndWait("Os requisitos " + requisitos.subList(0, 6) + " serao representados pela classe \"" + Classe1.class + "\"", 250);
		printAndWait("Os requisitos " + requisitos.subList(6, 12) + " serao representados pela classe \"" + Classe2.class + "\"\n", 250);
		
		printAndWait("Escolhendo os design patterns mais adequados para implementacao...", 1000);
		printAndWait("Gerando diagrama UML de classes...", 1000);
		System.out.println("Diagrama UML gerado com sucesso.\n");
		
		System.out.println("Fim da fase de projeto.\n\n\n------------------------------------------------\n\n");
	}
}
