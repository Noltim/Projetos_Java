import java.util.Scanner;

public class Exerci4Aposentadoria {
	
	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
		Integer idadePessoa;
		Integer tempoDeContribuicao;
		final Integer idadeMinimaAposentar = 55;
		final Integer tempoMinimoAposentar = 25;
		
		
		System.out.println("Digite a idade: ");
		idadePessoa = lerTeclado.nextInt();
		
		System.out.println("Tempo de contribuição: ");
		tempoDeContribuicao = lerTeclado.nextInt();
		
		if(idadePessoa >= idadeMinimaAposentar && tempoDeContribuicao >= tempoMinimoAposentar) {
			System.out.println("Aposentadoria liberada");
		}else {
			System.out.println("Aposentadoria não liberada");
		}
		
		lerTeclado.close();
	}
}
