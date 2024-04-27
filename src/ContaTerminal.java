import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public  static int numero;
    public static String agencia;
    public static String nomeCliente;
    public static double saldo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("digite numero da conta");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("digite a agencia");
        agencia = sc.nextLine();
        System.out.println("digite nome do cliente");
        nomeCliente = sc.nextLine();
        System.out.println("digite o saldo");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta" +
                " em nosso banco, sua agência é "+ agencia+ ", conta "+ numero+
                " e seu saldo " + saldo + " já está disponível para saque."
        );

    }
}