
import java.util.Scanner;

public class AulaDeEstruturaExercisio1 {

	public static void main(String [] args) {
		
		int contador = 0, numerosMaioresQueMedia = 0, tam;
		double menorNumero = 0, somaDosNumeros = 0, mediaDosNumeros = 0;	
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da sua matriz: ");
		tam = leia.nextInt();
		
	
		int [] vet;
		vet = new int[tam];
	
		
		for (int i = 0; i < vet.length; i++) {	
		System.out.println("Digite um n�mero: ");
		vet[i] = leia.nextInt();
		menorNumero = vet[i];
		somaDosNumeros += vet[i];
		contador++;
		
		}
		
		System.out.print("Seus n�meros s�o: ");
		for (int i = 0; i < vet.length; i++) {
		System.out.print(vet[i]+ " " );
		}
		
		System.out.print("\nOs n�meros pares s�o: ");
		for (int i = 0; i < vet.length; i++) {
		if(vet[i]%2==0) {
			
		System.out.print(vet[i]+ " " );
		}
		}
				
		System.out.print("\nO menor n�mero digitado �: ");
		for (int i = 0; i < vet.length; i++) {
			if(vet[i]< menorNumero) {
				menorNumero = vet[i];
				
		System.out.print(menorNumero);		
		}
		}
		
		mediaDosNumeros = somaDosNumeros/contador;
		
		for (int i = 0; i < vet.length; i++) {
		 if(vet[i]>mediaDosNumeros) {
			 
			 numerosMaioresQueMedia++;
		}
		}
		System.out.print("\n" + numerosMaioresQueMedia + " desses n�meros s�o maiores que m�dia deles.");
		System.out.print("\nM�dia dos n�meros �: " +mediaDosNumeros);
	
		leia.close();
	}
}
