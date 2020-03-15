package modelo.fases;

import static principal.Principal.printAndWait;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

import modelo.mocks.Classe1;
import modelo.mocks.Classe2;

public class TesteUnidade {
	public static void rodaTeste(Class<Classe1> c1, Class<Classe2> c2, ArrayList<String> reqC1, ArrayList<String> reqC2) {
		printAndWait("Iniciando testes de unidade...", 500);
		
		// pegando todos os metodos das classes testadas
		printAndWait("Coletando metodos das classes...", 500);
		ArrayList<Method> metodosClasse1 = new ArrayList<>(Arrays.asList(c1.getDeclaredMethods()));
		ArrayList<Method> metodosClasse2 = new ArrayList<>(Arrays.asList(c2.getDeclaredMethods()));
		
		// gerando instancias das classes
		printAndWait("Gerando instancias das classes para testes...", 500);
		Classe1 c1Instancia = new Classe1(reqC1);
		Classe2 c2Instancia = new Classe2(reqC2);
		
		try {
			printAndWait("\n\nIniciando testes da classe " + c1, 500);
			
//			// fazendo casos de teste para a classe 1
			for(Method metodo : metodosClasse1) {
				rodaCasosTeste(metodo, c1Instancia, 3);
			}
			
			printAndWait("\n\nIniciando testes da classe " + c2, 500);
			
			// fazendo casos de teste para a classe 2
			for(Method metodo : metodosClasse2) {
				rodaCasosTeste(metodo, c2Instancia, 3);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("\nFim dos testes de unidade.\n");
	}
	
	private static void rodaCasosTeste(Method metodo, Object instancia, int qtdCasos) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		printAndWait("\nIniciando testes no metodo " + metodo.getName() + "...", 250);
	
		for(int i = 0; i < qtdCasos; i++) {
			metodo.invoke(instancia);
			System.out.println("Caso de teste " + i + " no metodo " + metodo.getName() + " executou corretamente.");
		}
	}
}
