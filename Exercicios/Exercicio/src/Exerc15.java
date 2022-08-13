import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
		double valorHora;
		double horasTrabalhadasMes;
		double salarioMes;
		double ir;
		double inss;
		double sindicato;
		double salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o quanto você ganha por hora: ");
		valorHora = leia.nextDouble();
		System.out.println("Digite quantas horas você trabalha por mês: ");
		horasTrabalhadasMes = leia.nextDouble();
		
		salarioMes = valorHora * horasTrabalhadasMes;
		System.out.println("Salário bruto é: "+salarioMes);
		ir = ((salarioMes*11)/100);
		System.out.println("Vai pagar R$: "+ir+" a IR");
		inss = ((salarioMes*8)/100);
		System.out.println("Vai pagar R$: "+inss+" ao INSS");
		sindicato = ((salarioMes*5)/100);
		System.out.println("Vai pagar R$: "+sindicato+" ao Sindicato");
		salarioLiquido = (((salarioMes - ir)-inss)-sindicato); 
		System.out.println("Vai pagar R$: "+salarioLiquido+" ao Sindicato");
		
		leia.close();
	}
}
