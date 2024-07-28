import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual seu nome? ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Qual a sua agencia? ");
        String agencia = scanner.nextLine();

        System.out.println("Qual a sua conta? ");
        int numero = scanner.nextInt();

        System.out.println("Qual seu saldo? ");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
    }
}
