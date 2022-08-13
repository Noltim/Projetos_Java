import java.util.Scanner;

public class Exerci10 {

	//exercicio 9
		
	public static void main(String[] args) {
		
		float temperaturaC = 0;
		float temperaturaF;
		
		Scanner leia = new Scanner(System.in);

		
		System.out.println("Digite a temperatura em Cº: ");
		temperaturaC = leia.nextFloat();
		
		temperaturaF = ((9*temperaturaC)/5)+32;
		
		System.out.println("Sua temperatura de "+temperaturaC+"Cº equivale a " +temperaturaF+ "Fº ");
		
		
		leia.close();

	}
	

		
}
