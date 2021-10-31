package aplicacao;

import areahorta.Horta;
import areahorta.Posicao;
import irrigacao.Irrigacao;
import sistema.Robo;

public class Programa {

	public static void main(String[] args) {
		
		InterfaceDoUsuario informacoesParaIrrigacao = new InterfaceDoUsuario();
		
		Horta hortaJazz;
		Robo roboJazz;
		Posicao[] posicoesParaIrrigar;
		Irrigacao irrigar;
			
		// Dimencionando Horta
		hortaJazz = informacoesParaIrrigacao.dimencionarHorta();
		
		// Posi��es para irrigar
		posicoesParaIrrigar = informacoesParaIrrigacao.posicoesDasPlantasAIrrigar(hortaJazz);
		
		// Configurando Rob�	
		roboJazz = informacoesParaIrrigacao.configurarRobo(hortaJazz);
		
		// Iniciando uma nova irriga��o
		irrigar = new Irrigacao(hortaJazz, roboJazz, posicoesParaIrrigar);
		
		System.out.println("\n\n\tObrigado!\n\tAbra�os!");
		
		// ------------------------------------------
		// ---------- AMBIENTE DE TESTES ------------
		// ------------------------------------------
		// ------- REPRODU��O DO EXEMPLO DADO -------
		// ------------------------------------------
		
		/*Horta hortaTeste = new Horta(6, 5);
		Robo roboTeste = new Robo(new Posicao(3, 3), "N");
		Posicao[] posicoesTeste = {new Posicao(4,4), new Posicao(0,4), new Posicao(1,3)};	
		Irrigacao irrigacaoTeste;
		
		hortaTeste.mostrarHortaCompleta(posicoesTeste, roboTeste);
		irrigacaoTeste = new Irrigacao(hortaTeste, roboTeste, posicoesTeste);*/
		
	}
}
