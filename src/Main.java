import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema bancário!");

        while (true) {
            System.out.println("----- Bem-vindo ao sistema bancário! -----");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Realizar depósito");
            System.out.println("3. Realizar saque");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção:");

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ 1000,00");
                    break;
                case 2:
                    System.out.println("Digite o valor do depósito: ");
                    double deposito = scanner.nextDouble();
                    System.out.println("Depósito de R$" + deposito + " realizado com sucesso!");
                    break;
                case 3:
                    System.out.println("Digite o valor do saque: ");
                    double saque = scanner.nextDouble();
                    System.out.println("Saque de R$" + saque + " realizado com sucesso!");
                    break;
                case 4:
                    System.out.println("Saindo do sistema. Até logo!");
                    scanner.close();
                    return;
            }
        }
    }
}
