package principal;

import java.util.ArrayList;

import modelo.fases.FaseConstrucao;
import modelo.fases.FaseImplementacao;
import modelo.fases.FaseProjeto;
import modelo.fases.FaseRequisitos;
import modelo.fases.FaseTeste;
import modelo.mocks.Classe1;
import modelo.mocks.Classe2;

public class Principal {

	public static void main(String[] args) {
		// fase de requisitos
		ArrayList<String> requisitos = FaseRequisitos.montaListaRequisitos(1, 11);
		FaseRequisitos.printFase(requisitos);
//
//		// fase de projeto
		FaseProjeto.printFase(requisitos);
//
//		// fase de construcao
		ArrayList<String> funcoes = FaseConstrucao.montaListaFuncoes(1, 6);
		FaseConstrucao.printFase(funcoes);


		// fase de testes
		ArrayList<String> reqC1 = new ArrayList<>(requisitos.subList(0, 6));
		ArrayList<String> reqC2 = new ArrayList<>(requisitos.subList(6, 12));
		FaseTeste.printFase(Classe1.class, Classe2.class, reqC1, reqC2);

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
