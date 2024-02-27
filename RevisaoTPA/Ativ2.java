import java.util.Scanner;

public class Ativ2 {

	public static void main(String[] args) {

		// Cria os Objeto Scanner
		Scanner ler = new Scanner(System.in);

		// Cria as variaveis da leitura
		double valorHora;
		int aulasDadas;

		// Le o valor para as variaveis
		System.out.println("Diga o valor da hora de aula");
		valorHora = ler.nextDouble();
		System.out.println("Diga o numero de aulas dadas no mes");
		aulasDadas = ler.nextInt();

		// Cria as variaveis double salario e salario liquido e calcula o valor da primeira
		double salario = aulasDadas * valorHora, salarioLiquido;
		
		
		//Faz as verificacoes para calcular o salario liquido
		if (salario <= 1212) {
			salarioLiquido = salario - (salario / 100) * 7.5;
		} else if (salario <= 2427.35) {
			salarioLiquido = salario - (salario / 100) * 9;
		} else if (salario <= 3641.03) {
			salarioLiquido = salario - (salario / 100) * 12;
		} else if (salario <= 7087.22) {
			salarioLiquido = salario - (salario / 100) * 14;
		} else if (salario <= 12136.79) {
			salarioLiquido = salario - (salario / 100) * 14.5;
		} else if (salario <= 24273.57) {
			salarioLiquido = salario - (salario / 100) * 16.5;
		} else if (salario <= 47333.46) {
			salarioLiquido = salario - (salario / 100) * 19;
		} else {
			salarioLiquido = salario - (salario / 100) * 22;
		}
		
		// Mostra o valor do salario liquido
		System.out.println(salarioLiquido);
		
		
		// Tinha Feito Usando for e 2 vetores para nao fazer muitos IFs, acho que se fosse em um programa que os dados da aliquota e da base de contribuicao fossem
		// alterar com o passar do tempo ia ficar mais facil de alterar e o codigo ficaria mais limpo, mas como o valor nao vai mudar (pois e um exercicio) os varios
		// IFs sao uma melhor opcao.
		//
		//	double[] aliquota = {7.5, 9, 12, (13+1), (13+1.5), 16.5, 19, 22}, baseDeContribuicao = {1212, 2427.35, 3641.03, 7087.22, 12136.79, 24273.57, 47333.46};
		//		
		//	boolean breakado = false;
		//		
		//	for (int i = 0; i < aliquota.length - 1; i++) {
		//		if (salario <= baseDeContribuicao[i]) {
		//			salarioLiquido = salario - (salario/100)*aliquota[i];
		//			System.out.println(salarioLiquido);
		//			breakado = true;
		//			break;
		//		}
		//	}
		//	if (breakado == false) {
		//		salarioLiquido = salario - (salario/100)*aliquota[aliquota.length - 1];
		//		System.out.println(salarioLiquido);
		//	}
		

		// Fecha o Objeto Scanner
		ler.close();
	}
}