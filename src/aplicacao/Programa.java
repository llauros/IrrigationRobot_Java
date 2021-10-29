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
		
		String resolucaoDoProblema = new String();
		
		// Dimencionando Horta
		hortaJazz = informacoesParaIrrigacao.dimencionarHorta();
		
		// Posi��es para irrigar
		posicoesParaIrrigar = informacoesParaIrrigacao.posicoesDasPlantasAIrrigar(hortaJazz);
		
		// Configurando Rob�	
		roboJazz = informacoesParaIrrigacao.configurarRobo(hortaJazz);
		
		// Configura��es para irriga��o
		irrigar = new Irrigacao(hortaJazz, roboJazz, posicoesParaIrrigar);
		resolucaoDoProblema = irrigar.inicializarIrrigacao();
		
		System.out.println("Resolu��o do teste");
		System.out.println(resolucaoDoProblema);
			
		// ------------------------------------------
		// ---------- AMBIENTE DE TESTES ------------
		// ------------------------------------------
		// ------- REPRODU��O DO EXEMPLO DADO -------
		
		/*Horta hortaTeste = new Horta(3, 3);
		Robo roboTeste = new Robo(new Posicao(0, 0), "N");
		Posicao[] posicoesTeste = {new Posicao(0,1)};
		
		Irrigacao irrigaraaa = new Irrigacao();
		
		irrigaraaa = new Irrigacao(hortaTeste, roboTeste, posicoesTeste);
		irrigaraaa.inicializarIrrigacao();
		
		System.out.println(irrigaraaa.inicializarIrrigacao());*/
		
		//hortaAA.mostrarHortaCompleta(posicoesAAA, roboAA);
		//hortaAA.mostrarHortaComRobo(roboAA);
	}
}
