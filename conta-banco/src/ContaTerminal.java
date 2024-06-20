import java.util.Scanner;

public class ContaTerminal {
    // Declaração dos atributos

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e capturar número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        int agencia = scanner.nextInt();

        // Solicitar e capturar número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        String conta = scanner.next();

        scanner.nextLine(); 

        // Solicitar e capturar nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicitar e capturar saldo inicial
        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        // Fechar o scanner após a leitura dos dados
        scanner.close();

        // Exibir mensagem com os dados da conta
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }

    // Métodos getter e setter
}
