import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 240.67;

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite sua Agencia");
        String agencia = scanner.next();

        System.out.println("Digite seu número");
        int numero = scanner.nextInt();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");


        
    }
}
