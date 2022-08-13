import java.util.Scanner;

public class Exerc1Notas {

	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
		
		Double notaPortugues;//vai de 0 a 100 em nota, mas nao pode tirar menos de 60
		Double notaMatematica;// vai de 0 a 100 em nota, mas nao pode tirar menos de 60
		Double notaTotal; //a soma total da 200
		
		System.out.println("Digite a nota de português: ");
		notaPortugues = lerTeclado.nextDouble();
		
		System.out.println("Digite a nota de matemática: ");
		notaMatematica = lerTeclado.nextDouble();
		
		notaTotal = notaMatematica + notaPortugues;
		
		if (notaTotal >= 150 && notaPortugues >= 60 && notaMatematica >= 60) {
			System.out.println("Aprovado!");
		}else {
			System.out.println("Reprovado!");
		}
		
		lerTeclado.close();
	}
}
