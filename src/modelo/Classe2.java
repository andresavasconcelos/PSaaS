package modelo;

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
		return 10;
	}
	
	public boolean funcionalidade2() {
		return true;
	}
	
	public char funcionalidade3() {
		return 'a';
	}
}
