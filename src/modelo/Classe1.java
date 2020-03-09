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
		return "string";
	}
	
	public Object funcionalidade2() {
		return new Object();
	}
	
	public void funcionalidade3() {
		System.out.println("Print executando a funcionalidade3.");
	}
}
