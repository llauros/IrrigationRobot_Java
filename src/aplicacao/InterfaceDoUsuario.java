package aplicacao;

import java.util.Scanner;

import areahorta.Horta;
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
	
	public InterfaceDoUsuario() {
		validar = new ValidacaoSistema();
	}
	
	// HORTA --------------------------------------------------
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
	}
	// HORTA --------------------------------------------------
	
}
