import java.util.Stack;

public class Pilha_ex3 {

	public static void main(String[] args) {
		Stack p;
		
		p = new Stack();
		
		String expressao = "(a+b*(2/3)-((2*3)+5))";
		boolean temERRO = false;

		for (int i = 0; i < expressao.length(); i++) {
			if (expressao.charAt(i) == '(') p.push('(');
			if (expressao.charAt(i) == ')') {
				if (!p.empty()) p.pop();
				else temERRO = true;
			}
			System.out.println( p );		
		}
		System.out.println("pilha final: \n" + p );
		
		if (!p.empty()) temERRO = true;
		
		if (temERRO) System.out.println("Tem ERRO!");
		else System.out.println("Expressão OK!");
			


	}

}
