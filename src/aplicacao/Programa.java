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
		
		// Posições para irrigar
		posicoesParaIrrigar = informacoesParaIrrigacao.posicoesDasPlantasAIrrigar(hortaJazz);
		
		// Configurando Robô	
		roboJazz = informacoesParaIrrigacao.configurarRobo(hortaJazz);
		
		// Configurações para irrigação
		irrigar = new Irrigacao(hortaJazz, roboJazz, posicoesParaIrrigar);
		resolucaoDoProblema = irrigar.inicializarIrrigacao();
		
		System.out.println("Resolução do teste");
		System.out.println(resolucaoDoProblema);
			
		// ------------------------------------------
		// ---------- AMBIENTE DE TESTES ------------
		// ------------------------------------------
		// ------- REPRODUÇÃO DO EXEMPLO DADO -------
		
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
