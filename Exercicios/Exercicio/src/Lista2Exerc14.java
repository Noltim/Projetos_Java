import java.util.Scanner;

public class Lista2Exerc14 {

	public static void main(String[] args) {
		double nota1,nota2,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a 1� nota: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite a 2� nota: ");
		nota2 = leia.nextDouble();
		
		media = (nota1 + nota2)/2;
		System.out.println("A m�dia do aluno �: "+media);
		System.out.println("Suas notas s�o: "+nota1+" e "+nota2);
		
		if(media >= 9 && media <=10) {
			System.out.println("Seu conceito �: A");
			System.out.println("Aluno aprovado");
		}else if(media >=7.5 && media < 9 ){
			System.out.println("Seu conceito �: B");
			System.out.println("Aluno aprovado");
		}else if(media >= 6 && media < 7.5) {
			System.out.println("Seu conceito �: C");
			System.out.println("Aluno aprovado");
		}else if(media >= 4 && media <6) {
			System.out.println("Seu conceito �: D");
			System.out.println("Aluno reprovado");
		}else {
			System.out.println("Seu conceito �: E");
			System.out.println("Aluno reprovado");
		}
		leia.close();
	}
}
