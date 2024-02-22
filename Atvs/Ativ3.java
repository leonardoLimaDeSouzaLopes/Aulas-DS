import java.util.Scanner;

public class Ativ3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String numero;
		
		System.out.println("Insira um numero");
		numero = ler.next();
		
		String[] numerosSeparado = numero.split(""), numerosSeparadoInvertidos = new String[numerosSeparado.length];
		
		for (int i = 0; i < numerosSeparado.length; i++) {
			numerosSeparadoInvertidos[i] = numerosSeparado[numerosSeparado.length - 1 - i];
		}
		
		String numeroInvertido = String.join("", numerosSeparadoInvertidos);
		
		System.out.println("O numero invertido fica: " + numeroInvertido);

		ler.close();
	}

}
