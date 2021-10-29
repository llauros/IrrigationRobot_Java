package aplicacao;

import areahorta.Horta;
import areahorta.Posicao;
import sistema.Robo;
import sistema.ValidacaoSistema;

/**
 * Classe serve como interface para o usuário. Apresenta e Recebe informações do usuário. Instancía objetos.
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
		
		System.out.println("\tBem vindo ao Robot System H&H® - Irrigações Automatizadas	:)\n");
		System.out.println("\tQue tal começar pelo tamanha da sua horta?\n");

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
	 * Lê e valida as posições que serão irrigadas
	 * @param horta
	 * @return
	 */
	public Posicao[] posicoesDasPlantasAIrrigar(Horta horta) {

		// QUANTOS CANTEIROS SERÃO IRRIGADOS
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
		System.out.print("\tInforme qual será a coordenada inicial do robô...\n");
		return validar.posicaoInicialValidaDoRobo(horta) ;
	}
	
	/**
	 * Retorna uma orientacao (N,S,L,O) para o robo
	 * @return
	 */
	private String orientacaoInicialrRobo() {
		System.out.println();
		System.out.print("\tQual será minha orientação inicial? Digite: Norte(N), Sul(S), Leste(L) ou Oeste(O)\nDigite: ");
			
		return validar.validarOrientacao();
	}
}