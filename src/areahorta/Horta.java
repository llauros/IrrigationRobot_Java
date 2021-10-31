package areahorta;

import sistema.Robo;

public class Horta {
	private int linhas;
	private int colunas;

	public Horta() {}

	public Horta(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
	}

	/**
	 * Meteodo para imprimir horta
	 * 
	 * @param Canteiros
	 */
	public void mostrarHortaCompleta(Posicao[] posicoes, Robo robo ) {

		String plantaNaPosicao = "";
		int linhaPosicaoRobo = robo.getPosicaoAtual().getLinha();
		int colunaPosicaoRobo = robo.getPosicaoAtual().getColuna();
		// -----
		System.out.print("   ");
		for (int i = 0; i < getColunas(); i++) {
			System.out.print("----------------");
		}
		System.out.println();
		for (int linha = 0; linha < getLinhas(); linha++) { // LINHAS
			System.out.print((getLinhas() - linha) + " |");
			for (int coluna = 0; coluna < getColunas(); coluna++) {// COLUNAS
				plantaNaPosicao = "";
				
				// PROCURAR ROBO
				if (linhaPosicaoRobo == linha && colunaPosicaoRobo == coluna) {
					if (robo.getOrientacaoAtual().equals("N")) {
						System.out.print("	/\\	|");
					} else if (robo.getOrientacaoAtual().equals("S")) {
						System.out.print("	\\/	|");
					} else if (robo.getOrientacaoAtual().equals("L")) {
						System.out.print("	=>	|");
					} else if (robo.getOrientacaoAtual().equals("O")) {
						System.out.print("	<=	|");
					}
				} else {
					
					// PROCURAR CANTEIRO
					for (int pos = 0; pos < posicoes.length; pos++) {
						if (posicoes[pos].getLinha() == linha && posicoes[pos].getColuna() == coluna) {
							plantaNaPosicao = "I"+posicoes.length+",";
						} else {
							plantaNaPosicao = "N";
						}
					}

					if (plantaNaPosicao.indexOf("I") >= 0) {
						System.out.printf("	I%d	|",posicoes.length);
					} else {
						System.out.print("	-	|");
					}
				}
			}
			System.out.println();
			System.out.print("   ");

			// TABELA
			for (int x = 0; x < getColunas(); x++) {
				System.out.print("----------------");
			}
			System.out.println();
		}
		System.out.print("	");
		for (int qtdCol = 1; qtdCol <= getColunas(); qtdCol++) {
			System.out.print(qtdCol + "    		");
		}
	}

	/**
	 * Meteodo para imprimir horta
	 * 
	 * @param Canteiros
	 */
	public void mostrarHorta() {

		System.out.print("   ");
		for (int i = 0; i < getColunas(); i++) {
			System.out.print("----------------");
		}
		System.out.println();

		for (int linha = 0; linha < getLinhas(); linha++) {
			System.out.print((getLinhas() - linha) + " |");
			for (int coluna = 0; coluna < getColunas(); coluna++) {
				System.out.print("	-	|");
			}
			System.out.println();
			System.out.print("   ");
			for (int x = 0; x < getColunas(); x++) {
				System.out.print("----------------");
			}
			System.out.println();
		}
		System.out.print("	");
		for (int qtdCol = 1; qtdCol <= getColunas(); qtdCol++) {
			System.out.print(qtdCol + "    		");
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
