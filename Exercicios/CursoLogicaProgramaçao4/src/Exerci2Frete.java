import java.util.Scanner;

public class Exerci2Frete {

		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			Double valorProduto;
			Double valorFinal;
			final Double frete = 15.0;
			
			System.out.println("Digite o valor do produto: ");
			valorProduto = ler.nextDouble();
			
			if(valorProduto >= 100) {
				valorFinal = valorProduto;
				System.out.println("Valor final: "+valorFinal);
			}else {
				valorFinal = valorProduto + frete;
				System.out.println("Valor final: "+valorFinal);
			}
			
			
			
			ler.close();
			
		}
}
