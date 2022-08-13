import java.util.Scanner;

public class Exerci3Contas {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite abaixo os valores gastos com...");
		
		Double total = 0.0;
		
		System.out.print("Luz: ");
		total += scanner.nextDouble();
		
		System.out.print("Água: ");
		total += scanner.nextDouble();
		
		System.out.print("Telefone: ");
		total += scanner.nextDouble();
		
		System.out.print("Escola: ");
		total += scanner.nextDouble();
		
		System.out.print("Cartão: ");
		total += scanner.nextDouble();
		
		System.out.print("Supermercado: ");
		total += scanner.nextDouble();
		
		System.out.println("O gasto total foi de: " + total);
		
		scanner.close();
		
		// meu codigo a baixo.			
		
//		Scanner lerTeclado = new Scanner(System.in);
//		Double contaDeLuz;
//		Double contaDeAgua;
//		Double contaDeTelefone;
//		Double contaDeEscolaFilho;
//		Double contaDeCartao;
//		Double contaDeSupermercado;
//		Double totalDeGastosDoMes = 0.0;
//		
//		System.out.println("Digite o valor da conta de luz: ");
//		contaDeLuz = lerTeclado.nextDouble();
//		
//		System.out.println("Digite o valor da conta de água: ");
//		contaDeAgua = lerTeclado.nextDouble();
//		
//		System.out.println("Digite o valor da conta de telefone: ");
//		contaDeTelefone = lerTeclado.nextDouble();
//		
//		System.out.println("Digite o valor da fatura da escolda: ");
//		contaDeEscolaFilho = lerTeclado.nextDouble();
//		
//		System.out.println("Digite o valor da conta do cartão: ");
//		contaDeCartao = lerTeclado.nextDouble();
//		
//		System.out.println("Digite o valor da conta do supermercado: ");
//		contaDeSupermercado = lerTeclado.nextDouble();
//		
//		totalDeGastosDoMes += (contaDeLuz + contaDeAgua + contaDeTelefone + contaDeEscolaFilho + contaDeCartao + contaDeSupermercado);
//		
//		System.out.println("Total a pagar do mês: "+totalDeGastosDoMes);
//		
//		
//		lerTeclado.close();
	}
}
