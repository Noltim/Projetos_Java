
public class ProgramaEC {

	public static void main(String[] args) {
		Pessoa p1;
		p1 = new Pessoa();
		p1.nome = "Pedro";
		p1.idade = 21;
		p1.altura = 1.70;
		p1.sexo = 'M';
		System.out.println(p1.nome);
		System.out.println(p1.idade);
		System.out.println(p1.altura);
		System.out.println(p1.sexo);
	}
}