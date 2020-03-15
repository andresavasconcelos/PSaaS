package modelo.mocks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Classe1 {
	private ArrayList<String> requisitosAssociados;
	
	public Classe1(ArrayList<String> requisitos) {
		this.requisitosAssociados = new ArrayList<>(requisitos);
	}
	
	public String funcao01() {
		return "string";
	}
	
	public Object funcao02() {
		return new Object();
	}
	
	public void funcao03() {
		return;
	}
}
