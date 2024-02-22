import java.util.Scanner;

public class Ativ4 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String resposta = "";
		
		int i = 1;
		
		do {
			
			double precoProduto, lucros;

			System.out.println("Coloque o preço do " + i + "° produto");
			precoProduto = ler.nextDouble();

			System.out.println("Coloque o lucro");
			lucros = ler.nextDouble();

			double precoVenda = precoProduto / (1 - lucros / 100);

			System.out.println("O preço final é: " + String.format("%.02f", precoVenda) + " R$");

			System.out.println("Deseja continuar a execução?(S/N)");
			resposta = ler.next();
			
			i++;
			
		} while (!(resposta.equalsIgnoreCase("N")));

		ler.close();

	}
}