package CursoEmVideoAulas;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Dimen��oDaTela {
	public static void main(String [] args) {
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		
		System.out.println("Sua dimen��o de tela �: ");
		System.out.println(d.width + "X" + d.height);
		
		
		
		
	}
}
