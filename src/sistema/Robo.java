package sistema;

import java.util.ArrayList;
import java.util.Random;

import areahorta.Posicao;

public class Robo {

	private String orientacaoAtual;
	private Posicao posicaoAtual;
	private ArrayList<String> acoes;

	public ArrayList<String> getAcoes() {
		return acoes;
	}

	public void setAcoes(ArrayList<String> acoes) {
		this.acoes = acoes;
	}

	// VARIAVEIS AUXILIARES
	private String proximaOrientacao;
	private String proximaAcao;

	int novaLinha;
	int novaColuna;

	/* Reorientar o Robo */
	private String orientacaoVerticalEmRelacaoAoCanteiroParaIrrigar;
	private String orientacaoHorizontalEmRelacaoAoCanteiroParaIrrigar;
	private String orientacaoParaIrrigacao;// PARA ONDE DEVO ME ORIENTAR

	Random gerador = new Random();

	public Robo() {
	}

	public Robo(Posicao posicaoAtual, String orientacaoAtual) {
		this.orientacaoAtual = orientacaoAtual;
		this.posicaoAtual = posicaoAtual;
		acoes = new ArrayList<String>();
	}

	public ArrayList<String> meuTrajeto(Posicao[] posicao) {
		acoes = new ArrayList<String>();
		return acoes;
	}

