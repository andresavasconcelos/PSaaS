package principal;

import java.util.ArrayList;

import modelo.fases.FaseConstrucao;
import modelo.fases.FaseProjeto;
import modelo.fases.FaseRequisitos;
import modelo.fases.FaseImplementacao;

public class Principal {

	public static void main(String[] args) {
		// fase de requisitos
		ArrayList<String> requisitos = FaseRequisitos.montaListaRequisitos(1, 11);
		FaseRequisitos.printFase(requisitos);
		
		// fase de projeto
		FaseProjeto.printFase(requisitos);
		
		// fase de construcao
		ArrayList<String> funcoes = FaseConstrucao.montaListaFuncoes(1, 6);
		FaseConstrucao.printFase(funcoes);

		
		// fase de testes
		
		
		// fase de implementacao
		FaseImplementacao.printFase(requisitos);
	}
	
	public static void printAndWait(String msg, int millis) {
		System.out.println(msg);
		
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {}
	}	
}
