import java.util.Random;
import java.util.Scanner;

public class Lista2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		System.out.println("Questão 01: Faça um Programa que peça dois números e "
				+ "imprima o maior deles. ");
		System.out.println("Primeiro numero: ");
		int v1q1 = sc.nextInt();
		System.out.println("Segundo numero: ");
		int v2q1 = sc.nextInt();
		if(v1q1 > v2q1) 
			System.out.println(v1q1);
		else 
			System.out.println(v2q1);
		
		
		System.out.println();
		
		System.out.println("Questão 02- Faça um Programa que peça um valor e mostre na "
				+ "tela se o valor é positivo ou negativo.\r\n"	);
		
		System.out.println("Digite um valor: ");
		
		int v1q2 = sc.nextInt();
		if(v1q2 > 0) 
			System.out.println("Positivo");
		else if(v1q2 < 0) 
			System.out.println("Negativo");
		else 
			System.out.println("Valor 0");

		System.out.println();
		System.out.println("Questão 3- Faça um Programa que verifique "
				+ "se uma letra digitada é \"F\" ou \"M\". "
				+ "Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.");
		System.out.println("Digite uma letra: ");
		sc.nextLine();
		String lq3 = sc.nextLine();
		if(lq3.equals("M") || lq3.equals("m")) 
			System.out.println("Masculino");
		else if(lq3.equals("F") || lq3.equals("f")) 
			System.out.println("Feminino");
		else 
			System.out.println("Sexo Inválido");

		System.out.println();
		System.out.println("Questão 4- Faça um Programa que verifique se uma letra digitada é vogal ou consoante.");
		System.out.println("Digite uma letra: ");
		String lq4 = sc.nextLine();
		if(lq4.equals("a") || lq4.equals("e") || lq4.equals("i")|| lq4.equals("o") || lq4.equals("u"))
			System.out.println("Vogal");
		else if(lq4.equals("A") || lq4.equals("E") || lq4.equals("I")|| lq4.equals("O") || lq4.equals("U"))
			System.out.println("Vogal");
		else
			System.out.println("Consoante");

		System.out.println("Questão 5- Faça um programa para a leitura de duas notas parciais de um aluno. "
				+ "O programa deve calcular a média alcançada por aluno e apresentar:\r\n"
				+ "	A mensagem \"Aprovado\", se a média alcançada for maior ou igual a sete;\r\n"
				+ "	A mensagem \"Reprovado\", se a média for menor do que sete;\r\n"
				+ "	A mensagem \"Aprovado com Distinção\", se a média for igual a dez.");
		
		
		System.out.println("Primeira Nota: ");
		double v1q5 = sc.nextInt();
		System.out.println("Segunda Nota: ");
		double v2q5 = sc.nextInt();
		double mediaq5=(v1q5 + v2q5) /2;
		if(mediaq5 == 10) 
			System.out.println("Aprovado com Distinção");
		else if(mediaq5 < 10 && mediaq5 >= 7) 
			System.out.println("Aprovado");
		else
			System.out.println("Reprovado");
		

		System.out.println("Questão 6 e 7 e 9 - "
				+ "Faça um Programa que leia três números e mostre o maior deles.\r\n"
				+ "Faça um Programa que leia três números e mostre o maior e o menor deles."
				+ "Faça um Programa que leia três números e mostre-os em ordem decrescente.");
		
		System.out.println();
		int vetorq6q7q9[] = new int[3];
		
		int maiorq6q7q9 = vetorq6q7q9[0];
		int menorq6q7q9 =99999*1000;
		
		for(int i=0; i < vetorq6q7q9.length; i++) {
			System.out.println("Digite um Numero: ");
			vetorq6q7q9[i] = sc.nextInt();
			
			if(menorq6q7q9 > vetorq6q7q9[i])
				menorq6q7q9 = vetorq6q7q9[i];
			if(vetorq6q7q9[i] > maiorq6q7q9)
				maiorq6q7q9=vetorq6q7q9[i];
		}
		for (int i = 1; i < vetorq6q7q9.length; i++) {
		    for (int j = 0; j < i; j++) {
		        if (vetorq6q7q9[i] > vetorq6q7q9[j]) {
		            int temp = vetorq6q7q9[i];
		            vetorq6q7q9[i] = vetorq6q7q9[j];
		            vetorq6q7q9[j] = temp;
		        }
		    }
		}
		for(int i = 0; i < vetorq6q7q9.length; i++) {
			System.out.print(vetorq6q7q9[i]+" ");
		}
		System.out.println();
		System.out.println("Maior: "+maiorq6q7q9);
		System.out.println("Menor: "+menorq6q7q9);
	
		System.out.println("Questão 8 - Faça um programa que pergunte o preço de "
				+ "três produtos e informe qual produto você deve comprar, "
				+ "sabendo que a decisão é sempre pelo mais barato.");
		double vetorq8[] = new double[3];
		double menorq8 = 99999 * 100000;

		for (int i = 0; i < vetorq8.length; i++) {
			System.out.println("Digite o preço do " + i + 1 + "º produto: ");
			vetorq8[i] = sc.nextInt();

			if (menorq8 > vetorq8[i])
				menorq8 = vetorq8[i];
		}
		System.out.println("O menor Preço: "+menorq8);

		System.out.println("Questão 10 - Faça um Programa que pergunte em que turno você estuda. "
				+ "Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. "
				+ "Imprima a mensagem \"Bom Dia!\", \"Boa Tarde!\" ou \"Boa Noite!\" "
				+ "ou \"Valor Inválido!\", conforme o caso.");
		
		System.out.println(" Você estuda no periodo "
				+ "M-matutino "
				+ "ou V-Vespertino "
				+ "ou N- Noturno");
		String lq10 = sc.nextLine();
		if(lq10.equals("M"))
			System.out.println("Bom dia!!");
		else if(lq10.equals("V"))
			System.out.println("Boa tarde!!");
		else if(lq10.equals("N"))
			System.out.println("Boa Noite!!");
		else
			System.out.println("Valor inválido");
	}

}