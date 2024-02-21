import java.util.Scanner;

public class Ativ1 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		int base, altura;
		
		System.out.println("Digite o tamanho da base");
		base = ler.nextInt();
		System.out.println("Digite o tamanho da altura");
		altura = ler.nextInt();
		
		
		int area = base*altura;
		int perimetro = 2*(base+altura);
		
		System.out.println("Perimetro é: "+ perimetro +" e a área: "+ area);
		
		
		ler.close();

	}

}
