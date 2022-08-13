import java.util.Scanner;

public class CalcularIMCExerc3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Double IMC;
		Double peso;
		Double altura;
		
		System.out.println("Digite o peso: ");
		peso = scanner.nextDouble();
		
		System.out.println("Digite a altura: ");
		altura = scanner.nextDouble();
		
		IMC = peso / (altura * altura);
		
		System.out.println("Seu IMC é: "+IMC);
		
		
		scanner.close();
		
	}

}