	public void proximaAcao(Posicao posicaoParaIrrigar) {
		String proximaAcaoDoRobo = "";
		String proximaOrientacao = "";

		switch (pontoDeReferencia(posicaoParaIrrigar)) {

		/* SE */
		// O OBJETO ESTÁ A...

		case "N": // NORTE

			// ESTOU P/ O NORTE /\
			if (getOrientacaoAtual().equals("N")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "M";

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// MOVIMENTANDO (SETANDO NOVA POSICAO)
				setPosicaoAtual(movimentarRobo("N"));

				// PARANDO EXECUÇÃO
				break;
			}

			// ESTOU P/ O SUL \/
			if (getOrientacaoAtual().equals("S")) {
				// PROXIMA ACAO LOGICA - VIRAR D OU E (Robo decide randomicamente)

				if (gerador.nextInt(2) == 0) {
					proximaAcaoDoRobo = "D"; // Direita

					// NOVA ORIENTACAO
					proximaOrientacao = "O"; // OESTE <-
					setOrientacaoAtual(proximaOrientacao);
				} else {
					proximaAcaoDoRobo = "E";// Esquerda

					// NOVA ORIENTACAO
					proximaOrientacao = "L"; // LESTE ->
					setOrientacaoAtual(proximaOrientacao);
				}

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// PARANDO EXECUÇÃO
				break;
			}

			// ESTOU P/ O LESTE ->
			if (getOrientacaoAtual().equals("L")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "E";

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// NOVA ORIENTACAO (SETANDO NOVA ORIENTACAO)
				proximaOrientacao = "N";
				setOrientacaoAtual(proximaOrientacao);

				// PARANDO EXECUÇÃO
				break;
			}

			// ESTOU P/ O OESTE <-
			if (getOrientacaoAtual().equals("O")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "D";

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// NOVA ORIENTACAO (SETANDO NOVA ORIENTACAO)
				proximaOrientacao = "N";
				setOrientacaoAtual(proximaOrientacao);

				// PARANDO EXECUÇÃO
				break;
			}

			break;

		/* SE */
		// O OBJETO ESTÁ A...
		case "NL": // NORDESTE

			// ESTOU P/ O NORTE /\
			if (getOrientacaoAtual().equals("N")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "M";

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// MOVIMENTANDO (SETANDO NOVA POSICAO)
				setPosicaoAtual(movimentarRobo("N"));

				// PARANDO EXECUÇÃO
				break;
			}

			// ESTOU P/ O SUL /\
			if (getOrientacaoAtual().equals("S")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "E";// Esquerda

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// NOVA ORIENTACAO (SETANDO NOVA ORIENTACAO)
				proximaOrientacao = "L";

				setOrientacaoAtual(proximaOrientacao);

				// MOVIMENTANDO (SETANDO NOVA POSICAO)

				// PARANDO EXECUÇÃO
				break;
			}

			// ESTOU P/ O LESTE
			if (getOrientacaoAtual().equals("L")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "M";// Esquerda

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// NOVA ORIENTACAO (SETANDO NOVA ORIENTACAO)
				proximaOrientacao = "L";

				setOrientacaoAtual(proximaOrientacao);

				// MOVIMENTANDO (SETANDO NOVA POSICAO)
				setPosicaoAtual(movimentarRobo("L"));

				// PARANDO EXECUÇÃO
				break;
			}

			// ESTOU P/ O OESTE /\
			if (getOrientacaoAtual().equals("O")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "D";// Direita

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// NOVA ORIENTACAO (SETANDO NOVA ORIENTACAO)
				proximaOrientacao = "N";

				setOrientacaoAtual(proximaOrientacao);

				// MOVIMENTANDO (SETANDO NOVA POSICAO)

				// PARANDO EXECUÇÃO
				break;
			}

			break;

		/* SE */
		// O OBJETO ESTÁ A...
		case "NO": // NOROESTE

			// ESTOU P/ O NORTE /\
			if (getOrientacaoAtual().equals("N")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "M";

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// MOVIMENTANDO (SETANDO NOVA POSICAO)
				setPosicaoAtual(movimentarRobo("N"));

				// PARANDO EXECUÇÃO
				break;
			}

			// ESTOU P/ O SUL /\
			if (getOrientacaoAtual().equals("S")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "D";// Direita

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// NOVA ORIENTACAO (SETANDO NOVA ORIENTACAO)
				proximaOrientacao = "O";

				setOrientacaoAtual(proximaOrientacao);

				// MOVIMENTANDO (SETANDO NOVA POSICAO)

				// PARANDO EXECUÇÃO
				break;

			}

			// ESTOU P/ O LESTE /\
			if (getOrientacaoAtual().equals("L")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "E";// Esquerda

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// NOVA ORIENTACAO (SETANDO NOVA ORIENTACAO)
				proximaOrientacao = "N";

				setOrientacaoAtual(proximaOrientacao);

				// MOVIMENTANDO (SETANDO NOVA POSICAO)

				// PARANDO EXECUÇÃO
				break;
			}

			// ESTOU P/ O OESTE /\
			if (getOrientacaoAtual().equals("O")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "M";//

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// NOVA ORIENTACAO (SETANDO NOVA ORIENTACAO)

				/*
				 * proximaOrientacao = "O"; setOrientacaoAtual(proximaOrientacao);
				 */

				// MOVIMENTANDO (SETANDO NOVA POSICAO)
				setPosicaoAtual(movimentarRobo("O"));

				// PARANDO EXECUÇÃO
				break;
			}

			break;

		/* SE */
		// O OBJETO ESTÁ A...
		case "S": // SUL

			// ESTOU P/ O NORTE
			if (getOrientacaoAtual().equals("N")) {
				// PROXIMA ACAO LOGICA
				if (gerador.nextInt(2) == 0) {
					proximaAcaoDoRobo = "D"; // Direita

					// NOVA ORIENTACAO
					proximaOrientacao = "L"; // LESTE <-
					setOrientacaoAtual(proximaOrientacao);
				} else {
					proximaAcaoDoRobo = "E";// Esquerda

					// NOVA ORIENTACAO
					proximaOrientacao = "O"; // OESTE ->
					setOrientacaoAtual(proximaOrientacao);
				}

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// MOVIMENTANDO (SETANDO NOVA POSICAO)

				// PARANDO EXECUÇÃO
				break;

			}

			// ESTOU P/ O SUL
			if (getOrientacaoAtual().equals("S")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "M";//

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// NOVA ORIENTACAO (SETANDO NOVA ORIENTACAO)

				// MOVIMENTANDO (SETANDO NOVA POSICAO)
				setPosicaoAtual(movimentarRobo("S"));

				// PARANDO EXECUÇÃO
				break;
			}

			// ESTOU P/ O LESTE
			if (getOrientacaoAtual().equals("L")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "D";// Direita

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// NOVA ORIENTACAO (SETANDO NOVA ORIENTACAO)
				proximaOrientacao = "S";
				setOrientacaoAtual(proximaOrientacao);

				// MOVIMENTANDO (SETANDO NOVA POSICAO)

				// PARANDO EXECUÇÃO
				break;

			}

			// ESTOU P/ O OESTE
			if (getOrientacaoAtual().equals("O")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "E";// Esquerda

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// NOVA ORIENTACAO (SETANDO NOVA ORIENTACAO)
				proximaOrientacao = "S";

				setOrientacaoAtual(proximaOrientacao);

				// MOVIMENTANDO (SETANDO NOVA POSICAO)

				// PARANDO EXECUÇÃO
				break;

			}

			break;

		/* SE */
		// O OBJETO ESTÁ A...
		case "SL": // SUDESTE

			// ESTOU P/ O NORTE
			if (getOrientacaoAtual().equals("N")) {
				// PROXIMA ACAO LOGICA

				proximaAcaoDoRobo = "D"; // Direita

				// NOVA ORIENTACAO
				proximaOrientacao = "L"; // LESTE <-
				setOrientacaoAtual(proximaOrientacao);

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// MOVIMENTANDO (SETANDO NOVA POSICAO)

				// PARANDO EXECUÇÃO
				break;
			}

			// ESTOU P/ O SUL
			if (getOrientacaoAtual().equals("S")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "M";//

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// NOVA ORIENTACAO (SETANDO NOVA ORIENTACAO)

				// MOVIMENTANDO (SETANDO NOVA POSICAO)
				setPosicaoAtual(movimentarRobo("S"));

				// PARANDO EXECUÇÃO
				break;
			}

			// ESTOU P/ O LESTE
			if (getOrientacaoAtual().equals("L")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "M";

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// NOVA ORIENTACAO (SETANDO NOVA ORIENTACAO)

				// MOVIMENTANDO (SETANDO NOVA POSICAO)
				setPosicaoAtual(movimentarRobo("L"));

				// PARANDO EXECUÇÃO
				break;
			}

			// ESTOU P/ O OESTE
			if (getOrientacaoAtual().equals("O")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "E";// Esquerda

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// NOVA ORIENTACAO (SETANDO NOVA ORIENTACAO)
				proximaOrientacao = "S";

				setOrientacaoAtual(proximaOrientacao);

				// MOVIMENTANDO (SETANDO NOVA POSICAO)

				// PARANDO EXECUÇÃO
				break;

			}

			break;
		/* SE */
		// O OBJETO ESTÁ A...
		case "SO": // SUDOESTE

			// ESTOU P/ O NORTE
			if (getOrientacaoAtual().equals("N")) {
				// PROXIMA ACAO LOGICA

				proximaAcaoDoRobo = "E"; // Esquerda

				// NOVA ORIENTACAO
				proximaOrientacao = "O"; // OESTE <-
				setOrientacaoAtual(proximaOrientacao);

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// MOVIMENTANDO (SETANDO NOVA POSICAO)

				// PARANDO EXECUÇÃO
				break;
			}

			// ESTOU P/ O SUL
			if (getOrientacaoAtual().equals("S")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "M";//

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// NOVA ORIENTACAO (SETANDO NOVA ORIENTACAO)

				// MOVIMENTANDO (SETANDO NOVA POSICAO)
				setPosicaoAtual(movimentarRobo("S"));

				// PARANDO EXECUÇÃO
				break;
			}

			// ESTOU P/ O LESTE
			if (getOrientacaoAtual().equals("L")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "D"; // Direita

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// NOVA ORIENTACAO (SETANDO NOVA ORIENTACAO)
				proximaOrientacao = "S"; // SUL <-
				setOrientacaoAtual(proximaOrientacao);

				// MOVIMENTANDO (SETANDO NOVA POSICAO)

				// PARANDO EXECUÇÃO
				break;

			}

			// ESTOU P/ O OESTE
			if (getOrientacaoAtual().equals("O")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "M";//

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// NOVA ORIENTACAO (SETANDO NOVA ORIENTACAO)

				// MOVIMENTANDO (SETANDO NOVA POSICAO)
				setPosicaoAtual(movimentarRobo("O"));

				// PARANDO EXECUÇÃO
				break;
			}

			break;
		/* SE */
		// O OBJETO ESTÁ A...
		case "L": // LESTE

			// ESTOU P/ O NORTE
			if (getOrientacaoAtual().equals("N")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "D"; // Direita

				// NOVA ORIENTACAO
				proximaOrientacao = "L"; // Leste
				setOrientacaoAtual(proximaOrientacao);

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// MOVIMENTANDO (SETANDO NOVA POSICAO)

				// PARANDO EXECUÇÃO
				break;

			}

			// ESTOU P/ O SUL
			if (getOrientacaoAtual().equals("S")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "E";// Esquerda

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// NOVA ORIENTACAO (SETANDO NOVA ORIENTACAO)
				proximaOrientacao = "L"; // Leste
				setOrientacaoAtual(proximaOrientacao);

				// MOVIMENTANDO (SETANDO NOVA POSICAO)

				// PARANDO EXECUÇÃO
				break;

			}

			// ESTOU P/ O LESTE
			if (getOrientacaoAtual().equals("L")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "M";

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// NOVA ORIENTACAO (SETANDO NOVA ORIENTACAO)

				// MOVIMENTANDO (SETANDO NOVA POSICAO)
				setPosicaoAtual(movimentarRobo("L"));

				// PARANDO EXECUÇÃO
				break;
			}

			// ESTOU P/ O OESTE /\
			if (getOrientacaoAtual().equals("O")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "M";

				if (gerador.nextInt(2) == 0) {
					proximaAcaoDoRobo = "D"; // Direita

					// NOVA ORIENTACAO
					proximaOrientacao = "N"; // NORTE

				} else {
					proximaAcaoDoRobo = "E";// Esquerda

					// NOVA ORIENTACAO
					proximaOrientacao = "S"; // SUL

				}

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// NOVA ORIENTACAO (SETANDO NOVA ORIENTACAO)
				setOrientacaoAtual(proximaOrientacao);

				// MOVIMENTANDO (SETANDO NOVA POSICAO)

				// PARANDO EXECUÇÃO
				break;
			}
			break;

		/* SE */
		// O OBJETO ESTÁ A...
		case "O": // OESTE

			// ESTOU P/ O NORTE
			if (getOrientacaoAtual().equals("N")) {
				// PROXIMA ACAO LOGICA

				proximaAcaoDoRobo = "E"; // Esquerda

				// NOVA ORIENTACAO
				proximaOrientacao = "O"; // OESTE <-
				setOrientacaoAtual(proximaOrientacao);

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// MOVIMENTANDO (SETANDO NOVA POSICAO)

				// PARANDO EXECUÇÃO
				break;

			}

			// ESTOU P/ O SUL
			if (getOrientacaoAtual().equals("S")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "D";// Direita

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// NOVA ORIENTACAO (SETANDO NOVA ORIENTACAO)
				proximaOrientacao = "O"; // OESTE <-
				setOrientacaoAtual(proximaOrientacao);

				// MOVIMENTANDO (SETANDO NOVA POSICAO)

				// PARANDO EXECUÇÃO
				break;
			}

			// ESTOU P/ O LESTE
			if (getOrientacaoAtual().equals("L")) {
				// PROXIMA ACAO LOGICA

				if (gerador.nextInt(2) == 0) {
					proximaAcaoDoRobo = "D"; // Direita

					// NOVA ORIENTACAO
					proximaOrientacao = "S"; // SUL <-

				} else {
					proximaAcaoDoRobo = "E";// Esquerda

					// NOVA ORIENTACAO
					proximaOrientacao = "N"; // NORTE ->

				}

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// NOVA ORIENTACAO (SETANDO NOVA ORIENTACAO)

				// MOVIMENTANDO (SETANDO NOVA POSICAO)
				setOrientacaoAtual(proximaOrientacao);

				// PARANDO EXECUÇÃO
				break;
			}

			// ESTOU P/ O OESTE /\
			if (getOrientacaoAtual().equals("O")) {
				// PROXIMA ACAO LOGICA
				proximaAcaoDoRobo = "M";

				// ADD COMANDO
				acoes.add(proximaAcaoDoRobo);

				// NOVA ORIENTACAO (SETANDO NOVA ORIENTACAO)

				// MOVIMENTANDO (SETANDO NOVA POSICAO)
				setPosicaoAtual(movimentarRobo("O"));

				// PARANDO EXECUÇÃO
				break;
			}

			break;
		case "I":
			proximaAcaoDoRobo = "I";
			acoes.add(proximaAcaoDoRobo);
			break;
		}

	}

