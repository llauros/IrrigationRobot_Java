package irrigacao;

import java.util.ArrayList;

import areahorta.Horta;
import areahorta.Posicao;
import sistema.Robo;

public class Irrigacao {
	Horta horta;
	Robo robo;
	Posicao[] posicoesParaIrrigar;
	ArrayList<String> trajetoFeitoPeloRobo;
	String ultimaOrientacaoDoRobo;
	
	String resolucaoDoProblema;
	
	public Irrigacao() {}
	
	public Irrigacao(Horta horta, Robo robo, Posicao[] posicoesParaIrrigar) {
		this.horta = horta;
		this.robo = robo;
		this.posicoesParaIrrigar = posicoesParaIrrigar;
		trajetoFeitoPeloRobo = new ArrayList<String>();
		ultimaOrientacaoDoRobo = new String();
		resolucaoDoProblema = new String();
		
		inicializarIrrigacao();
	}
	
	public void inicializarIrrigacao() {	
		
		trajetoFeitoPeloRobo = robo.meuTrajeto(posicoesParaIrrigar);
		ultimaOrientacaoDoRobo = robo.getOrientacaoAtual();
		
		System.out.println("\n");
		resolucaoDoProblema = "\tCaminho: "+ trajetoFeitoPeloRobo + "\n\tOrientação final: " + ultimaOrientacaoDoRobo ;
		
		System.out.println(resolucaoDoProblema);
		horta.mostrarHortaCompleta(posicoesParaIrrigar, robo);
	}
	
	/**
	 * Quero muito me tornar um Jazz :)
	 * Abraços!
	 */
}
