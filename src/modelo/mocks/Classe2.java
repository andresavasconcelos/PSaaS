package modelo.mocks;

import java.util.ArrayList;
import java.util.Collections;

public class Classe2 {
	private ArrayList<String> requisitosAssociados;
	
	public Classe2(ArrayList<String> requisitos) {
		this.requisitosAssociados = new ArrayList<>(requisitos);
	}
	
	public ArrayList<String> getRequisitos() {
		return (ArrayList<String>) Collections.unmodifiableList(this.requisitosAssociados);
	}
	
	public int funcionalidade1() {
		System.out.println("Executando a funcionalidade1 da classe 2.");
		return 10;
	}
	
	public boolean funcionalidade2() {
		System.out.println("Executando a funcionalidade2 da classe 2.");
		return true;
	}
	
	public char funcionalidade3() {
		System.out.println("Executando a funcionalidade3 da classe 2.");
		return 'a';
	}
}
