import java.util.Scanner;

public class VerMedia3valores {

	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
		
		Double nota1;
		Double nota2;
		Double nota3;
		Double media;
		Double notaParaPassar;
		
		System.out.print("Digite a primeiro nota: ");
		nota1 = lerTeclado.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = lerTeclado.nextDouble();	
		System.out.print("Digite a terceira nota: ");
		nota3 = lerTeclado.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		if(media < 5) {
			System.out.println("Aluno em recuperação.");
			notaParaPassar = (10 - media + 2);
			System.out.println("Nota para passar: "+notaParaPassar);
			
		}else if(media > 5 && media < 7) {
			System.out.println("Aluno  na final.");
			notaParaPassar = 10 - media;
			System.out.println("Nota para passar: "+notaParaPassar);
		}else  {
			System.out.println("Aluno aprovado.");
			System.out.println("Nota: "+media);
		}

		lerTeclado.close();
	}

}
