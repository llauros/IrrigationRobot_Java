package sistema;

import java.util.InputMismatchException;
import java.util.Scanner;

import areahorta.Horta;
import areahorta.Posicao;

/**
 * Classe prevê e trata possíveis erros. 1 - Valida as entradas. 2 - Apresenta
 * erros ao usuario.
 * 
 * @author llauro
 */
public class ValidacaoSistema {

	private Scanner sc = new Scanner(System.in);
	private int numeroValido;

	/**
	 * Valida se a entrada do usuario não é string (texto) ou um numero inferior a
	 * zero
	 * 
	 * @return
	 */
	public int lerEValidarNumero() {
		numeroValido = 0;
		while (numeroValido < 1) {
			try {
				numeroValido = sc.nextInt();
				if (numeroValido < 1) {
					System.err.print("Erro: ");
					System.out.print("Precisamos que digite numeros maiores que 0!\n");
					sc.nextLine();
				}
			} catch (InputMismatchException a) {
				System.err.print("Erro: ");
				System.out.print("Ops.. parece que você digitou caracteres. Precisamos que digite somente numeros!\n");
				numeroValido = 0;
				sc.nextLine();
			}
		}
		return numeroValido;
	}

	// --------------------------------------------------------
	// --------------- CANTEIROS A IRRIGAR --------------------
	// --------------------------------------------------------
	private Posicao[] posicoesValidasParaIrrigar;
	private Posicao posicaoComBaseNaInterface;
	private int posValidaPorLinha;
	private int posValidaPorColuna;
	private int numeroValidoNaAreaDaHorta;

	/**
	 * Retorna um número possível dentro da area da horta
	 * 
	 * @param horta
	 * @return
	 */
	public int lerEValidarAreDaHorta(Horta horta) {
		do {
			numeroValidoNaAreaDaHorta = lerEValidarNumero();
			if (numeroValidoNaAreaDaHorta > (horta.getLinhas() * horta.getColunas())) {
				System.err.print("\nErro: ");
				System.out.printf("Mas... sua horta tem %d canteiros. Tente novamente.\n",
						(horta.getLinhas() * horta.getColunas()));
				horta.mostrarHorta();
				sc.nextLine();
			}
		} while (numeroValidoNaAreaDaHorta > (horta.getLinhas() * horta.getColunas()));
		return numeroValidoNaAreaDaHorta;
	}

	/**
	 * Retorna um array de posições (coordenadas) que serão os canteiros para
	 * irrigar
	 * 
	 * @param horta     (já dimencionada)
	 * @param posicoues (um array de posicões sem coordenada (null))
	 * @return
	 */
	public Posicao[] posicaoDosCanteirosParaIrrigar(Horta horta, int quantidadeDeCanteirosParaIrrigar) {

		posicoesValidasParaIrrigar = new Posicao[quantidadeDeCanteirosParaIrrigar];

		posValidaPorLinha = 0;
		posValidaPorColuna = 0;
		posicaoComBaseNaInterface = new Posicao();

		// ESTRUTURA PARA VALIDAR AS POSICOES DOS CANTEIROS
		for (int i = 0; i < posicoesValidasParaIrrigar.length; i++) {

			System.out.printf("\t%d° Posicao\n", i + 1);

			// lendo numeros de linhas
			do {
				System.out.print("Linha: ");
				try {
					posValidaPorLinha = sc.nextInt();

					// Tratando ERROS
					if (posValidaPorLinha <= 0) {
						System.err.print("Erro: ");
						System.out.print("Não posso trabalhar com numeros negativos e nem 0... Tente novamente!\n");
						posValidaPorLinha = -1;
						sc.nextLine();
					}
					if (posValidaPorLinha > horta.getLinhas()) {
						System.err.print("\nErro: ");
						System.out.printf("Ué... sua horta tem %d linhas. Tente novamente.\n", horta.getLinhas());
						posValidaPorLinha = -1;
						sc.nextLine();
					}
				} catch (InputMismatchException a) {
					System.err.print("Erro: ");
					System.out.print(
							"Ops.. parece que você digitou caracteres. Precisamos que digite somente numeros!\n");
					posValidaPorLinha = -1;
					sc.nextLine();
				}

			} while (posValidaPorLinha <= 0 || posValidaPorLinha > horta.getLinhas());

			// Lendo Numero de COLUNAS
			do {
				System.out.print("Coluna: ");
				try {
					posValidaPorColuna = sc.nextInt();

					if (posValidaPorColuna <= 0) {
						System.err.print("Erro: ");
						System.out.print("Não posso trabalhar com numeros negativos e nem 0... Tente novamente!\n");
						posValidaPorColuna = -1;
						sc.nextLine();
					}
					if (posValidaPorColuna > horta.getColunas()) {
						System.err.print("\nErro: ");
						System.out.printf("Ué... sua horta tem %d colunas. Tente novamente.\n", horta.getColunas());
						posValidaPorColuna = -1;
						sc.nextLine();
					}
				} catch (InputMismatchException a) {
					System.err.print("Erro: ");
					System.out.print(
							"Ops.. parece que você digitou caracteres. Precisamos que digite somente numeros!\n");
					posValidaPorColuna = -1;
					sc.nextLine();
				}
			} while (posValidaPorColuna < 0 || posValidaPorColuna > horta.getColunas());

			posValidaPorLinha = posicionarLinhaComBaseNaInterface(posValidaPorLinha, horta);
			posValidaPorColuna = posicionarColunaComBaseNaInterface(posValidaPorColuna);

			// TRATANDO POSICOES JA INICIADAS
			/*if (i != 0) {
				if (posicoesValidasParaIrrigar[i - 1].getLinha()
						+ posicoesValidasParaIrrigar[i - 1].getColuna() == posValidaPorLinha + posValidaPorColuna) {
					System.err.print("Erro: ");
					System.out.println("Por que irrigar o mesmo canterio? Por favor, irrigue outros.");
					mesmaPosicao = true;
				} else {
					mesmaPosicao = false;
				}
			}*/

			posicoesValidasParaIrrigar[i] = new Posicao(posValidaPorLinha, posValidaPorColuna);
		}
		return posicoesValidasParaIrrigar;
	}

