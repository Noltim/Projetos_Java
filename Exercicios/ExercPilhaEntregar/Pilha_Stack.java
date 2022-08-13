import java.util.Stack;

public class Pilha_Stack {

	private Stack <Character> info;
	private int max;
	
	public Pilha_Stack(int max) {
		this.max = max;
		info = new Stack<Character>();
	}

	public Pilha_Stack() {
		this.max = 1000;
		info = new Stack<Character>();
	}
	
	@Override
	public String toString() {
		String res = "BASE-|";
		res = res + info;
		res = res +"|- TOPO";
		return res;
	}
	
	
}


