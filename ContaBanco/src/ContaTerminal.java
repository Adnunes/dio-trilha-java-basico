/* <h1> Desafio Dio </h1>
 * <p>Nesse desafio foi proposto a criação de um sistema que simulasse o cadastro de uma conta bancária, aplicando tudo o que foi aprendido até aqui.</sp>
 * 
 * @author Andre Dias
 * @version 1.0
 * @since 13/10/2023
 */


import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        /*<p> Descrição das variaveis</p>
         * @param numero numero da conta bacária
         * @param agencia codigo da agencia
         * @param nomeCliente nome do cliente 
         * @param saldo saldo em conta do cliente 
         */
      

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
