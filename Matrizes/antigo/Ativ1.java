import java.util.Scanner;

public class Ativ1 {

	public static void main(String[] args) {

		// Cria os Objeto Scanner
		Scanner ler = new Scanner(System.in);

		// Cria a matriz com seu Tamanho definido por Constantes
		final int LINHAS = 3, COLUNAS = 3;
		int[][] matriz = new int[LINHAS][COLUNAS];

		// Le os valores para a matriz
		System.out.println("Informe 9 Numeros Inteiros para a Matriz");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				matriz[i][j] = ler.nextInt();

			}
		}

		// Mostra os valores para a matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length - 1; j++) {

				System.out.print(matriz[i][j] + " ");
			}
			System.out.print(matriz[i][matriz[i].length - 1] + "\n");
		}

		// Fecha o Objeto Scanner
		ler.close();

	}

}