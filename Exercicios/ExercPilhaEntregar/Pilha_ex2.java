import java.util.Stack;

public class Pilha_ex2 {

	public static void main(String[] args) {
		Stack p;
		
		p = new Stack();
		
		String frase = "Essa chuva não para nunca!";
		String fraseInv = "";
		
		for (int i = 0; i < frase.length(); i++) {
			p.push(frase.charAt(i));
		}
		System.out.println("topo de p: " + p.peek());

		System.out.println( p );

		for (int i = 0; i < frase.length(); i++) {
			fraseInv = fraseInv + p.pop();
		}

		System.out.println("frase   :" + frase);
		System.out.println("fraseInv:" + fraseInv);
		System.out.println("Vazia: " + p.empty() + p);
		
		
	}

}
