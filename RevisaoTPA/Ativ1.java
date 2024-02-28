import java.util.Scanner;

public class Ativ1 {
	
	public static void main(String[] args) {
		
		// Cria os Objeto Scanner
		Scanner ler = new Scanner(System.in);
		
		// Cria as variaveis da leitura
		double base, altura;
		
		// Le o valor para as variaveis
		System.out.println("Digite o tamanho da base");
		base = ler.nextDouble();
		System.out.println("Digite o tamanho da altura");
		altura = ler.nextDouble();
		
		// Cria e calcula o valor das variaveis
		double perimetro = 2*(base+altura), area = base*altura;
		
		// Mostra o resultado
		System.out.println("Perimetro e: "+ perimetro +" e a area: "+ area);
		
		// Fecha o Objeto Scanner
		ler.close();

	}

}
