import java.util.Scanner;

public class Ativ2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double valorHora;
		int aulasDadas;
		
		System.out.println("Diga o valor da hora de aula");
		valorHora = ler.nextDouble();
		
		System.out.println("Diga o numero de aulas dadas no mes");
		aulasDadas = ler.nextInt();
		
		double salario = aulasDadas*valorHora, salarioLiquido;
		
		double[] aliquota = {7.5, 9, 12, (13+1), (13+1.5), 16.5, 19, 22}, baseDeContribuicao = {1212, 2427.35, 3641.03, 7087.22, 12136.79, 24273.57, 47333.46};
		
		boolean breakado = false;
		
		
		for (int i = 0; i < aliquota.length - 2; i++) {
			if (salario <= baseDeContribuicao[i]) {
				salarioLiquido = salario - (salario/100)*aliquota[i];
				System.out.println(salarioLiquido);
				breakado = true;
				break;
			}
		}
		if (breakado == false) {
			salarioLiquido = salario - (salario/100)*aliquota[8];
			System.out.println(salarioLiquido);
		}
		
		ler.close();
	}
}