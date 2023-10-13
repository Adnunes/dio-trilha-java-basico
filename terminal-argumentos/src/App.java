import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //criando um objeto scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o seu nome: ");
        String nome  = scanner.next();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Insira a sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Ola " + nome + " voce tem " + idade +" anos e " + altura + " de altura.");
    }
}
