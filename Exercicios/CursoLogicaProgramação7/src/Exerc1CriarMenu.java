import java.util.Scanner;

public class Exerc1CriarMenu {

	public static void main(String[] args) {
		String cardapio[] = new String [4];
		Scanner LerTeclado = new Scanner (System.in);
		
		cardapio[0] = "";
		cardapio[1] = "";
		cardapio[2] = "";
		cardapio[3] = "";
		
		System.out.println("Digite o cardapio: ");
		
		System.out.print("Item 1: ");
		cardapio[0] = LerTeclado.nextLine();
		
		System.out.print("Item 2: ");
		cardapio[1] = LerTeclado.nextLine();
		
		System.out.print("Item 3: ");
		cardapio[2] = LerTeclado.nextLine();
		
		System.out.print("Item 4: ");
		cardapio[3] = LerTeclado.nextLine();
		
		
		for(int i = 0; i < cardapio.length; i++) {
			System.out.println(cardapio[i]);	
		}
		
		
		LerTeclado.close();
	}
}
