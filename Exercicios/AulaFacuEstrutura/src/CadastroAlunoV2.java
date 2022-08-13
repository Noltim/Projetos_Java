import java.util.Scanner;

public class CadastroAlunoV2 {

	public static void main(String[] args) {
		int numeroDeAlunos;
		
		Scanner leia = new Scanner(System.in);
		
		AlunoV2 [] vetAluno;
		
		
		
		System.out.println("Digite o número de alunos: ");
		numeroDeAlunos = leia.nextInt();
		
		vetAluno = new AlunoV2[numeroDeAlunos];
		
		for(int i = 0; i < vetAluno.length; i++) {
			vetAluno[i] = new AlunoV2();
			vetAluno[i].endereco = new RegistroEndereco();

		System.out.println("Digite o nome do aluno: ");
		vetAluno[i].nome = leia.nextLine();
		leia.nextLine();

		System.out.println("Digite a sala do aluno: ");
		vetAluno[i].sala = leia.nextInt();

		System.out.println("Digite o semestre do aluno: ");
		vetAluno[i].semestre = leia.nextInt();

		System.out.println("Digite o curso do aluno: ");
		vetAluno[i].curso = leia.nextLine();
		leia.nextLine();

		for (int j = 0; j < vetAluno[i].notas.length; j++) {
			System.out.println("Digite a " + vetAluno[i].contadorDeNota + " nota do aluno: ");
			vetAluno[i].notas[j] = leia.nextDouble();

			vetAluno[i].contadorDeNota++;
		}

		System.out.println("Digite a rua do aluno: ");
		vetAluno[i].endereco.rua = leia.nextLine();
		leia.nextLine();

		System.out.println("Digite o bairro do aluno: ");
		vetAluno[i].endereco.bairro = leia.nextLine();

		System.out.println("Digite a cidade do aluno: ");
		vetAluno[i].endereco.cidade = leia.nextLine();

		System.out.println("Digite o estado do aluno: ");
		vetAluno[i].endereco.estado = leia.nextLine();

		System.out.println("Digite o cep do aluno: ");
		vetAluno[i].endereco.cep = leia.nextInt();
		
		}

		for(int i = 0; i < vetAluno.length; i++) {
		System.out.println("Nome do aluno: " + vetAluno[i].nome);
		System.out.println("Sala: " + vetAluno[i].sala);
		System.out.println("Semestre: " + vetAluno[i].semestre);
		System.out.println("Curso: " + vetAluno[i].curso);
		System.out.println("Notas: ");
		for (int j = 0; j < vetAluno[i].notas.length; j++) {
			System.out.print(vetAluno[i].notas[j] + " ");
		}
		System.out.println();
		
		System.out.println("Rua :"+vetAluno[i].endereco.rua);
		System.out.println("Bairro: "+vetAluno[i].endereco.bairro);
		System.out.println("Cidade: "+vetAluno[i].endereco.cidade);
		System.out.println("Estado: "+vetAluno[i].endereco.estado);
		System.out.println("CEP: "+vetAluno[i].endereco.cep);
		}

		leia.close();
	}

}
