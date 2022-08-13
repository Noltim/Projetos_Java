import java.util.Scanner;


public class CadastroAlunosEstrutura1 {

	public static void main(String[] args) {

		int numeroDeAlunos;

		Scanner leia = new Scanner(System.in);

		ClasseModeloAlunosParaCadastro[] Aluno;

		System.out.println("Digite o número de alunos: ");
		numeroDeAlunos = leia.nextInt();

		Aluno = new ClasseModeloAlunosParaCadastro[numeroDeAlunos];

		for(int i = 0; i < Aluno.length; i++);{
		
		Aluno[numeroDeAlunos] = new ClasseModeloAlunosParaCadastro();

		System.out.println("Digite o nome do aluno: ");
		Aluno[numeroDeAlunos].nome = leia.nextLine();
		leia.nextLine();

		System.out.println("Digite a sala do aluno: ");
		Aluno[numeroDeAlunos].sala = leia.nextInt();
		leia.nextLine();

		System.out.println("Digite o semestre do aluno: ");
		Aluno[numeroDeAlunos].semestre = leia.nextInt();

		System.out.println("Digite o curso do aluno: ");
		Aluno[numeroDeAlunos].curso = leia.nextLine();
		leia.nextLine();

		System.out.println("Digite a rua do aluno: ");
		Aluno[numeroDeAlunos].rua = leia.nextLine();

		System.out.println("Digite o bairro do aluno: ");
		Aluno[numeroDeAlunos].bairro = leia.nextLine();

		System.out.println("Digite a cidade do aluno: ");
		Aluno[numeroDeAlunos].cidade = leia.nextLine();

		System.out.println("Digite o estado do aluno: ");
		Aluno[numeroDeAlunos].estado = leia.nextLine();

		System.out.println("Digite o cep do aluno: ");
		Aluno[numeroDeAlunos].cep = leia.nextDouble();
		
		}

		leia.close();
	}

}
