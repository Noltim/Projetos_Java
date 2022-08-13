

public class AulaDeEstrutura01 {

	public static void main(String[] args) {
		// Aula de matrizes multidimensionais(3,4,5,6...)
		
		//int [] [].....[] mult;
		// mult = new int[100][20]....[3];
		
		int [] vet;
		vet = new int [100];
		
		int [][] mat;
		mat = new int [100][100];
		
		int [][][][] mult;
		mult = new int[100][100][2][10];
		
		vet [0] = 10;
		mat[0][0]=123;
		mult[99][99][1][9] = 1000;
		
		System.out.println(vet[0]);
		System.out.println(mat[0][0]);
		System.out.println(mult [99][99][1][9]);

	}

}
