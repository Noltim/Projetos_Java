import java.util.Scanner;

public class Exerc3DiaSemanas {
	
	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
		Integer diaDaSemana;
		
		System.out.println("Digite o dia: ");
		diaDaSemana = lerTeclado.nextInt();
		
		switch (diaDaSemana) {
		case 1:
			System.out.println("Domingo.");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sabádo");
			break;
			
		default:
			 System.err.println("Dia errado");
			 System.exit(1);
		}
		
		
		
		lerTeclado.close();
	}
}
