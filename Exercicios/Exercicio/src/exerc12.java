import java.util.Scanner;

public class exerc12 {


	public static void main(String[] args) {
		
		final double constante = 72.7;
		final int constante2 = 58;
		double altura;
		double pesoIdeal;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite sua altura: ");
		altura = leia.nextDouble();
		
		pesoIdeal = ((constante*altura)-constante2);
		
		System.out.println("Seu peso ideial é: "+pesoIdeal+"KG");
		
		leia.close();
	}
}
