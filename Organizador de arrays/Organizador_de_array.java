import java.util.Scanner;

public class Organizador_de_array {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int escolha, retorno, traducao;
		String palavra;
		String[][] dicOrdenadoPT = null;
		String[][] dicOrdenadoENG = null;
		String[][] dic2 = { { "cachorro", "dog" }, { "gato", "cat" }, { "agua", "water" } };
		
		
		String[][] dic = { { "cachorro", "dog" }, { "gato", "cat" }, { "agua", "water" } };
		
		System.out.print("|-----------------------------|\n");
		System.out.println("| Matriz Desordenada: ");
		for (int i = 0; i < dic.length; i++) {
			for (int j = 0; j < dic.length; j++) {
				System.out.print("| " + dic[i][j] + " - " + dic[i][1]  );
				break;
			}
			System.out.println();
		}
		
		
		do {
			
			dic = dic2;
		
			System.out.print("|-----------------------------|\n");
			System.out.print("| Escolha uma das opções:     |\n");
			System.out.print("| Opção 1 - Ordenar por ENG   |\n");
			System.out.print("| Opção 2 - Ordenar por PT-BR |\n");
			System.out.print("| Opção 3 - Tradução          |\n");
			System.out.print("| Opção 4 - Sair              |\n");
			System.out.print("|-----------------------------|\n");
			escolha = leia.nextInt();
			
		

			switch (escolha) {

			case 1:
				
				Organizador_de_array.clearConsole();
				System.out.println("Matriz Desordenada: ");
				for (int i = 0; i < dic.length; i++) {
					for (int j = 0; j < dic.length; j++) {
						System.out.print(dic[i][j] + " - " + dic[i][1]);
						break;
					}
					System.out.println();
				}
	
					System.out.println("---------------------");

					bubbleSortUSA(dic);
					dicOrdenadoENG = dic;
					System.out.println("Matriz Ordenada: ");
					for (int i = 0; i < dicOrdenadoENG.length; i++) {
						for (int j = 0; j < dicOrdenadoENG.length; j++) {
							System.out.print(dicOrdenadoENG[i][j] + " - " + dicOrdenadoENG[i][1]);
							break;
						}
						System.out.println();
					}
					System.out.println("---------------------");

						

				break;

			case 2:
				
				Organizador_de_array.clearConsole();
				System.out.println("Matriz Desordenada: ");
				for (int i = 0; i < dic.length; i++) {
					for (int j = 0; j < dic.length; j++) {
						System.out.print(dic[i][j] + " - " + dic[i][1]);
						break;
					}
					System.out.println();
				}

				
					System.out.println("---------------------");

					bubbleSortPT(dic);
					dicOrdenadoPT = dic;
					System.out.println("Matriz Ordenada: ");
					for (int i = 0; i < dicOrdenadoPT.length; i++) {
						for (int j = 0; j < dicOrdenadoPT.length; j++) {
							System.out.print(dicOrdenadoPT[i][j] + " - " + dicOrdenadoPT[i][1]);
							break;
						}
						System.out.println();
					}
					System.out.println("---------------------");

					
				

				break;
				
			case 3:
				
				do {
				Organizador_de_array.clearConsole();
				System.out.print("|          Escolha uma das opções:         |\n");
				System.out.print("| Opção 1 - Deseja traduzir para inglês ?  |\n");
				System.out.print("| Opção 2 - Deseja traduzir para PT-BR ?   |\n");
				System.out.print("| Opção 3 - Sair                           |\n");
				System.out.print("|------------------------------------------|\n");
				
			
				traducao = leia.nextInt();
				if (traducao == 1) {
					do {
					bubbleSortUSA(dic);
					dicOrdenadoENG = dic;
					
					System.out.println("|--------------------------------------------|");
					System.out.println("| Digite a palavra que você deseja traduzir: |");
					System.out.println("| Sair - 1                                   |");
					System.out.println("|--------------------------------------------|");
					
					palavra = leia.next();

					retorno = busca_binENG(dicOrdenadoENG, palavra);
					if (retorno != -1)
						System.out.println("Tradução: " + dicOrdenadoENG[retorno][0]);
					else {
						Organizador_de_array.clearConsole();
						System.out.println("Não existe essa palavra no dicionário de inglês");
					}
						
						
					}while (palavra.equals("1") == false);
				} else if(traducao == 2){
					do {
					bubbleSortPT(dic);
					dicOrdenadoPT = dic;
						System.out.println("|--------------------------------------------|");
					    System.out.println("| Digite a palavra que você deseja traduzir: |");
						System.out.println("| Sair - 1                                   |");
						System.out.println("|--------------------------------------------|");
						palavra = leia.next();

						retorno = busca_binPT(dicOrdenadoPT, palavra);
						if (retorno != -1)
							System.out.println("Tradução: " + dicOrdenadoPT[retorno][1]);
						else {
							Organizador_de_array.clearConsole();
							System.out.println("Não existe essa palavra no dicionário de português");
						}
							
							
						}while (palavra.equals("1") == false);
			
				}else {
					Organizador_de_array.clearConsole();
					System.out.println("Desculpe! Não encontramos essa opção... tente novamente.");
				}
					
			
				}while (traducao != 3);
				

			default:
				Organizador_de_array.clearConsole();
				System.out.println("|                Obrigado!                 | ");
				System.out.print("|------------------------------------------|\n");
			}

		} while (escolha < 4);
		leia.close();

	}

	private static void bubbleSortPT(String[][] dic) {
		boolean troca = true;
		String aux;
		String aux2;
		while (troca) {
			troca = false;
			for (int i = 0; i < dic.length - 1; i++) {
				for (int j = 0; j < dic.length; j++) {
					if (dic[i + 1][0].compareToIgnoreCase(dic[i][0]) < 0) {
						aux = dic[i][0];
						dic[i][0] = dic[i + 1][0];
						dic[i + 1][0] = aux;

						aux2 = dic[i][1];
						dic[i][1] = dic[i + 1][1];
						dic[i + 1][1] = aux2;

						troca = true;

					}

				}

			}
		}
	}

	private static void bubbleSortUSA(String[][] dic) {
		boolean troca = true;
		String aux;
		String aux2;
		while (troca) {
			troca = false;
			for (int i = 0; i < dic.length - 1; i++) {
				for (int j = 0; j < dic.length; j++) {
					if (dic[i + 1][1].compareToIgnoreCase(dic[i][1]) < 0) {
						aux = dic[i][1];
						dic[i][1] = dic[i + 1][1];
						dic[i + 1][1] = aux;

						aux2 = dic[i][0];
						dic[i][0] = dic[i + 1][0];
						dic[i + 1][0] = aux2;

						troca = true;

					}

				}

			}
		}
	}

	public static int busca_binPT(String[][] dic, String palavra) {

		int ini = 0;
		int fim = dic.length - 1;

		while (ini <= fim) {
			int meio = (int) (ini + fim) / 2;
			if (palavra.compareTo(dic[meio][0]) < 0) {
				fim = meio - 1;
			} else if (palavra.compareTo(dic[meio][0]) > 0) {
				ini = meio + 1;
			} else {

				return meio;
			}
		}
		return -1;
	}

	public static int busca_binENG(String[][] dic, String palavra) {

		int ini = 0;
		int fim = dic.length - 1;

		while (ini <= fim) {
			int meio = (int) (ini + fim) / 2;
			if (palavra.compareTo(dic[meio][1]) < 0) {
				fim = meio - 1;
			} else if (palavra.compareTo(dic[meio][1]) > 0) {
				ini = meio + 1;
			} else {

				return meio;
			}
		}
		return -1;
	}

	public static void clearConsole() {
		for (int i = 0; i < 1050; ++i) {
			System.out.println();
		}
		
			System.out.print("|------------------------------------------|\n");
			
			
		}
	}


