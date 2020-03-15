package modelo.mocks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Classe1 {
	private ArrayList<String> requisitosAssociados;
	
	public Classe1(ArrayList<String> requisitos) {
		this.requisitosAssociados = new ArrayList<>(requisitos);
	}
	
	public List<String> getRequisitos() {
		return Collections.unmodifiableList(this.requisitosAssociados);
	}
	
	public String funcionalidade1() {
		return "string";
	}
	
	public Object funcionalidade2() {
		return new Object();
	}
	
	public void funcionalidade3() {
		return;
	}
}
