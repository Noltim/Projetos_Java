import java.util.Scanner;

public class Lista2Exerc24 {

	public static void main(String[] args) {
		double numero1, numero2, resultado;
		int opcao;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero: ");
		numero1 = leia.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		numero2 = leia.nextDouble();

		System.out.println("Qual fun��o voc� deseja: ");
		System.out.println("1 - Soma; 2- Divisao; 3- Subtra��o; 4- Multiplica��o ");
		System.out.println("Digite a op��o desejada: ");
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			resultado = numero1 + numero2;
			System.out.println("Seu n�meor �: "+resultado);
			if (resultado % 2 == 0) {
				System.out.println("Seu n�mero � par");
			} else
				System.out.println("Seu n�mero � impar");

			if (resultado > 0) {
				System.out.println("N�mero � positivo");
			} else
				System.out.println("N�mero � negativo");

			if (resultado % 1 == 0) {
				System.out.println("Inteiro");
			} else {
				System.out.println("Decimal");
			}

			break;
		case 2:
			resultado = numero1 / numero2;
			System.out.println("Seu n�meor �: "+resultado);
			if (resultado % 2 == 0) {
				System.out.println("Seu n�mero � par");
			} else
				System.out.println("Seu n�mero � impar");

			if (resultado > 0) {
				System.out.println("N�mero � positivo");
			} else
				System.out.println("N�mero � negativo");

			if (resultado % 1 == 0) {
				System.out.println("Inteiro");
			} else {
				System.out.println("Decimal");
			}
			break;
		case 3:
			resultado = numero1 - numero2;
			System.out.println("Seu n�meor �: "+resultado);
			if (resultado % 2 == 0) {
				System.out.println("Seu n�mero � par");
			} else
				System.out.println("Seu n�mero � impar");

			if (resultado > 0) {
				System.out.println("N�mero � positivo");
			} else
				System.out.println("N�mero � negativo");

			if (resultado % 1 == 0) {
				System.out.println("Inteiro");
			} else {
				System.out.println("Decimal");
			}
			break;
		case 4:
			resultado = numero1 * numero2;
			System.out.println("Seu n�meor �: "+resultado);
			if (resultado % 2 == 0) {
				System.out.println("Seu n�mero � par");
			} else
				System.out.println("Seu n�mero � impar");

			if (resultado > 0) {
				System.out.println("N�mero � positivo");
			} else
				System.out.println("N�mero � negativo");

			if (resultado % 1 == 0) {
				System.out.println("Inteiro");
			} else {
				System.out.println("Decimal");
			}
			break;
		default:
			System.out.println("O n�mero escolhido � inv�lido! Digite um n�mero entre 1 a 4.");
		}
		leia.close();
	}
}
