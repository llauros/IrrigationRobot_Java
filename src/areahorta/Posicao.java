package areahorta;

public class Posicao {

	private int linha;
	private int coluna;
	
	//VARIAVEIS AUCILIARES
	private int linhaCorretaInterface;
	private int colunaCorretaInterface;

	
	public Posicao() {};
	
	public Posicao(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}
	
	public Posicao(int linha, int coluna, Horta horta) {
		
		linhaCorretaInterface = posicionarLinhaComBaseNaInterface(linha, horta);
		colunaCorretaInterface = posicionarColunaComBaseNaInterface(coluna);
		
		this.linha = linhaCorretaInterface;
		this.coluna = colunaCorretaInterface;
	}

	public int posicionarLinhaComBaseNaInterface(int posDoUsuario, Horta horta) {
		return linhaCorretaInterface = horta.getLinhas() - posDoUsuario;
	}
	public int posicionarColunaComBaseNaInterface(int posDoUsuario) {
		return colunaCorretaInterface = posDoUsuario - 1;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public int getColuna() {
		return coluna;
	}
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	@Override
	public String toString() {
		return linha + ", " + coluna;
	}
}