	private Posicao movimentarRobo(String direcao) {
		Posicao proximaPosicao;
		novaLinha = getPosicaoAtual().getLinha();
		novaColuna = getPosicaoAtual().getColuna();

		switch (direcao) {
		case "N": // NORTE
			novaLinha = novaLinha - 1;
			proximaPosicao = new Posicao(novaLinha, novaColuna);
			break;
		case "S": // SUL
			novaLinha = novaLinha + 1;
			proximaPosicao = new Posicao(novaLinha, novaColuna);
			break;
		case "L": // LESTE
			novaColuna = novaColuna + 1;
			proximaPosicao = new Posicao(novaLinha, novaColuna);
			break;
		case "O": // OESTE
			novaColuna = novaColuna - 1;
			proximaPosicao = new Posicao(novaLinha, novaColuna);
			break;
		default: //
			proximaPosicao = new Posicao(novaLinha, novaColuna);
		}
		return proximaPosicao;
	}

	/**
	 * O Objeto está a que direção?
	 * 
	 * @param posicaoParaIrrigar
	 * @return
	 */
	public String pontoDeReferencia(Posicao posicaoParaIrrigar) {
		orientacaoVerticalEmRelacaoAoCanteiroParaIrrigar = "";
		orientacaoHorizontalEmRelacaoAoCanteiroParaIrrigar = "";
		orientacaoParaIrrigacao = "";

		// HORIZONTAL
		if (posicaoAtual.getColuna() < posicaoParaIrrigar.getColuna()) {
			orientacaoHorizontalEmRelacaoAoCanteiroParaIrrigar = "L";
		}

		if (posicaoAtual.getColuna() > posicaoParaIrrigar.getColuna()) {
			orientacaoHorizontalEmRelacaoAoCanteiroParaIrrigar = "O";
		}

		if (posicaoAtual.getColuna() == posicaoParaIrrigar.getColuna()) {
			// ANALISE VERTICAL

			// VERTICAL
			if (posicaoAtual.getLinha() < posicaoParaIrrigar.getLinha()) {
				orientacaoVerticalEmRelacaoAoCanteiroParaIrrigar = "S";
			}

			if (posicaoAtual.getLinha() > posicaoParaIrrigar.getLinha()) {
				orientacaoVerticalEmRelacaoAoCanteiroParaIrrigar = "N";
			}
		}

		// VERTICAL
		if (posicaoAtual.getLinha() < posicaoParaIrrigar.getLinha()) {
			orientacaoVerticalEmRelacaoAoCanteiroParaIrrigar = "S";
		}

		if (posicaoAtual.getLinha() > posicaoParaIrrigar.getLinha()) {
			orientacaoVerticalEmRelacaoAoCanteiroParaIrrigar = "N";
		}

		if (posicaoAtual.getLinha() == posicaoParaIrrigar.getLinha()) {
			// ANAlise a Linha
			// HORIZONTAL
			if (posicaoAtual.getColuna() < posicaoParaIrrigar.getColuna()) {
				orientacaoHorizontalEmRelacaoAoCanteiroParaIrrigar = "L";
			}

			if (posicaoAtual.getColuna() > posicaoParaIrrigar.getColuna()) {
				orientacaoHorizontalEmRelacaoAoCanteiroParaIrrigar = "O";
			}
		}

		// Irrigar
		if (posicaoAtual.getLinha() == posicaoParaIrrigar.getLinha()
				&& posicaoAtual.getColuna() == posicaoParaIrrigar.getColuna()) {
			orientacaoParaIrrigacao = "I";
		}
		if (orientacaoVerticalEmRelacaoAoCanteiroParaIrrigar.equals("")
				&& orientacaoHorizontalEmRelacaoAoCanteiroParaIrrigar.equals("")) {
			return orientacaoParaIrrigacao;
		} else {
			return orientacaoVerticalEmRelacaoAoCanteiroParaIrrigar
					+ orientacaoHorizontalEmRelacaoAoCanteiroParaIrrigar;
		}
	}

	public String getOrientacaoAtual() {
		return orientacaoAtual;
	}

	public void setOrientacaoAtual(String orientacaoAtual) {
		this.orientacaoAtual = orientacaoAtual;
	}

	public Posicao getPosicaoAtual() {
		return posicaoAtual;
	}

	public void setPosicaoAtual(Posicao posicaoAtual) {
		this.posicaoAtual = posicaoAtual;
	}

}
