import java.util.Scanner;

public class Exerci1Calculadora {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Double numero1;
		Double numero2;
		Double operador;
		Double resultado;
		
		System.out.println("Digite o primeiro n�mero: ");
		numero1 = ler.nextDouble();
		
		System.out.println("Digite o operador [1= adi��o, 2 = subtra��o, 3 = multiplica��o, 4 = divis�o]: ");
		operador = ler.nextDouble();
		
		System.out.println("Digite o segundo n�mero: ");
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
