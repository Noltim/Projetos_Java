import java.util.Scanner;

public class Lista2Exerc13 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Escolha um n�mero entre 1 a 7");
		int numero = leia.nextInt();
		switch (numero) {
		case 1:
			System.out.println("O n�mero escolhido foi: 1-Domingo");
			break;
		case 2:
			System.out.println("O n�mero escolhido foi: 2-Segunda-feira");
			break;
		case 3:
			System.out.println("O n�mero escolhido foi: 3-Ter�a-feira");
			break;
		case 4:
			System.out.println("O n�mero escolhido foi: 4-Quarta-feira");
			break;
		case 5:
			System.out.println("O n�mero escolhido foi: 5-Quinta-feira");
			break;
		case 6:
			System.out.println("O n�mero escolhido foi: 6-Sexta-feira");
			break;
		case 7:
			System.out.println("O n�mero escolhido foi: 7-Sabado");
			break;
		default:
			System.out.println("O n�mero escolhido � inv�lido! Digite um n�mero entre 1 a 7.");
		}
	}
}
