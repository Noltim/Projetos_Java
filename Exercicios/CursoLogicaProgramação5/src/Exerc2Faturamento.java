import java.util.Scanner;

public class Exerc2Faturamento {
	
	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
		Double metaDeFaturamentoAnual;
		Double faturamentoReal;
		Double mediaSalarialDoFuncionario;
		Double bonusParcialDe80;
		
		System.out.println("Meta de faturamento anual: ");
		metaDeFaturamentoAnual = lerTeclado.nextDouble();
		System.out.println("Faturamento real: ");
		faturamentoReal = lerTeclado.nextDouble();
		System.out.println("M�dia salarial dos funcion�rios: ");
		mediaSalarialDoFuncionario = lerTeclado.nextDouble();
		
		
		bonusParcialDe80 = mediaSalarialDoFuncionario * 80 / 100;
		
		if (faturamentoReal >= metaDeFaturamentoAnual) {
			System.out.println("Funcion�rio bateu a meta e recebera um bonus total de: "+mediaSalarialDoFuncionario);
		}else if (faturamentoReal < metaDeFaturamentoAnual && faturamentoReal >= metaDeFaturamentoAnual * 80 / 100) {
			System.out.println("Funcion�rio recebera 80% em bonus: "+bonusParcialDe80);
		}else {
			System.out.println("Funcion�rio n�o conseguiu bater a meta.");
		}
			
			
			
		lerTeclado.close();
	}
}
