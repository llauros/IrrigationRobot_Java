package areahorta;

import java.util.ArrayList;
import java.util.List;

import sistema.Robo;

public class Horta {
	private int linhas;
	private int colunas;

	private Canteiro[] canteirosParaIrrigar;

	// VARIAVEIS AUXILIARES
	private int tamanhoDoArray;
	private String idPosicao;
	private String idPosicaoCanteiro;

	public Horta() {
	}

	public Horta(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
	}

	public Horta(int linhas, int colunas, Canteiro[] canteirosParaIrrigar) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.canteirosParaIrrigar = canteirosParaIrrigar;
	}

	/**
	 * Meteodo para imprimir horta
	 * 
	 * @param Canteiros
	 */
	public void mostrarHortaComCanteiro(Posicao[] posicoes) {
		// COMO GUARDAR/ARMAZENAR AS INFORMAÇÔES

		// (0, 0) - (3, 1) - (3, 1) - (3, 1)

		/* String[][] matriz2dim = new String[getLinhas()][getColunas()]; */

		/* List<List<String>> listOfLists = new ArrayList<List<String>>(); */
		ArrayList<String> matriz2dim = new ArrayList<String>();
		ArrayList<String> posicoesUsuario = new ArrayList<String>();
		
		int linhaPosicaoI;
		int colunaPosicaoI;
		boolean eIgual = true;
		int p = 0;
		
		
		for (int posicao = 0; posicao < posicoes.length; posicao++) {
			posicoesUsuario.add(posicoes[posicao].getLinha()+""+posicoes[posicao].getColuna());
		}
		System.out.println("----------------------------------------------R");
		System.out.println(posicoesUsuario);
		System.out.println("----------------------------------------------R");
		/*
		 * for (int p = 0; p < posicoes.length; p++) { int linhaPosicaoI =
		 * posicoes[p].getLinha(); int colunaPosicaoI = posicoes[p].getColuna(); }
		 */
		for (int posicao = 0; posicao < posicoes.length; posicao++) {

			for (int linha = 0; linha < getLinhas(); linha++) { // LINHAS
				
				for (int coluna = 0; coluna < getColunas(); coluna++) {// COLUNAS

			
					//if (posicoes[posicao].getLinha() == linha && posicoes[posicao].getColuna() == coluna) {
						//matriz2dim.add((posicao + 1) + "I");
						
					//} else {
						matriz2dim.add(linha + "" + coluna);
					//}
				}
			}
		}
		System.out.println("O VETORRR");
		System.out.println(matriz2dim);

		// -----
		System.out.print("   ");

		for (int i = 0; i < getColunas(); i++) {
			System.out.print("----------------");
		}
		System.out.println();

		for (int linha = 0; linha < getLinhas(); linha++) { // LINHAS
			System.out.print((getLinhas() - linha) + " |");
			for (int coluna = 0; coluna < getColunas(); coluna++) {// COLUNAS

				// System.out.print(" - |");
				System.out.printf("	%d%d	|", linha, coluna);

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
	public void mostrarHortaComRobo(Robo robo) {

		int linhaPosicaoRobo = robo.getPosicaoAtual().getLinha();
		int colunaPosicaoRobo = robo.getPosicaoAtual().getColuna();

		idPosicao = "";
		idPosicaoCanteiro = "";

		System.out.print("   ");
		for (int i = 0; i < getColunas(); i++) {
			System.out.print("----------------");
		}
		System.out.println();

		for (int linha = 0; linha < getLinhas(); linha++) {
			System.out.print((getLinhas() - linha) + " |");
			for (int coluna = 0; coluna < getColunas(); coluna++) {

				if (linhaPosicaoRobo == linha && colunaPosicaoRobo == coluna) {
					System.out.print("	R	|");
				} else {
					System.out.print("	-	|");
				}
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

	/**
	 * Meteodo para imprimir horta
	 * 
	 * @param Canteiros
	 */
	public void mostrarHorta(/* Canteiro canteirosParaIrrigar */) {

		/* tamanhoDoArray = canteirosParaIrrigar.getCabteirosParaIrrigar().length; */
		/* System.out.println(tamanhoDoArray); */

		idPosicao = "";
		idPosicaoCanteiro = "";

		/*
		 * for (int p = 0; p < tamanhoDoArray; p++) { idPosicaoCanteiro =
		 * canteirosParaIrrigar.getCabteirosParaIrrigar()[p].getLinha() + " " +
		 * canteirosParaIrrigar.getCabteirosParaIrrigar()[p].getColuna();
		 * System.out.println(idPosicaoCanteiro); System.out.println("---");
		 * 
		 * System.out.println(idPosicaoCanteiro.equals("0 0")); }
		 */

		System.out.print("   ");
		for (int i = 0; i < getColunas(); i++) {
			System.out.print("----------------");
		}
		System.out.println();

		/*
		 * for (int p = 0; p < tamanhoDoArray; p++) { idPosicaoCanteiro =
		 * canteirosParaIrrigar.getCabteirosParaIrrigar()[p].getLinha() + " " +
		 * canteirosParaIrrigar.getCabteirosParaIrrigar()[p].getColuna(); }
		 */

		for (int linha = 0; linha < getLinhas(); linha++) {
			System.out.print((getLinhas() - linha) + " |");
			for (int coluna = 0; coluna < getColunas(); coluna++) {

				idPosicao = linha + "" + coluna;

				System.out.print("	-	|");
				// System.out.print(" "+ idPosicao +" |");

				/*
				 * for (int p = 0; p < 1; p++) { idPosicaoCanteiro =
				 * canteirosParaIrrigar.getCabteirosParaIrrigar()[p].getLinha() + " " +
				 * canteirosParaIrrigar.getCabteirosParaIrrigar()[p].getColuna();
				 * 
				 * if(idPosicaoCanteiro.equals(idPosicao)) { System.out.print("	"+ idPosicao
				 * +"	|"); } else { System.out.print("		|"); }
				 * 
				 * }
				 */

				/*
				 * for (int p = 0; p < tamanhoDoArray; p++) { if
				 * (canteirosParaIrrigar.getCabteirosParaIrrigar()[p].getLinha() == linha &&
				 * canteirosParaIrrigar.getCabteirosParaIrrigar()[p].getColuna() == coluna) {
				 * 
				 * System.out.print("	"+
				 * canteirosParaIrrigar.getCabteirosParaIrrigar()[p].getLinha()
				 * +" "+canteirosParaIrrigar.getCabteirosParaIrrigar()[p].getColuna() +"	|");
				 * 
				 * } else { System.out.print("	-	|"); }
				 * 
				 * 
				 * 
				 * 
				 * //System.out.print("	"+ linha +" "+coluna +"	|"); } /*for (int p = 0; p <
				 * tamanhoDoArray; p++) { if
				 * ((canteirosParaIrrigar.getCabteirosParaIrrigar()[p].getLinha() +
				 * canteirosParaIrrigar.getCabteirosParaIrrigar()[p].getColuna()) == (linha +
				 * coluna)) { System.out.println("inferno" );
				 * System.out.println(canteirosParaIrrigar.getCabteirosParaIrrigar()[p].
				 * getColuna() );
				 * 
				 * 
				 * System.out.print((canteirosParaIrrigar.getCabteirosParaIrrigar()[p].getLinha(
				 * ) == linha && canteirosParaIrrigar.getCabteirosParaIrrigar()[p].getColuna()
				 * == coluna));
				 * 
				 * } }
				 */

				/*
				 * for (int p = 0; p < tamanhoDoArray; p++) {
				 * mostraCanteiro(canteirosParaIrrigar.getCabteirosParaIrrigar()[p], i, j); }
				 */
				/*
				 * for (int p = 0; p < tamanhoDoArray ; p++) {
				 * if(canteirosParaIrrigar.getCabteirosParaIrrigar()[p].getLinha() == i &&
				 * canteirosParaIrrigar.getCabteirosParaIrrigar()[p].getColuna() == j) {
				 * System.out.print("	v	|"); } else {
				 * 
				 * 
				 * } //System.out.print("		|"); }
				 * /*if(canteirosParaIrrigar.getCabteirosParaIrrigar()[i].getLinha() == i &&
				 * canteirosParaIrrigar.getCabteirosParaIrrigar()[i].getColuna() == j ) {
				 * System.out.println("dengo"); } else {
				 * 
				 * }
				 */
				/*
				 * if (canteirosParaIrrigar.getCabteirosParaIrrigar()[i] == null) {
				 * System.out.print("	-	|"); } else { System.out.print("	"+
				 * canteirosParaIrrigar +"	|"); } System.out.print(" ");
				 */

				// mostraCanteiro(canteirosParaIrrigar.getCabteirosParaIrrigar()[i]);

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

	/**
	 * Metodo para imprimir uma pessa
	 * 
	 * @param piece
	 */
	private void mostraCanteiro(Posicao canteirosParaIrrigar, int linha, int coluna) {

		if (canteirosParaIrrigar.getLinha() == linha && canteirosParaIrrigar.getColuna() == coluna) {

			System.out.print("	-	|");
		} else {
			System.out.print("");

		}
		/*
		 * System.out.println(can.getCabteirosParaIrrigar()[0].getLinha() == 0);
		 * 
		 * if (canteirosParaIrrigar == null) {
		 * 
		 * } else { System.out.print("	"+ canteirosParaIrrigar +"	|"); }
		 * System.out.print(" ");
		 * 
		 * System.gc();
		 */
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

	public Canteiro[] getCanteirosParaIrrigar() {
		return canteirosParaIrrigar;
	}

	public void setCanteirosParaIrrigar(Canteiro[] canteirosParaIrrigar) {
		this.canteirosParaIrrigar = canteirosParaIrrigar;
	}
}
