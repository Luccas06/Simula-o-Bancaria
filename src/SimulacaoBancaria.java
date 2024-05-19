import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        while (true) {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Encerrar");
            System.out.print("Digite a opção desejada: ");

            int opcao;
            while (!scanner.hasNextInt()) {
                System.out.println("Opção inválida. Digite um número inteiro.");
                scanner.next(); // Limpa a entrada inválida
            }
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: // Depositar
                    System.out.print("Digite o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    if (valorDeposito > 0) {
                        saldo += valorDeposito;
                        System.out.println("Depósito realizado com sucesso! Saldo atualizado: " + saldo);
                    } else {
                        System.out.println("Valor inválido. O valor do depósito deve ser positivo.");
                    }
                    break;

                case 2: // Sacar
                    System.out.print("Digite o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque > 0 && saldo >= valorSaque) {
                        saldo -= valorSaque;
                        System.out.println("Saque realizado com sucesso! Saldo atualizado: " + saldo);
                    } else {
                        System.out.println("Saque não realizado. Saldo insuficiente ou valor inválido.");
                    }
                    break;

                case 3: // Consultar Saldo
                    System.out.println("Seu saldo atual é: " + saldo);
                    break;

                case 4: // Encerrar
                    System.out.println("Obrigado por usar nossos serviços!");
                    scanner.close(); // Fecha o Scanner
                    return; // Encerra o programa

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
