package areahorta;

public class Canteiro {
	private Posicao[] cabteirosParaIrrigar;

	public Canteiro() {}
	
	public Canteiro(Posicao[] cabteirosParaIrrigar) {
		this.cabteirosParaIrrigar = cabteirosParaIrrigar;
	}
	public Posicao[] getCabteirosParaIrrigar() {
		return cabteirosParaIrrigar;
	}
	public void setCabteirosParaIrrigar(Posicao[] cabteirosParaIrrigar) {
		this.cabteirosParaIrrigar = cabteirosParaIrrigar;
	}

	@Override
	public String toString() {
		return "C";
	}
	
	
}
