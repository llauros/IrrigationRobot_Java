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
	
	public Irrigacao() {}
	
	public Irrigacao(Horta horta, Robo robo, Posicao[] posicoesParaIrrigar) {
		this.horta = horta;
		this.robo = robo;
		this.posicoesParaIrrigar = posicoesParaIrrigar;
		trajetoFeitoPeloRobo = new ArrayList<String>();
	}
	
	public String inicializarIrrigacao() {	
		trajetoFeitoPeloRobo = robo.meuTrajeto(posicoesParaIrrigar);
		ultimaOrientacaoDoRobo = robo.getOrientacaoAtual();	
		return "Caminho: "+trajetoFeitoPeloRobo+"\nOrientação final: "+ ultimaOrientacaoDoRobo;
	}
	
	public Horta getHorta() {
		return horta;
	}
	public void setHorta(Horta horta) {
		this.horta = horta;
	}
	public Robo getRobo() {
		return robo;
	}
	public void setRobo(Robo robo) {
		this.robo = robo;
	}
	public Posicao[] getPosicoesParaIrrigar() {
		return posicoesParaIrrigar;
	}
	public void setPosicoesParaIrrigar(Posicao[] posicoesParaIrrigar) {
		this.posicoesParaIrrigar = posicoesParaIrrigar;
	}	
}
