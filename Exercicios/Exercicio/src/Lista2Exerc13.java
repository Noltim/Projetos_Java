import java.util.Scanner;

public class Lista2Exerc13 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Escolha um número entre 1 a 7");
		int numero = leia.nextInt();
		switch (numero) {
		case 1:
			System.out.println("O número escolhido foi: 1-Domingo");
			break;
		case 2:
			System.out.println("O número escolhido foi: 2-Segunda-feira");
			break;
		case 3:
			System.out.println("O número escolhido foi: 3-Terça-feira");
			break;
		case 4:
			System.out.println("O número escolhido foi: 4-Quarta-feira");
			break;
		case 5:
			System.out.println("O número escolhido foi: 5-Quinta-feira");
			break;
		case 6:
			System.out.println("O número escolhido foi: 6-Sexta-feira");
			break;
		case 7:
			System.out.println("O número escolhido foi: 7-Sabado");
			break;
		default:
			System.out.println("O número escolhido é inválido! Digite um número entre 1 a 7.");
		}
	}
}
