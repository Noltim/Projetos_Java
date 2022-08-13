import java.util.Scanner;

public class Lista2Exerc27 {

	public static void main(String[] args) {

		double kgComprados,valorDaCompra;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite quantos KG foram comprados: ");
		kgComprados = leia.nextDouble();
		System.out.println("Digite o valor da compra: ");
		valorDaCompra = leia.nextDouble();
		
		System.out.println("O cliente comprou "+kgComprados+" KGs de frutas dando o valor "
				+ "de R$: "+valorDaCompra);
		
		if(kgComprados >= 8 || valorDaCompra >= 25) {
			valorDaCompra = (valorDaCompra - (valorDaCompra*0.01));
			System.out.println("Cliente ganhou 10% de desconto e vai pagar: R$: "+valorDaCompra);
		}
		leia.close();
	}
}
