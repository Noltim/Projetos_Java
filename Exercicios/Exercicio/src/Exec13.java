import java.util.Scanner;

public class Exec13 {

	public static void main(String[] args) {
		double altura;
		double pesoIdeal;
		String sexo;
		final double constanteH = 72.7;
		final double constanteM = 62.1;
		final int constanteHH = 58;
		final double constanteMM = 44.7;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite sua altura: ");
		altura = leia.nextDouble();
		leia.nextLine();
		
		System.out.println("Digite seu sexo(H ou M): ");
		sexo = leia.nextLine();
				
		if((sexo.equals("m") || sexo.equals("M"))) {
			pesoIdeal = ((constanteM*altura)-constanteMM);
			System.out.println("Peso ideal é: "+pesoIdeal+"KG");
		}else {
			pesoIdeal = ((constanteH*altura)-constanteHH);
		System.out.println("Peso ideal é: "+pesoIdeal+"KG");
			
		}
		leia.close();
	}
}
