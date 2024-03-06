import java.util.Scanner;

public class Ativ4 {

	public static void main(String[] args) {

		// Cria os Objeto Scanner
		Scanner ler = new Scanner(System.in);

		// Cria a matriz do jogo e uma variavel para saber quem venceu
		int[][] jogo = new int[3][3];
		int vencedor = 0;

		// Mostra o nome do jogo
		System.out.println("Jogo da Velha\n");

		// Cria o Jogo vasio
		for (int i = 0; i < jogo.length; i++) {
			for (int j = 0; j < jogo[i].length - 1; j++) {
				jogo[i][j] = 0;
			}
			jogo[i][jogo[i].length - 1] = 0;
		}

		// Desenha o Tabuleiro no Console
		DesenharTabuleiro(jogo);

		// Lopping de rodadas, acaba quando tiver um vencedor
		while (vencedor == 0) {

			// Lopping para fazer o primeiro e segundo jogador
			for (int jogador = 1; jogador <= 2; jogador++) {

				// Fala de quem e a vez
				System.out.println("\nVez do " + jogador + "o Jogador");

				// Le a jogada do jogador atual
				int linha = ler.nextInt() - 1, coluna = ler.nextInt() - 1;

				// Verifica se a jogada
				if (linha >= jogo.length || coluna >= jogo[linha].length || !(jogo[linha][coluna] == 0)) {
					System.out.println("Voce fez uma jogada errada");
					jogador--;
					continue;
				}

				// Adiciona o numero do jogador no jogo
				jogo[linha][coluna] = jogador;

				// AQUI O TIAGO FAZ A VERIFICACAO (OU COLOCA A FUNCAO Q ELE FOR FAZER) (vai ter
				// q usar algum break ou continue pra sair do while)

				// Desenha o Tabuleiro no Console
				System.out.println();
				DesenharTabuleiro(jogo);
			}
		}

		// Fim do Jogo
		System.out.println("O JOGADOR " + vencedor + " VENCEU!!!\n");
		DesenharTabuleiro(jogo);
		System.out.println("\n\n\nParabens!!!");

		// Fecha o Objeto Scanner
		ler.close();
	}

	// Funcao que desenha o tabuleiro
	public static void DesenharTabuleiro(int[][] jogo) {

		// Desenha os que nao estao em baixo
		for (int i = 0; i < jogo.length - 1; i++) {

			// Desenha os que nao estao em baixo ou na direita
			for (int j = 0; j < jogo[i].length - 1; j++) {

				switch (jogo[i][j]) {
				case 0:
					System.out.print("_");
					break;
				case 1:
					System.out.print("x");
					break;
				case 2:
					System.out.print("o");
					break;
				}
				System.out.print("|");
			}

			// Desenha os da direita sem a |
			switch (jogo[i][jogo.length - 1]) {
			case 0:
				System.out.println("_");
				break;
			case 1:
				System.out.print("x");
				System.out.println(" ");
				break;
			case 2:
				System.out.print("o");
				System.out.println(" ");
				break;
			}
		}

		// Desenha os de baixo sem o _
		for (int j = 0; j < jogo[jogo.length - 1].length - 1; j++) {

			switch (jogo[jogo.length - 1][j]) {
			case 0:
				System.out.print(" ");
				break;
			case 1:
				System.out.print("x");
				break;
			case 2:
				System.out.print("o");
				break;
			}
			System.out.print("|");
		}

		// Desenha os de baixo da direita sem o _ e a |
		switch (jogo[jogo.length - 1][jogo[jogo.length - 1].length - 1]) {
		case 0:
			System.out.println(" ");
			break;
		case 1:
			System.out.println("x");
			break;
		case 2:
			System.out.println("o");
			break;
		}
	}
}
