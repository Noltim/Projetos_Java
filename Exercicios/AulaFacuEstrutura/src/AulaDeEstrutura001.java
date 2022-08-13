import java.util.Scanner;

public class AulaDeEstrutura001 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int tam1;
		int tam2;

		System.out.println("Digite o número de linhas da matriz: ");
		tam1 = leia.nextInt();
		System.out.println("Digite o número de coulnas da matriz: ");
		tam2 = leia.nextInt();

		int[][] a = new int[tam1][tam2];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print("Digite os valores que serão salvos: ");
				a[i][j] = leia.nextInt();
			}

		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
