
public class OperadoresAritmeticos {
	
	public static void main(String[] args) {
		
		Integer adicao = 1 + 1;
		System.out.println("Adi��o: "+adicao);
		
		Integer subtracao = 1 - 1;
		System.out.println("Subtra��o: "+subtracao);
		
		Integer multiplicacao = 2 * 2;
		System.out.println("Multiplica��o: "+multiplicacao);
		
		Integer divisao = 4 / 2;
		System.out.println("Divis�o: "+divisao);
		
		Integer modulo = 7 % 4;
		System.out.println("Modulo: "+modulo);
		
		Integer precedencia1 = 1 + 1 * 5;
		System.out.println("Preced�ncia 1: "+precedencia1);
		
		Integer precedencia2 = (1 + 1) * 5;
		System.out.println("Preced�ncia 2: "+precedencia2);
		
		Integer precedencia3 = 5 * (1 + 1);
		System.out.println("Preced�ncia 3: "+precedencia3);
		
		Integer precedencia4 = 2 + (1 + 1) * 5;
		System.out.println("Preced�ncia 4: "+precedencia4);
		
		Integer precedencia5 = (2 + (1 + 1)) * 5;
		System.out.println("Preced�ncia 5: "+precedencia5);
		
		Integer cinco = 5;
		Integer um = 1;
		Integer comVariaveis = cinco *(um + um);
		System.out.println("Preced�ncia 6: "+comVariaveis);
	}
}
