package aplicacao;

import java.util.Scanner;

import areahorta.Horta;
import areahorta.Posicao;
import sistema.ValidacaoSistema;

/**
 * 1 - Classe serve como interface para o usu�rio.
 * 2 - Apresenta e Recebe informa��es do usu�rio
 * 3 - Instanc�a objetos
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

		System.out.println("\tBem vindo ao Robot System H&H� - Irriga��es Automatizadas	:)\n");
		System.out.println("Que tal come�ar pelo tamanha da sua horta?\n");

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
	 * L� e valida as posi��es que ser�o irrigadas
	 * @param horta
	 * @return
	 */
	public Posicao[] posicoesDasPlantasAIrrigar(Horta horta) {

		// QUANTOS CANTEIROS SER�O IRRIGADOS
		System.out.print("\nInforme quantos canteiros precisam ser irrigados: ");
		quantidadeDeCanteirosParaIrrigar = validar.lerEValidarAreDaHorta(horta);
		

		// POSICAO (linha x coluna) DOS CANTEIROS
		System.out.println("\nPerfeito!! Agora, s� preciso saber quais canteiros devo irrigar!");
		System.out.println("Informe as coordenadas (linha-coluna) que deseja irrigar..\n");
		horta.mostrarHorta();

		System.out.println("\n - - - ");
		System.out.println(" - - - ");
		System.out.println(" - - - ");
		System.out.println(" - - - ");

		// ------- PEGAR POSICOES DOS CANTEIROS
		posicoesParaIrrigar = validar.posicaoDosCanteirosParaIrrigar(horta, quantidadeDeCanteirosParaIrrigar);

		return posicoesParaIrrigar;
	} // CATEIROS A IRRIGAR -------------------------------------
	
	
	
}
