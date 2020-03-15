package modelo.mocks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Classe2 {
	private ArrayList<String> requisitosAssociados;
	
	public Classe2(ArrayList<String> requisitos) {
		this.requisitosAssociados = new ArrayList<>(requisitos);
	}
	
	public int funcao01() {
		return 10;
	}
	
	public boolean funcao02() {
		return true;
	}
	
	public char funcao03() {
		return 'a';
	}
}
