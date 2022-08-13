import java.util.Scanner;

public class Exerc18 {

	public static void main(String[] args) {
		double tamanhoArquivo;
		double velocidadeInternet;
		double tempoDownload;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do arquivo em MB: ");
		tamanhoArquivo = leia.nextDouble();
		
		System.out.println("Digite a velocidade da internet em megas: ");
		velocidadeInternet = leia.nextDouble();
		
		tempoDownload = (tamanhoArquivo / (velocidadeInternet/8))/60;
		
		System.out.println("O tempo de download é: "+tempoDownload+" minutos.");
		}
}
