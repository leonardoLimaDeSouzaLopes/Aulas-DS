import java.util.Scanner;

public class Ativ2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int A [] [] = new int [3] [3];
		
		System.out.println(" Digite numeros do conjunto A");
		
		for (int i = 0; i < A.length; i++) {
		for (int j = 0; j < A.length; j++) {
			A [i] [j] = ler.nextInt();
		}
		}
		int par = 0, impar = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if( A [i] [j] % 2 == 0) {
					par++;
				}else {
					impar ++;
				}
			}
			}
		System.out.println("O numero de impares é: 0"+impar);
		System.out.println("O numero de impares é: 0"+par);
		
		
		
		ler.close();
	}

}