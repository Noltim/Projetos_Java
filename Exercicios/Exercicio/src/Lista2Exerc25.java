import java.util.Scanner;

public class Lista2Exerc25 {

	public static void main(String[] args) {
		int contador = 0, resposta;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite 1 para verdadeiro ou 0 para falso.");

		System.out.println("Telefonou para a vítima? Digite '0' ou '1'");
		resposta = leia.nextInt();
		if (resposta == 1) {
			contador++;
		}
		System.out.println("Esteve no local do crime? Digite '0' ou '1'");
		resposta = leia.nextInt();
		if (resposta == 1) {
			contador++;
		}
		System.out.println("Mora perto da vítima? Digite '0' ou '1'");
		resposta = leia.nextInt();
		if (resposta == 1) {
			contador++;
		}
		System.out.println("Devia para a vítima? Digite '0' ou '1'");
		resposta = leia.nextInt();
		if (resposta == 1) {
			contador++;
		}
		System.out.println("Já trabalhou com a vítima? Digite '0' ou '1'");
		resposta = leia.nextInt();
		if (resposta == 1) {
			contador++;
		}
		if (contador == 2) {
			System.out.println("Suspeita");
		} else if (contador >= 3 && contador <= 4) {
			System.out.println("Cúmplice");
		} else if (contador >= 5) {
			System.out.println("Assassino");
		} else {
			System.out.println("Inocente");
		}
		leia.close();
	}
}
