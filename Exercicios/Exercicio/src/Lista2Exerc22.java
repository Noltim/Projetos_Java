import java.util.Scanner;

public class Lista2Exerc22 {

	public static void main(String[] args) {
		int numero;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o n�mero: ");
		numero = leia.nextInt();
		
		if(numero%2 == 0) {
			System.out.println("Seu n�mero � par");
		}else
			System.out.println("Seu n�mero � impar");
	}
}
