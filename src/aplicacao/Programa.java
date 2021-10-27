package aplicacao;

import areahorta.Horta;

public class Programa {

	public static void main(String[] args) {
		Horta horta;
		
		InterfaceDoUsuario informacoesParaIrrigacao = new InterfaceDoUsuario();
		
		horta = informacoesParaIrrigacao.dimencionarHorta();
		horta.mostrarHorta();
		
		
	}
}
