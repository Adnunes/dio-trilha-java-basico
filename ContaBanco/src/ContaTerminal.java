import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //declaração de variáveis 
      

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o número da sua conta: "); 
        int numero = scanner.nextInt();

        System.out.println("Digite o numero da sua agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o seu Saldo : ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado pro criar uma conta em nosso banco, sua agencia é " + agencia +", conta " + numero + " e seu saldo R$ " + saldo + " ja está disponível para saque.");

    }

}
