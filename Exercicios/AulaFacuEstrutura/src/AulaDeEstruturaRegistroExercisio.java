import java.util.Iterator;
import java.util.Scanner;

public class AulaDeEstruturaRegistroExercisio {

	public static void main(String[] args) {

		String nome, curso, rua, bairro, cidade, estado;
		int semestre, sala, numeroDeAlunos, contadorNota = 1;
		double cep, numeroDeNotas;
		

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a quantidade de notas que serão cadastradas: ");
		numeroDeNotas = leia.nextDouble();

		System.out.println("Digite o número de alunos que serão cadastrados: ");
		numeroDeAlunos = leia.nextInt();

		double[] notas = new double[ (int) numeroDeNotas];
		int[] alunos = new int[numeroDeAlunos];

		for (int i = 0; i < alunos.length; i++) {
			
			System.out.println("Digite o nome do aluno: ");
			nome = leia.nextLine();
			leia.nextLine();

			System.out.println("Digite a sala do aluno: ");
			sala = leia.nextInt();
			leia.nextLine();

			System.out.println("Digite o semestre do aluno: ");
			semestre = leia.nextInt();

			System.out.println("Digite o curso do aluno: ");
			curso = leia.nextLine();
			leia.nextLine();

			System.out.println("Digite a rua do aluno: ");
			rua = leia.nextLine();
			
			System.out.println("Digite o bairro do aluno: ");
			bairro = leia.nextLine();
			
			System.out.println("Digite a cidade do aluno: ");
			cidade = leia.nextLine();
			

			System.out.println("Digite o estado do aluno: ");
			estado = leia.nextLine();
			

			System.out.println("Digite o cep do aluno: ");
			cep = leia.nextDouble();
			

			for (int j =0; j < notas.length; j++) {
				System.out.println("Digite a " + contadorNota + " nota do aluno: ");
				notas[j] = leia.nextDouble();

				contadorNota++;
			}
			contadorNota = 1;

		}

		leia.close();
	}
}
