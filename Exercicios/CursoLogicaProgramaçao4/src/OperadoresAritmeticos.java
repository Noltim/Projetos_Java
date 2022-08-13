
public class OperadoresAritmeticos {
	
	public static void main(String[] args) {
		
		Integer adicao = 1 + 1;
		System.out.println("Adição: "+adicao);
		
		Integer subtracao = 1 - 1;
		System.out.println("Subtração: "+subtracao);
		
		Integer multiplicacao = 2 * 2;
		System.out.println("Multiplicação: "+multiplicacao);
		
		Integer divisao = 4 / 2;
		System.out.println("Divisão: "+divisao);
		
		Integer modulo = 7 % 4;
		System.out.println("Modulo: "+modulo);
		
		Integer precedencia1 = 1 + 1 * 5;
		System.out.println("Precedência 1: "+precedencia1);
		
		Integer precedencia2 = (1 + 1) * 5;
		System.out.println("Precedência 2: "+precedencia2);
		
		Integer precedencia3 = 5 * (1 + 1);
		System.out.println("Precedência 3: "+precedencia3);
		
		Integer precedencia4 = 2 + (1 + 1) * 5;
		System.out.println("Precedência 4: "+precedencia4);
		
		Integer precedencia5 = (2 + (1 + 1)) * 5;
		System.out.println("Precedência 5: "+precedencia5);
		
		Integer cinco = 5;
		Integer um = 1;
		Integer comVariaveis = cinco *(um + um);
		System.out.println("Precedência 6: "+comVariaveis);
	}
}
