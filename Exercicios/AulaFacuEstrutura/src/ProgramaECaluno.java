
public class ProgramaECaluno {
	
		public static void main(String[] args) {
		Aluno [] a1;
		a1 = new Aluno [50];
		a1[0] = new Aluno();
		a1[0].notas = new double[3];
		a1[0].nome = "Pedro";
		a1[0].matricula = 123;
		a1[0].notas[0] = 9.8;
		System.out.println(a1[0].nome);
		System.out.println(a1[0].matricula);
		System.out.println(a1[0].notas[0]);
		}
		}