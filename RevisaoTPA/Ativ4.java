import java.util.Scanner;

public class Ativ4 {

	public static void main(String[] args) {

		// Cria os Objeto Scanner
		Scanner ler = new Scanner(System.in);

		// Cria uma String para guardar a resposta do usuario
		String resposta = "";

		do {

			// Cria a variavel da leitura
			double precoProduto, lucros;

			// Le o valor para a variavel
			System.out.println("Coloque o preco do produto");
			precoProduto = ler.nextDouble();
			System.out.println("Coloque o lucro");
			lucros = ler.nextDouble();

			// Cria e calcula o valor da variavel
			double precoVenda = precoProduto / (1 - lucros / 100);

			// Mostra o resultado com ate 2 casas decimais (por causa do format (: )
			System.out.println(String.format("O preco final e: %.2f R$", precoVenda));

			// Pergunta se o Usuario deseja continuar a Execucao
			System.out.println("Deseja continuar a execucao?(S/N)");
			resposta = ler.next();

			// Verifica a Resposta
		} while (!(resposta.equalsIgnoreCase("N")));

		// Fecha o Objeto Scanner
		ler.close();

	}
}