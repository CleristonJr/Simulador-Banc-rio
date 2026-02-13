import java.util.Scanner;
import java.util.Random;

public class Main {
    private static Banco banco = new Banco();
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        boolean rodando = true;

        System.out.println("Sistema Bancário Iniciado");

        while (rodando) {
            System.out.println("\n1. Criar Conta | 2. Saldo | 3. Depósito | 4. Saque | 5. Transferir | 6. Listar | 0. Sair");
            System.out.print("Opção: ");

            int opcao = -1;
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                continue;
            }

            switch (opcao) {
                case 1:
                    criarConta();
                    break;
                case 2:
                    consultarSaldo();
                    break;
                case 3:
                    realizarDeposito();
                    break;
                case 4:
                    realizarSaque();
                    break;
                case 5:
                    realizarTransferencia();
                    break;
                case 6:
                    listarContas();
                    break;
                case 0:
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void criarConta() {
        System.out.print("Nome do titular: ");
        String nome = scanner.nextLine();
        int numero = 1000 + random.nextInt(9000);
        Conta novaConta = new Conta(numero, nome);
        banco.adicionarConta(novaConta);
        System.out.println("Conta criada: " + numero);
    }

    private static void consultarSaldo() {
        System.out.print("Número da conta: ");
        int numero = Integer.parseInt(scanner.nextLine());
        Conta conta = banco.buscarConta(numero);
        if (conta != null) {
            System.out.println(conta);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static void realizarDeposito() {
        System.out.print("Número da conta: ");
        int numero = Integer.parseInt(scanner.nextLine());
        Conta conta = banco.buscarConta(numero);
        if (conta != null) {
            System.out.print("Valor: ");
            double valor = Double.parseDouble(scanner.nextLine());
            conta.depositar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static void realizarSaque() {
        System.out.print("Número da conta: ");
        int numero = Integer.parseInt(scanner.nextLine());
        Conta conta = banco.buscarConta(numero);
        if (conta != null) {
            System.out.print("Valor: ");
            double valor = Double.parseDouble(scanner.nextLine());
            conta.sacar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static void realizarTransferencia() {
        System.out.print("Conta Origem: ");
        int numOrigem = Integer.parseInt(scanner.nextLine());
        Conta origem = banco.buscarConta(numOrigem);

        if (origem != null) {
            System.out.print("Conta Destino: ");
            int numDestino = Integer.parseInt(scanner.nextLine());
            Conta destino = banco.buscarConta(numDestino);

            if (destino != null && numOrigem != numDestino) {
                System.out.print("Valor: ");
                double valor = Double.parseDouble(scanner.nextLine());
                origem.transferir(destino, valor);
            } else {
                System.out.println("Destino inválido.");
            }
        } else {
            System.out.println("Origem não encontrada.");
        }
    }

    private static void listarContas() {
        if (banco.getContas().isEmpty()) {
            System.out.println("Nenhuma conta registrada.");
        } else {
            for (Conta c : banco.getContas()) {
                System.out.println(c);
            }
        }
    }
}
