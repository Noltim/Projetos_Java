import java.util.Scanner;

public class Exerci1Calculadora {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Double numero1;
		Double numero2;
		Double operador;
		Double resultado;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = ler.nextDouble();
		
		System.out.println("Digite o operador [1= adição, 2 = subtração, 3 = multiplicação, 4 = divisão]: ");
		operador = ler.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		numero2 = ler.nextDouble();
		
		if (operador == 1) {
			resultado = numero1 + numero2;
			System.out.println("Resultado: "+resultado);
		}else if (operador == 2) {
			resultado = numero1 - numero2;
			System.out.println("Resultado: "+resultado);
		}else if (operador == 3) {
			resultado = numero1 * numero2;
			System.out.println("Resultado: "+resultado);
		}else if (operador == 4){
			resultado = numero1 / numero2;
			System.out.println("Resultado: "+resultado);
		}
	}
}
