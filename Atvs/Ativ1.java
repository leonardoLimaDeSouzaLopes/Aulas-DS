import java.util.Scanner;

public class Ativ1 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		double base, altura;
		
		System.out.println("Digite o tamanho da base");
		base = ler.nextDouble();
		System.out.println("Digite o tamanho da altura");
		altura = ler.nextDouble();
		
		
		double perimetro = 2*(base+altura);
		double area = base*altura;
		
		
		System.out.println("Perimetro é: "+ perimetro +" e a área: "+ area);
		
		
		ler.close();

	}

}
