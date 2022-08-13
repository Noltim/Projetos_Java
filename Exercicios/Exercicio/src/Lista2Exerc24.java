import java.util.Scanner;

public class Lista2Exerc24 {

	public static void main(String[] args) {
		double numero1, numero2, resultado;
		int opcao;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextDouble();
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextDouble();

		System.out.println("Qual função você deseja: ");
		System.out.println("1 - Soma; 2- Divisao; 3- Subtração; 4- Multiplicação ");
		System.out.println("Digite a opção desejada: ");
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			resultado = numero1 + numero2;
			System.out.println("Seu númeor é: "+resultado);
			if (resultado % 2 == 0) {
				System.out.println("Seu número é par");
			} else
				System.out.println("Seu número é impar");

			if (resultado > 0) {
				System.out.println("Número é positivo");
			} else
				System.out.println("Número é negativo");

			if (resultado % 1 == 0) {
				System.out.println("Inteiro");
			} else {
				System.out.println("Decimal");
			}

			break;
		case 2:
			resultado = numero1 / numero2;
			System.out.println("Seu númeor é: "+resultado);
			if (resultado % 2 == 0) {
				System.out.println("Seu número é par");
			} else
				System.out.println("Seu número é impar");

			if (resultado > 0) {
				System.out.println("Número é positivo");
			} else
				System.out.println("Número é negativo");

			if (resultado % 1 == 0) {
				System.out.println("Inteiro");
			} else {
				System.out.println("Decimal");
			}
			break;
		case 3:
			resultado = numero1 - numero2;
			System.out.println("Seu númeor é: "+resultado);
			if (resultado % 2 == 0) {
				System.out.println("Seu número é par");
			} else
				System.out.println("Seu número é impar");

			if (resultado > 0) {
				System.out.println("Número é positivo");
			} else
				System.out.println("Número é negativo");

			if (resultado % 1 == 0) {
				System.out.println("Inteiro");
			} else {
				System.out.println("Decimal");
			}
			break;
		case 4:
			resultado = numero1 * numero2;
			System.out.println("Seu númeor é: "+resultado);
			if (resultado % 2 == 0) {
				System.out.println("Seu número é par");
			} else
				System.out.println("Seu número é impar");

			if (resultado > 0) {
				System.out.println("Número é positivo");
			} else
				System.out.println("Número é negativo");

			if (resultado % 1 == 0) {
				System.out.println("Inteiro");
			} else {
				System.out.println("Decimal");
			}
			break;
		default:
			System.out.println("O número escolhido é inválido! Digite um número entre 1 a 4.");
		}
		leia.close();
	}
}
