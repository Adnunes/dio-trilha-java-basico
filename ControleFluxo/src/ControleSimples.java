public class ControleSimples {
    public static void main(String[] args) throws Exception {
            double saldo = 25.00;
            double valorSolicitado = 17.0;

            if(valorSolicitado<saldo)
                saldo= saldo - valorSolicitado;
            
            System.out.println("Saldo: " + saldo);
    }
}
