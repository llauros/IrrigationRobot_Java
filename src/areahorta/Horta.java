package areahorta;

public class Horta {
	private int linhas;
	private int colunas;
	private Posicao[] canteirosParaIrrigar;

	public Horta() {}

	public Horta(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
	}
	
	/**
	 * Apresenta a horta no console
	 */	
	public void mostrarHorta() {
		System.out.print("Minha\nHorta:");
		// MONTANDO TABELA
		System.out.print("	.");
		for (int qtdCol = 0; qtdCol < getColunas(); qtdCol++) {// LINHAS
			System.out.print("-----");
		}
		System.out.print(".\n");
		for (int i = 0; i < getLinhas(); i++) {
			System.out.print("	" + (getLinhas() - i) + "");
			for (int j = 0; j < getColunas(); j++) {
				
				//PLANTA ESTA AQUI
				System.out.print("    |");
			}
			if (!(i == (getColunas() - 1))) {
				System.out.print("    \n\t");
			}

			for (int x = 0; x < getColunas(); x++) {
				if (!(i == (getColunas() - 1))) {
					System.out.print(" ----");
				}
			}
			System.out.println();
		}
		System.out.print("	.");

		for (int qtdCol = 0; qtdCol < getColunas(); qtdCol++) {// LINHAS
			System.out.print("-----");
		}
		System.out.println(".");

		System.out.print("	  ");
		for (int qtdCol = 1; qtdCol <= getColunas(); qtdCol++) {
			System.out.print(qtdCol + "    ");
		}
	}
	
	// GETTERS SETTERS
	public int getLinhas() {
		return linhas;
	}
	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}
	public int getColunas() {
		return colunas;
	}
	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
}
