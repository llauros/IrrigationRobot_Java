package aplicacao;

import java.util.Scanner;

import areahorta.Horta;
import areahorta.Posicao;
import sistema.Robo;
import sistema.ValidacaoSistema;

/**
 * 1 - Classe serve como interface para o usuário.
 * 2 - Apresenta e Recebe informações do usuário
 * 3 - Instancía objetos
 * @author llauro
 */
public class InterfaceDoUsuario {
	
	Scanner sc = new Scanner(System.in);
	private ValidacaoSistema validar;
	
	private Horta horta;
	
	public InterfaceDoUsuario() {
		validar = new ValidacaoSistema();
	}
		
	// DA PRA FAZER COM SET
	public Horta dimencionarHortaEPosicionarCanteiros() {
		horta = new Horta();
		
		horta = dimencionarHorta();
		//horta.posico
		
		return horta;
	}
		
	// --------------------------------------------------
	// ------------------- HORTA ------------------------
	// --------------------------------------------------
	Horta hortaDimencionada = new Horta();
	private int linhasParaHorta;
	private int colunasParaHorta;
	
	/**
	 * Retorna uma matriz para dimensionamento da horta
	 * 
	 * @return
	 */
	public Horta dimencionarHorta() {

		System.out.println("\tBem vindo ao Robot System H&H® - Irrigações Automatizadas	:)\n");
		System.out.println("Que tal começar pelo tamanha da sua horta?\n");

		System.out.print("Infome a quantidade de linhas: ");
		linhasParaHorta = validar.lerEValidarNumero();

		System.out.print("Infome a quantidade de colunas: ");
		colunasParaHorta = validar.lerEValidarNumero();
		
		hortaDimencionada.setLinhas(linhasParaHorta);
		hortaDimencionada.setColunas(colunasParaHorta);

		return hortaDimencionada;
	} // OKAY
		
	// --------------------------------------------------
	// ------------ CANTEIROS A IRRIGAR -----------------
	// --------------------------------------------------
	private Posicao[] posicoesParaIrrigar;
	private int quantidadeDeCanteirosParaIrrigar;

	/**
	 * Lê e valida as posições que serão irrigadas
	 * @param horta
	 * @return
	 */
	public Posicao[] posicoesDasPlantasAIrrigar(Horta horta) {

		// QUANTOS CANTEIROS SERÃO IRRIGADOS
		System.out.print("\nInforme quantos canteiros precisam ser irrigados: ");
		quantidadeDeCanteirosParaIrrigar = validar.lerEValidarAreDaHorta(horta);

		// POSICAO (linha x coluna) DOS CANTEIROS
		System.out.println("\nPerfeito!! Agora, só preciso saber quais canteiros devo irrigar!");
		System.out.println("Informe as coordenadas (linha-coluna) que deseja irrigar..\n");
		//horta.mostrarHorta();

		System.out.println("\n - - - ");
		System.out.println(" - - - ");
		System.out.println(" - - - ");
		System.out.println(" - - - ");

		// ------- PEGAR POSICOES DOS CANTEIROS
		posicoesParaIrrigar = validar.posicaoDosCanteirosParaIrrigar(horta, quantidadeDeCanteirosParaIrrigar);

		return posicoesParaIrrigar;
	} // CATEIROS A IRRIGAR -------------------------------------
	
	
	
	
	// --------------------------------------------------
	// --------------------------------------------------
	// --------------------- ROBO -----------------------
	// --------------------------------------------------
	// --------------------------------------------------
	private Robo roboConfigurado;
	private String orientacaoDoRobo;
	private Posicao posicaoInicialRobo;
	
	/**
	 * Retorna um Robo configurado
	 * @param robo
	 * @param horta
	 * @return
	 */
	public Robo configurarRobo(Horta horta) {
		
		roboConfigurado = new Robo();
		
		posicaoInicialRobo = posicionarInicialrRobo(horta);	
		
		orientacaoDoRobo = orientacaoInicialrRobo();
		
		System.out.println("----------------------");
	
		roboConfigurado = new Robo(posicaoInicialRobo, orientacaoDoRobo);
		


		
		return roboConfigurado;
	}
	
	/**
	 * Posiciona o Robo
	 * @param robo
	 * @param horta
	 * @return
	 */
	private Posicao posicionarInicialrRobo( Horta horta) {
		System.out.print("Infome a coordenada inicial...");
		return validar.posicaoInicialValidaDoRobo(horta) ;
	}
	
	/**
	 * Retorna uma orientacao (N,S,L,O) para o robo
	 * @return
	 */
	private String orientacaoInicialrRobo() {
		System.out.print("Qual será minha orientação inicial? Norte(N), Sul(S), Leste(L) ou Oeste(O)");
		System.out.print("\tN S L O");	
		return validar.validarOrientacao();
	}
	
	
	
}
