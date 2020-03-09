package principal;

import java.util.ArrayList;

import modelo.Classe1;
import modelo.Classe2;

public class Principal {

	public static void main(String[] args) {
		ArrayList<String> requisitosClasse1 = montaListaRequisitos(1, 5);
		ArrayList<String> requisitosClasse2 = montaListaRequisitos(7, 5);
		
		printFaseRequisitos(requisitosClasse1, requisitosClasse2);
		
		printInicioFaseProjeto(requisitosClasse1, requisitosClasse2);
		
		Classe1 c1 = new Classe1(requisitosClasse1);
		Classe2 c2 = new Classe2(requisitosClasse2);
		
		System.out.println("Fim da fase de projeto.\n\n");
	}
	
	public static ArrayList<String> montaListaRequisitos(int numInicial, int quantidade) {
		ArrayList<String> requisitos = new ArrayList<>();
		
		for(int i = numInicial; i <= quantidade + numInicial; i++) {
			requisitos.add("requisito" + i);
		}
		
		return requisitos;
	}
	
	public static void printFaseRequisitos(ArrayList<String> requisitos1, ArrayList<String> requisitos2) {
		System.out.println("Iniciando coleta de requisitos...");
		
		ArrayList<String> requisitosTotal = new ArrayList<>(requisitos1);
		requisitosTotal.addAll(requisitos2);
		
		System.out.println("Recebendo requisitos...");
		System.out.println("Os requisitos recebidos sao: " + requisitosTotal);
		System.out.println("Fim da coleta de requisitos.\n\n");
	}
	
	public static void printInicioFaseProjeto(ArrayList<String> requisitos1, ArrayList<String> requisitos2) {
		System.out.println("Iniciando o projeto do sistema...");
		
		System.out.println("Os requisitos: " + requisitos1 + " serao associados a classe: " + Classe1.class);
		System.out.println("Os requisitos: " + requisitos2 + " serao associados a classe: " + Classe2.class);
	}
}











