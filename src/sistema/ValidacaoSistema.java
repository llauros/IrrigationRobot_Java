package sistema;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe prev� e trata poss�veis erros.
 * 1 - Valida as entradas.
 * 2 - Apresenta erros ao usuario.
 * @author llauro
 */
public class ValidacaoSistema {
	private Scanner sc = new Scanner(System.in);
	
	private int numeroValido;
	
	/**
	 * Valida se a entrada do usuario n�o � string (texto) ou um numero inferior a zero
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
				System.out.print("Ops.. parece que voc� digitou caracteres. Precisamos que digite somente numeros!\n");
				numeroValido = 0;
				sc.nextLine();
			}
		}
		return numeroValido;
	}
	
}
