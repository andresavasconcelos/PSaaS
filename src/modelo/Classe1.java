package modelo;

import java.util.ArrayList;
import java.util.Collections;

public class Classe1 {
	private ArrayList<String> requisitosAssociados;
	
	public Classe1(ArrayList<String> requisitos) {
		this.requisitosAssociados = new ArrayList<>(requisitos);
	}
	
	public ArrayList<String> getRequisitos() {
		return (ArrayList<String>) Collections.unmodifiableList(this.requisitosAssociados);
	}
	
	public String funcionalidade1() {
		System.out.println("Executando a funcionalidade1 da classe 1.");
		return "string";
	}
	
	public Object funcionalidade2() {
		System.out.println("Executando a funcionalidade2 da classe 1.");
		return new Object();
	}
	
	public void funcionalidade3() {
		System.out.println("Executando a funcionalidade3 da classe 1.");
	}
}
