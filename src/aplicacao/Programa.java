package aplicacao;

import areahorta.Horta;
import areahorta.Posicao;

public class Programa {

	public static void main(String[] args) {
		Horta horta;
		
		InterfaceDoUsuario informacoesParaIrrigacao = new InterfaceDoUsuario();
		
		/*horta = informacoesParaIrrigacao.dimencionarHorta();
		horta.mostrarHorta();*/
		
		
		
		
		// AMBIENTE DE TESTES		
		Horta hortaTeste = new Horta(3, 3);
		Posicao[] canteiroTeste;
		
		canteiroTeste = informacoesParaIrrigacao.posicoesDasPlantasAIrrigar(hortaTeste);
		
		System.out.println(canteiroTeste[0]);
		System.out.println(canteiroTeste[1]);
		System.out.println(canteiroTeste[2]);
	}
}
