package aplicacao;

import areahorta.Horta;
import areahorta.Posicao;
import sistema.Robo;
import sistema.ValidacaoSistema;

/**
 * Classe serve como interface para o usu�rio. Apresenta e Recebe informa��es do usu�rio. Instanc�a objetos.
 * 
 * @author llauro
 */
public class InterfaceDoUsuario {
	
	private ValidacaoSistema validar;
	
	public InterfaceDoUsuario() {
		validar = new ValidacaoSistema();
	}
		
	// --------------------------------------------------
	// ------------------- HORTA ------------------------
	// --------------------------------------------------	
	/**
	 * Retorna uma matriz para dimensionamento da horta
	 * @return
	 */
	public Horta dimencionarHorta() {
		Horta novaHorta;	
		int linhasParaHorta;
		int colunasParaHorta;
		
		System.out.println("\tBem vindo ao Robot System H&H� - Irriga��es Automatizadas	:)\n");
		System.out.println("\tQue tal come�ar pelo tamanha da sua horta?\n");

		System.out.print("Infome a quantidade de linhas: ");
		linhasParaHorta = validar.lerEValidarNumero();

		System.out.print("Infome a quantidade de colunas: ");
		colunasParaHorta = validar.lerEValidarNumero();
		
		System.out.print("\n\t...Dimencionando sua horta\n");
		novaHorta = new Horta(linhasParaHorta, colunasParaHorta);
		novaHorta.mostrarHorta();
		return novaHorta;
	}
		
	// --------------------------------------------------
	// ------------ CANTEIROS A IRRIGAR -----------------
	// --------------------------------------------------
	private Posicao[] posicoesParaIrrigar;
	private int quantidadeDeCanteirosParaIrrigar;

	/**
	 * L� e valida as posi��es que ser�o irrigadas
	 * @param horta
	 * @return
	 */
	public Posicao[] posicoesDasPlantasAIrrigar(Horta horta) {

		// QUANTOS CANTEIROS SER�O IRRIGADOS
		System.out.print("\n\tQuantos canteiros precisam ser irrigados?\nDigite: ");
		quantidadeDeCanteirosParaIrrigar = validar.lerEValidarAreDaHorta(horta);

		System.out.println();
		// PEGAR POSICOES DOS CANTEIROS
		System.out.println("\tPerfeito! Agora, preciso saber quais canteiros devo irrigar!");
		System.out.println("\tInforme as coordenadas (linha-coluna) que deseja irrigar...");
		posicoesParaIrrigar = validar.posicaoDosCanteirosParaIrrigar(horta, quantidadeDeCanteirosParaIrrigar);

		return posicoesParaIrrigar;
	}
	
	// --------------------------------------------------
	// --------------------- ROBO -----------------------
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
		System.out.println();
		System.out.print("\tInforme qual ser� a coordenada inicial do rob�...\n");
		return validar.posicaoInicialValidaDoRobo(horta) ;
	}
	
	/**
	 * Retorna uma orientacao (N,S,L,O) para o robo
	 * @return
	 */
	private String orientacaoInicialrRobo() {
		System.out.println();
		System.out.print("\tQual ser� minha orienta��o inicial? Digite: Norte(N), Sul(S), Leste(L) ou Oeste(O)\nDigite: ");
			
		return validar.validarOrientacao();
	}
}