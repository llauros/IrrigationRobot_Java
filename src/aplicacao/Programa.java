package aplicacao;

import java.util.ArrayList;

import areahorta.Horta;
import areahorta.Posicao;
import sistema.Robo;

public class Programa {

	public static void main(String[] args) {
		
		InterfaceDoUsuario informacoesParaIrrigacao = new InterfaceDoUsuario();
		
		// -----------------------------------------------------------------
		// ---------------------------- HORTA ------------------------------
		// -----------------------------------------------------------------
		
		/*hortaDaLEh = informacoesParaIrrigacao.dimencionarHorta();
		hortaDaLEh.mostrarHorta();*/
		
		
		
		
		/*
		 * 				N
		 * 
		 *    -------------------------
		 *	3 |		|	-	|		|
   			---------------------------
O			2 |	-	|	/\	|	-	|             L
			   -------------------------
			1 |		|	-	|	X	|
			   -----------------------
		 * 				S
		 * 
		 */
		// -----------------------------------------------------------------
		// ----------------------------- ROBO ------------------------------
		// -----------------------------------------------------------------
		Horta hortaDaLEh = new Horta(3,3);
		Robo roboTeste = new Robo(new Posicao(1, 1), "N");
		Posicao posicaoTeste = new Posicao(2,2);
		
		//roboTeste = informacoesParaIrrigacao.configurarRobo(hortaDaLEh);
		
		
		
		System.out.println(roboTeste.pontoDeReferencia(posicaoTeste));
		
		roboTeste.proximaAcao(posicaoTeste);
		roboTeste.proximaAcao(posicaoTeste);
		roboTeste.proximaAcao(posicaoTeste);
		roboTeste.proximaAcao(posicaoTeste);
		roboTeste.proximaAcao(posicaoTeste);
		System.out.println(roboTeste.getAcoes());
		
		
		System.out.println(roboTeste.getPosicaoAtual());
		System.out.println(roboTeste.getOrientacaoAtual());

		//System.out.println(robo.getOrientacaoAtual());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// -----------------------------------------------------------------
		// ----------------- POSICOES PARA IRRIGAR -------------------------
		// -----------------------------------------------------------------
		Posicao[] posicoesParaIrrigar;
		Horta hortaTeste = new Horta(3,3);
		posicoesParaIrrigar = informacoesParaIrrigacao.posicoesDasPlantasAIrrigar(hortaTeste);
		hortaTeste.mostrarHortaComCanteiro(posicoesParaIrrigar);
		
		
		
		/*System.out.println("AS POSICOES !!!");
		System.out.println(posicoesParaIrrigar[0]);
		System.out.println(posicoesParaIrrigar[1]);
		System.out.println(posicoesParaIrrigar[2]);*/
		
		

		
		
		
		
		
		
		
		
		/*jakersRobot = informacoesParaIrrigacao.configurarRobo(hortaDaLEh);
		hortaDaLEh.mostrarHortaComRobo(jakersRobot);*/
			
		

		
		
		System.out.println("FIM");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Horta horta;
		Posicao[] posicoesTeste;
		Robo robo;
		
		horta = new Horta(3,3);
		Posicao posicao = new Posicao(2, 2);
		
		
		//horta = informacoesParaIrrigacao.dimencionarHorta();
		
		horta.mostrarHorta();
		
		//posicoesTeste = informacoesParaIrrigacao.posicoesDasPlantasAIrrigar(horta);
		
		
		robo = new Robo(new Posicao(0, 0), "N");
		System.out.println(robo.pontoDeReferencia(posicao));
		
		/*
		 * 
		 * 
		 * 	/\
		 * 
		 * 
		 * 
		 * 
		 *                  xxx
		 * 					 I
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*		System.out.println("Minha Posicao atual é");
		System.out.println(posicaoInicialRobo);
		System.out.println("----------------------");
		 * 
		 * System.out.println("Minha Posicao atual é");
		System.out.println(orientacaoDoRobo);
		System.out.println(roboConfigurado.getPosicaoAtual());
		System.out.println(roboConfigurado.getOrientacaoAtual());*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//horta.mostrarHorta();
		
		
		// AMBIENTE DE TESTES		
		/*Horta hortaTeste = new Horta(3, 3);
		Posicao[] canteiroTeste = {new Posicao(0, 0), new Posicao(0, 2)};
		
		Posicao[] canteiroTesteA = {new Posicao(0, 0), new Posicao(0, 1), };
		Canteiro can = new Canteiro();
		Canteiro canB = new Canteiro(canteiroTesteA);
		
		canteiroTeste = informacoesParaIrrigacao.posicoesDasPlantasAIrrigar(hortaTeste);
		
		can = new Canteiro(canteiroTeste);
		System.out.println(can.getCabteirosParaIrrigar()[0].getLinha() == canB.getCabteirosParaIrrigar()[0].getLinha()
				&& can.getCabteirosParaIrrigar()[0].getColuna() == canB.getCabteirosParaIrrigar()[0].getColuna());
		
		System.out.println(can.getCabteirosParaIrrigar()[0].getLinha() == 0);
		
		System.out.println(can.getCabteirosParaIrrigar()[0]);
		System.out.println(can.getCabteirosParaIrrigar()[1]);
		System.out.println(can.getCabteirosParaIrrigar()[3]);
		


		System.out.println();*/
	}
}
