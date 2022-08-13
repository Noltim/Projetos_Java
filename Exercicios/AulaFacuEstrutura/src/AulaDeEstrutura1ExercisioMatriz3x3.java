import java.util.Scanner;

public class AulaDeEstrutura1ExercisioMatriz3x3 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int [][] matriz = new int[3][3];
		
		int somaPrimeiraLinha = 0;
		int produtoPrimeiraLinha = 1;
		int somaTotal = 0;
		int somaDiagonal = 0;
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Digite os valores que serão salvos: ");
				matriz[i][j] = leia.nextInt();
				somaTotal+=matriz[i][j];
				
			}

		}
			
		System.out.println("Sua matriz é: ");
		for (int i = 0; i < matriz.length; i++) {
			somaPrimeiraLinha+=matriz[0][i];
			produtoPrimeiraLinha*=matriz[0][i];
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
				
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(i == j) {
					somaDiagonal += matriz[i][j];
				}
			}

		}
		
		
		System.out.println("Soma da primeira linha é: "+somaPrimeiraLinha);
		System.out.println("O produto da primeira linha é: "+produtoPrimeiraLinha);
		System.out.println("Soma total é: "+somaTotal);
		System.out.println("Soma da diagonal principal é: "+somaDiagonal);
		
			
			
		
		
		leia.close();
	}
}
