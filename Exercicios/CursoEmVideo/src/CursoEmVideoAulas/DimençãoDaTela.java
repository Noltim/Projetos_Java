package CursoEmVideoAulas;

import java.awt.Dimension;
import java.awt.Toolkit;

public class DimençãoDaTela {
	public static void main(String [] args) {
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		
		System.out.println("Sua dimenção de tela é: ");
		System.out.println(d.width + "X" + d.height);
		
		
		
		
	}
}
