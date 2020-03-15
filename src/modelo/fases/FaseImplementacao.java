package modelo.fases;

import static principal.Principal.*;

import java.util.ArrayList;

public class FaseImplementacao {

	public static void printFase (ArrayList<String> requisitos) {

		printAndWait("Checando testes...", 500);

		printAndWait("Esperando aceite da area de negocios...\n", 500);

		if (aprovacaoSoftware(requisitos, requisitos))
			System.out.println("Requisitos compativeis com a demanda. Software aceito pela area de negocios.");

		printAndWait("Iniciando esteira de producao...\n", 500);

		printAndWait("Criando versao executavel do software...\n", 1000);

		printAndWait("Aguardando criacao de espaco na nuvem...\n", 1000);
		
		printAndWait("Passando software do ambiente de desenvolvimento para o ambiente de producao...\n", 1000);

		printAndWait("Subindo software para producao...", 500);

		printAndWait("Configurando...", 500);

		printAndWait("Inicializando software...", 500);

		System.out.println("Fim da fase de implementacao.\n\n\n------------------------------------------------\n\n");

	}

	public static boolean aprovacaoSoftware (ArrayList<String> requisitosNegocio, ArrayList<String> requisitosSoftware) {
		if (requisitosNegocio.equals(requisitosSoftware))
			return true;
		return false;
	}

}
