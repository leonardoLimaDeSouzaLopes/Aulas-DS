import java.util.Scanner;

public class Ativ3 {

	public static void main(String[] args) {

		// Cria os Objeto Scanner
		Scanner ler = new Scanner(System.in);

		// Cria a matriz e outras variaveis do codigo
		final int LINHAS = 3, COLUNAS = 3;
		int[][] matriz = new int[LINHAS][COLUNAS];
		int[][] matrizIndices = new int[LINHAS * COLUNAS][2];
		int indicePar = 0, indiceImpar = matrizIndices.length - 1;

		// Le os valores para a matriz
		System.out.println("Informe 9 Numeros Inteiros para a Matriz");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				matriz[i][j] = ler.nextInt();

				if (matriz[i][j] % 2 == 0) {
					matrizIndices[indicePar][0] = i;
					matrizIndices[indicePar][1] = j;
					indicePar++;
				} else {
					matrizIndices[indiceImpar][0] = i;
					matrizIndices[indiceImpar][1] = j;
					indiceImpar--;
				}
			}
		}

		//Mostra os valores pares
		System.out.println("\nEssa matriz tem " + indicePar + " valores pares, sendo eles:");
		for (int h = 0; h < indicePar; h++) {

			int i = matrizIndices[h][0], j = matrizIndices[h][1];

			System.out.println(String.format("%1$d, na posicao %2$d %3$d", matriz[i][j], i + 1, j + 1));
		}

		//Mostra os valores impares
		System.out.println("\nEssa matriz tem " + (matrizIndices.length - indicePar) + " valores impares, sendo eles:");
		for (int h = matrizIndices.length - 1; h > indiceImpar; h--) {

			int i = matrizIndices[h][0], j = matrizIndices[h][1];

			System.out.println(String.format("%1$d, na posicao %2$d %3$d", matriz[i][j], i + 1, j + 1));
		}

		// Fecha o Objeto Scanner
		ler.close();

	}

}
