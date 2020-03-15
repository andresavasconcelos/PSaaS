package modelo.mocks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Classe2 {
	private ArrayList<String> requisitosAssociados;
	
	public Classe2(ArrayList<String> requisitos) {
		this.requisitosAssociados = new ArrayList<>(requisitos);
	}
	
	public List<String> getRequisitos() {
		return Collections.unmodifiableList(this.requisitosAssociados);
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
