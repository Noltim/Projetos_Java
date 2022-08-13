import java.util.Scanner;

public class exerc11 {

	public static void main(String[] args) {
	
		
		int numero1, numero2;
		double numero3, resultado1, resultado2, resultado3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número interio: ");
		numero1 = leia.nextInt();
		System.out.println("Informe o segundo número interio: ");
		numero2 = leia.nextInt();
		System.out.println("Informe o primeiro número real: ");
		numero3 = leia.nextDouble();
		
		
		resultado1 = ((numero1 *2)*(numero2 / 2));
		System.out.println("O produto do dobro do primeiro com metade do segundo é:" +resultado1);
		resultado2 = ((numero1 * 3)+ (numero3));
		System.out.println("O produto do dobro do primeiro com metade do segundo é:" +resultado2);
		resultado3 = (Math.pow(numero3,2));
		System.out.println("O produto do dobro do primeiro com metade do segundo é:" +resultado3);
		
	
		
		
		leia.close();
		
		
	}
	
	
}
