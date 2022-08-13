import java.util.Scanner;

public class Lista3Exerc1 {

	public static void main(String[] args) {

		double nota, nota2;

		Scanner s = new Scanner(System.in);

		System.out.println("digite uma nota entre 0 e 10 :");
		nota = s.nextDouble();

		do {
			System.out.println("Nota Inválida, por favor inserir nota entre a e 10");
			System.out.println("digite uma nota entre 0 e 10 :");
			nota2 = s.nextDouble();

		} while (nota >= 0 && nota <= 10);
		System.out.println("Nota válida!");

		System.out.println("----------------------------------------------------------");

		s.close();
	}
}