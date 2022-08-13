import java.util.Scanner;

public class Lista2Exerc22 {

	public static void main(String[] args) {
		int numero;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		numero = leia.nextInt();
		
		if(numero%2 == 0) {
			System.out.println("Seu número é par");
		}else
			System.out.println("Seu número é impar");
	}
}
