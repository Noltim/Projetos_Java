import java.util.ArrayList;
import java.util.Scanner;

public class Urna {

	public static void main(String[] args) {
		ArrayList<CandidatoTeste> Candidatos = new ArrayList<CandidatoTeste>();
		Scanner leia = new Scanner(System.in);
		int escolha, escolhaCandidato, numero, consulta, contadorVoto = 0;
		String nome, partido;

		do {
			System.out.print("|-----------------------------|\n");
			System.out.print("| Escolha uma das opções:     |\n");
			System.out.print("| Opção 1 - Novo Cadastro     |\n");
			System.out.print("| Opção 2 - Consulta          |\n");
			System.out.print("| Opção 3 - Votar             |\n");
			System.out.print("| Opção 4 - Apuração de votos |\n");
			System.out.print("| Opção 5 - Sair              |\n");
			System.out.print("|-----------------------------|\n");
			escolha = leia.nextInt();

			switch (escolha) {
			case 1:
				System.out.print("|-----------------------------|\n");
				System.out.print("| Digite o número:            |\n");
				System.out.print("|-----------------------------|\n");
				numero = leia.nextInt();
				System.out.print("|-----------------------------|\n");
				System.out.print("| Digite o nome:              |\n");
				System.out.print("|-----------------------------|\n");
				leia.nextLine();
				nome = leia.nextLine();
				System.out.print("|-----------------------------|\n");
				System.out.print("| Digite o partido:           |\n");
				System.out.print("|-----------------------------|\n");
				partido = leia.nextLine();
				
				Candidatos.add(new CandidatoTeste(numero, nome, partido));
				Urna.clearConsole("Candidato cadastrado.");

				break;
			case 2:
				Urna.clearConsole("");
				do {

					System.out.print("|-----------------------------------|\n");
					System.out.print("| Escolha uma das opções:           |\n");
					System.out.print("| Opção 1 - Todos os candidatos     |\n");
					System.out.print("| Opção 2 - Apenas 1 candidato      |\n");
					System.out.print("| Opção 3 - Volta menu              |\n");
					System.out.print("|-----------------------------------|\n");
					escolhaCandidato = leia.nextInt();

					if (escolhaCandidato == 1) {
						Urna.clearConsole("");
						System.out.print("|-----------------------------------|\n");
						System.out.print("| Seus candidato são:               |\n");
						for (int i = 0; i < Candidatos.size(); i++) {
							System.out.println("| Nome: " + Candidatos.get(i).getNome() + ", Partido: "
									+ Candidatos.get(i).getPartido() + ", Votos: " + Candidatos.get(i).getVotos());

						}
						System.out.print("| Total de candidatos: " + Candidatos.size() + "\n");
						System.out.print("|-----------------------------------|\n");
					} else if (escolhaCandidato == 2) {
						Urna.clearConsole("");
						System.out.print("|-----------------------------------|\n");
						System.out.print("| Digite o número do candidato:     |\n");
						consulta = leia.nextInt();
						System.out.print("|-----------------------------------|\n");
						for (int i = 0; i < Candidatos.size(); i++) {
							if (Candidatos.get(i).getNumero() == consulta) {
								System.out.println("| Seu candidato é: ");
								System.out.println("| Nome: " + Candidatos.get(i).getNome() + ", Partido: "
										+ Candidatos.get(i).getPartido() + ", Votos: " + Candidatos.get(i).getVotos());
								System.out.print("|-----------------------------------|\n");
								break;
							}

						}

					}
				} while (escolhaCandidato != 3);

				Urna.clearConsole("Voltando ao menu principal.");
				break;
			case 3:
				System.out.print("|---------------------------------------------|\n");
				System.out.print("| Digite um número do candidato a ser votado: |\n");
				consulta = leia.nextInt();
				System.out.print("|---------------------------------------------|\n");
				int i;
				for (i = 0; i < Candidatos.size(); i++) {
					if (Candidatos.get(i).getNumero() == consulta) {
						break;
					}
				}
				if (i != Candidatos.size()) {
					Candidatos.get(i).Votar();
					contadorVoto++;
					System.out.print("|-------------------------------------------------------------------|\n");
					System.out.print("| Obrigado. Seu voto será a diferença que você quer fazer no mundo. |\n");
					System.out.print("|-------------------------------------------------------------------|\n");
				} else {
					System.out.print("|-------------------------------------|\n");
					System.out.print("| Candidato invalido!                 |\n");
					System.out.print("|-------------------------------------|\n");
				}
				break;
			case 4:
				Urna.clearConsole("");
				System.out.print("|------------------------------------------|\n");
				System.out.print("| Validando votos...                       |\n");
				System.out.print("| Votos validos:                           |\n");

				for (int j = 0; j < Candidatos.size(); j++) {
					System.out.println("| Nome: " + Candidatos.get(j).getNome() + ", Partido: "
							+ Candidatos.get(j).getPartido() + ", Votos: " + Candidatos.get(j).getVotos());
				}
				System.out.print("|------------------------------------------|\n");
				System.out.print("| Total de candidatos: " + Candidatos.size() + "\n");
				System.out.print("| Total de votos: " + contadorVoto + "\n");
				System.out.print("| Obrigado a todos que votaram.            |\n");
				System.out.print("|------------------------------------------|\n");
				escolha = 5;
				break;
			case 5:
				System.out.print("|---------------------------|\n");
				System.out.print("| Saindo...                 |\n");
				System.out.print("| Obrigado. Pela paciência. |\n");
				System.out.print("|---------------------------|\n");
				break;
			default:
				System.out.print("|-----------------------------------|\n");
				System.out.print("| Opção invalida! Tente novamente.  |\n");
				System.out.print("|-----------------------------------|\n");

			}

		} while (escolha != 5);

		leia.close();

	}

	public static void clearConsole(String mensagem) {
		for (int i = 0; i < 1050; ++i) {
			System.out.println();
		}
		if (mensagem.length() > 0) {
			System.out.print("|---------------------------------------------------|\n");
			System.out.print("| " + mensagem + "\n");
			System.out.print("|---------------------------------------------------|\n\n");
		}
	}
}
