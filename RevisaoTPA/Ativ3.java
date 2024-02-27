import java.util.Scanner;

public class Ativ3 {

	public static void main(String[] args) {

		// Cria os Objeto Scanner
		Scanner ler = new Scanner(System.in);

		// Cria a variavel da leitura
		String numero;

		// Le o valor para a variavel
		System.out.println("Insira um numero");
		numero = ler.next();

		// O try e para caso o input nao seja um numero
		try {

			// Faz com que caso o input nao seja um numero de erro mandando a mensagem que
			// ta no catch
			Integer.parseInt(numero);

			// Manda uma mensagem se o numero nao for um numero kk
		} catch (Exception erro) {
			System.out.println("O valor inserido nao e um numero inteiro");
		}

		// Separa os algarismos numero em um vetor
		String[] numerosSeparado = numero.split(""), numerosSeparadoInvertidos = new String[numerosSeparado.length];

		// Inverte o vetor
		for (int i = 0; i < numerosSeparado.length; i++) {
			numerosSeparadoInvertidos[i] = numerosSeparado[numerosSeparado.length - 1 - i];
		}

		// Junta o numero
		String numeroInvertido = String.join("", numerosSeparadoInvertidos);

		System.out.println("O numero invertido fica: " + numeroInvertido);

		// Fecha o Objeto Scanner
		ler.close();
	}

}
