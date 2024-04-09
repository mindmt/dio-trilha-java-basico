import java.util.Scanner;
import java.util.Locale; 

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US); // Utilize o Locale.US para forçar o uso do ponto como separador decimal

        System.out.println("Por favor, digite o número da Agência");
        int agencia = sc.nextInt();

        sc.nextLine();

        System.out.println("Por favor, digite o número da conta");
        String numero = sc.nextLine();

        System.out.println("Por favor, digite seu nome");
        String nome = sc.nextLine();

        System.out.println("Por favor, insira seu saldo");
        double saldo = sc.nextDouble();

        sc.close();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}