	// --------------------------------------------------------
	// ----- POSICAO BASEADA NA LINHAXCOLUNA DA INTERFACE -----
	// --------------------------------------------------------
	public int posicionarLinhaComBaseNaInterface(int posDoUsuario, Horta horta) {
		return horta.getLinhas() - posDoUsuario;
	}
	public int posicionarColunaComBaseNaInterface(int posDoUsuario) {
		return posDoUsuario - 1;
	}

	// --------------------------------------------------------
	// ------------------------- ROBO -------------------------
	// --------------------------------------------------------
	private String orientacaoValidada;

	public Posicao posicaoInicialValidaDoRobo(Horta horta) {

		posValidaPorLinha = 0;
		posValidaPorColuna = 0;
		posicaoComBaseNaInterface = new Posicao();
		
		do {
			System.out.print("Linha: ");
			try {
				posValidaPorLinha = sc.nextInt();

				// Tratando ERROS
				if (posValidaPorLinha <= 0) {
					System.err.print("Erro: ");
					System.out.print("Não posso trabalhar com numeros negativos e nem 0... Tente novamente!\n");
					posValidaPorLinha = -1;
					sc.nextLine();
				}
				if (posValidaPorLinha > horta.getLinhas()) {
					System.err.print("\nErro: ");
					System.out.printf("Ué... sua horta tem %d linhas. Tente novamente.\n", horta.getLinhas());
					posValidaPorLinha = -1;
					sc.nextLine();
				}
			} catch (InputMismatchException a) {
				System.err.print("Erro: ");
				System.out.print("Ops.. parece que você digitou caracteres. Precisamos que digite somente numeros!\n");
				posValidaPorLinha = -1;
				sc.nextLine();
			}

		} while (posValidaPorLinha <= 0 || posValidaPorLinha > horta.getLinhas());

		do {
			System.out.print("Coluna: ");
			try {
				posValidaPorColuna = sc.nextInt();

				if (posValidaPorColuna <= 0) {
					System.err.print("Erro: ");
					System.out.print("Não posso trabalhar com numeros negativos e nem 0... Tente novamente!\n");
					posValidaPorColuna = -1;
					sc.nextLine();
				}
				if (posValidaPorColuna > horta.getLinhas()) {
					System.err.print("\nErro: ");
					System.out.printf("Ué... sua horta tem %d colunas. Tente novamente.\n", horta.getColunas());
					posValidaPorColuna = -1;
					sc.nextLine();
				}
			} catch (InputMismatchException a) {
				System.err.print("Erro: ");
				System.out.print("Ops.. parece que você digitou caracteres. Precisamos que digite somente numeros!\n");
				posValidaPorColuna = -1;
				sc.nextLine();
			}

		} while (posValidaPorColuna < 0 || posValidaPorColuna > horta.getLinhas());

		posValidaPorLinha = posicionarLinhaComBaseNaInterface(posValidaPorLinha, horta);
		posValidaPorColuna = posicionarColunaComBaseNaInterface(posValidaPorColuna);

		return posicaoComBaseNaInterface = new Posicao(posValidaPorLinha, posValidaPorColuna);
	}

	public String validarOrientacao() {

		do {
			orientacaoValidada = sc.next();

			if (!(orientacaoValidada.toUpperCase().equals("NORTE") || orientacaoValidada.toUpperCase().equals("N")
					|| orientacaoValidada.toUpperCase().equals("SUL") || orientacaoValidada.toUpperCase().equals("S")
					|| orientacaoValidada.toUpperCase().equals("LESTE") || orientacaoValidada.toUpperCase().equals("L")
					|| orientacaoValidada.toUpperCase().equals("OESTE")
					|| orientacaoValidada.toUpperCase().equals("O"))) {
				System.err.print("Erro: ");
				System.out.print("Preciso ser orientado para Norte(N), Sul(S), Leste(L) ou Oeste(O).");
				orientacaoValidada = "";
				sc.nextLine();
			}

		} while (!(orientacaoValidada.toUpperCase().equals("NORTE") || orientacaoValidada.toUpperCase().equals("N")
				|| orientacaoValidada.toUpperCase().equals("SUL") || orientacaoValidada.toUpperCase().equals("S")
				|| orientacaoValidada.toUpperCase().equals("LESTE") || orientacaoValidada.toUpperCase().equals("L")
				|| orientacaoValidada.toUpperCase().equals("OESTE") || orientacaoValidada.toUpperCase().equals("O")));

		orientacaoValidada = String.valueOf(orientacaoValidada.toUpperCase().charAt(0));

		return orientacaoValidada;
	}

}