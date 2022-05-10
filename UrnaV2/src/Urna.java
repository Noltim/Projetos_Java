import java.util.ArrayList;
import java.util.Scanner;


public class Urna {

	public static void main(String[] args) {
		ArrayList<CandidatoTeste> Candidatos = new ArrayList<CandidatoTeste>();
		Scanner leia = new Scanner(System.in);
		int escolha, escolhaCandidato, numero, consulta, contadorVoto=0;
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
				System.out.println("Digite o número: ");
				numero = leia.nextInt();
				System.out.println("Digite o nome: ");
				leia.nextLine();
				nome = leia.nextLine();
				System.out.println("Digite o partido: ");
				partido = leia.nextLine();
				Candidatos.add(new CandidatoTeste(numero, nome, partido));
				break;
			case 2:
				do {
					System.out.print("|-----------------------------------|\n");
					System.out.print("| Escolha uma das opções:           |\n");
					System.out.print("| Opção 1 - Todos os candidatos     |\n");
					System.out.print("| Opção 2 - Apenas 1 candidato      |\n");
					System.out.print("| Opção 3 - Volta menu              |\n");
					System.out.print("|-----------------------------------|\n");
					escolhaCandidato = leia.nextInt();

					if (escolhaCandidato == 1) {
						System.out.println("Seus candidatos são: ");
						for (int i = 0; i < Candidatos.size(); i++) {
							System.out.println("Nome: " + Candidatos.get(i).getNome() + ", Partido: "
									+ Candidatos.get(i).getPartido() + ", Votos: " + Candidatos.get(i).getVotos());
						}
						System.out.println("Total de candidatos: " + Candidatos.size());
					} else if (escolhaCandidato == 2) {
						System.out.println("Digite o número do candidato");
						consulta = leia.nextInt();
						for (int i = 0; i < Candidatos.size(); i++) {
							if (Candidatos.get(i).getNumero() == consulta) {
								System.out.println("Seu candidato é: ");
								System.out.println("Nome: " + Candidatos.get(i).getNome() + ", Partido: "
										+ Candidatos.get(i).getPartido() + ", Votos: " + Candidatos.get(i).getVotos());
								break;
							}

						}
					}
				} while (escolhaCandidato != 3);
				System.out.println("Voltando ao menu principal.");
				break;
			case 3:
				System.out.println("Digite um número do candidato a ser votado.");
				consulta = leia.nextInt();
				int i = 0;
				for (; i < Candidatos.size(); i++) {
					if (Candidatos.get(i).getNumero() == consulta) {
						break;
					}
				}
				if (i != Candidatos.size()) {
					Candidatos.get(i).Votar();
				contadorVoto++;
					System.out.println("Obrigado. Seu voto será a diferença que você quer fazer no mundo.");
				} else {
					System.out.println("Candidato invalido!");
				}
				break;
			case 4:
				System.out.println("Validando votos...");
				System.out.println("Votos validos: ");
				for (int j = 0; j < Candidatos.size(); j++) {
					System.out.println("Nome: " + Candidatos.get(j).getNome() + ", Partido: "
							+ Candidatos.get(j).getPartido() + ", Votos: " + Candidatos.get(j).getVotos());
				}
				System.out.println("Total de candidatos: " + Candidatos.size());
				System.out.println("Total de votos: "+contadorVoto);
				System.out.println("Obrigado a todos que votaram.");
				escolha = 5;
				break;
			case 5:
				System.out.println("Saindo...");
				System.out.println("Obrigado. Pela paciência.");
				break;
			default:
				System.out.println("Opção invalida! Tente novamente.");

			}

		} while (escolha != 5);

		leia.close();

	}
}