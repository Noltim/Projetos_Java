import java.util.Scanner;

public class Lista2Exerc20 {

	public static void main(String[] args) {
		double nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a 1° nota do aluno: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite a 2° nota do aluno: ");
		nota2 = leia.nextDouble();
		System.out.println("Digite a 3° nota do aluno: ");
		nota3 = leia.nextDouble();
		
		media = ((nota1 + nota2 + nota3) / 3);
		
		if(media == 10) {
			System.out.println("Aluno aprovado com distinção");
		}else if(media >= 7 && media < 10) {
			System.out.println("Aluno aprovado com a respectiva média alcançada");
		}else if(media < 7) {
			System.out.println("Aluno reprovado por média.");
		}
		leia.close();
	}
}
