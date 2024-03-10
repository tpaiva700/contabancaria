package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.util.Cores;
import conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {

		ContaController contas = new ContaController();

		// Instanciando um Objeto
		// Teste ContaCorrente
		ContaCorrente contaC2 = new ContaCorrente(contas.gerarNumero(), 0123, 1, "Izuku Midoriya", 1300.0f, 900.0f);
		contas.cadastrar(contaC2);
		
		ContaCorrente contaC3 = new ContaCorrente(contas.gerarNumero(), 0123, 1, "Shigaraki Tomura", 1200.0f, 800.0f);
		contas.cadastrar(contaC3);
		
		// Teste ContaPoupanca
		ContaPoupanca contaP1 = new ContaPoupanca(contas.gerarNumero(), 0123, 1, "Haruno Sakura", 3000.0f, 25);
		contas.cadastrar(contaP1);
		
		ContaPoupanca contaP2 = new ContaPoupanca(contas.gerarNumero(), 0123, 1, "Todoroki Shoto", 1500.0f, 13);
		contas.cadastrar(contaP2);
		
		/*ContaPoupanca contaP = new ContaPoupanca(123458, 0123, 2, "Ochaco Uraraka", 1300.0f, 18);
		contaP.visualizar();
		contaP.sacar(1000.0f);
		contaP.visualizar();
		contaP.depositar(5000.0f);
		contaP.visualizar();

		System.out.println("************************************************************"); */

		Scanner sc = new Scanner(System.in);

		// Criando nosso menu principal
		int opcao, numero, agencia, tipo, aniversario;
		String titular;
		float saldo, limite;

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

			// Try..catch
			try {
				opcao = sc.nextInt();
			} catch (InputMismatchException error) {
				System.out.println("\nDigite valores inteiros!!");
				sc.nextLine();
				opcao = 0;
			}

			if (opcao == 9) {
				System.out.println(Cores.TEXT_CYAN_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui! ");
				// Método sem retorno
				sobre();
				sc.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Criar conta \n\n");

				System.out.println("Digite o número da Agência: ");
				agencia = sc.nextInt();
				System.out.println("Digite o nome do Titular: ");
				// limpar o scanner
				sc.skip("\\R?");
				titular = sc.nextLine();

				do {
					System.out.println("Digite o Tipo de Conta (1-CC ou 2-CP): ");
					tipo = sc.nextInt();
				} while (tipo < 1 && tipo > 2);

				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo = sc.nextFloat();

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito (R$): ");
					limite = sc.nextFloat();
					contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversário da Conta: ");
					aniversario = sc.nextInt();
					contas.cadastrar(
							new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
				}
				}

				keyPress();
				break;

			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");
				contas.listarTodas();
				keyPress();
				break;

			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");
				keyPress();
				break;

			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");
				keyPress();
				break;

			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");
				keyPress();
				break;

			case 6:
				System.out.println(Cores.TEXT_WHITE + "Saque\n\n");
				keyPress();
				break;

			case 7:
				System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");
				keyPress();
				break;

			case 8:
				System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");
				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
				keyPress();
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

	public static void keyPress() {
		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException error) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
