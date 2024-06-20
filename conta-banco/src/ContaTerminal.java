import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        int agencia = scanner.nextInt();

        // Solicitar número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        String conta = scanner.next();

        scanner.nextLine(); 

        // Solicitar nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicitar saldo inicial
        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();
        
        scanner.close();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }

}
