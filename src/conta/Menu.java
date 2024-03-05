package conta;

import java.util.Scanner;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Criando nosso menu principal
		int opcao;

		// Iniciamos nosso while com True, para que o loop seja infinito, até o user
		// digitar a opção de SAIR
		while (true) {
			System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = sc.nextInt();

			if (opcao == 9) {
				System.out.println(Cores.TEXT_CYAN_BOLD +"\nBanco do Brazil com Z - O seu Futuro começa aqui! ");
				// Método sem retorno
				sobre();
				sc.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE +"Criar conta \n\n");

				break;

			case 2:
				System.out.println(Cores.TEXT_WHITE +"Listar todas as Contas\n\n");

				break;

			case 3:
				System.out.println(Cores.TEXT_WHITE +"Consultar dados da Conta - por número\n\n");

				break;

			case 4:
				System.out.println(Cores.TEXT_WHITE +"Atualizar dados da Conta\n\n");

				break;

			case 5:
				System.out.println(Cores.TEXT_WHITE +"Apagar a Conta\n\n");

				break;

			case 6:
				System.out.println(Cores.TEXT_WHITE +"Saque\n\n");

				break;

			case 7:
				System.out.println(Cores.TEXT_WHITE +"Depósito\n\n");

				break;

			case 8:
				System.out.println(Cores.TEXT_WHITE +"Transferência entre Contas\n\n");

				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD +"\nOpção Inválida!\n");

				break;
			}

		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por:                               *");
		System.out.println("Thaís Paiva                                             *");
		System.out.println("github.com/tpaiva700/contabancaria                      *");
		System.out.println("*********************************************************");
	}
}
