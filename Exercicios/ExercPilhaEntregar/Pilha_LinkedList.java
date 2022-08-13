import java.util.LinkedList;

public class Pilha_LinkedList {
	
	private LinkedList <Character> info;
	private int max;
	
	public Pilha_LinkedList(int max) {
		this.max = max;
		info = new LinkedList<Character>();
	}

	public Pilha_LinkedList() {
		this.max = 1000;
		info = new LinkedList<Character>();
	}
	
	public void push (char e ) {
		if ( !overflow() ) {
			info.addLast(e);
		} else
			System.out.println("Pilha cheia!!!");
	}
	
	public char top () {
		if ( !underflow() ) {
			return info.getLast();
		} else {
				System.out.println("Pilha vazia!");
				return '?';
		}
	}
	
	public char pop () {
		if ( !underflow() ) {
			return info.removeLast();
		} else {
				System.out.println("Pilha vazia!");
				return '?';
		}
	}
	
	public boolean underflow() {
		return info.size() == 0;
	}
	
	public boolean overflow() {
		return info.size() == max;
	}
	
	@Override
	public String toString() {
		String res = "BASE-|";
		res = res + info;
		res = res +"|- TOPO";
		return res;
	}
	
	
}
