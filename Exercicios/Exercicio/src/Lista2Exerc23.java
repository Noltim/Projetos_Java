import java.util.Scanner;

public class Lista2Exerc23 {

	public static void main(String[] args) {
		double numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		numero = leia.nextDouble();
		
		if( numero % 1 == 0) {
			System.out.println("Inteiro");
		}else {
			System.out.println("Decimal");
		}
		leia.close();
	}
}
