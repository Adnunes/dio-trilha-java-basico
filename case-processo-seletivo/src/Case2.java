import java.util.concurrent.ThreadLocalRandom;

public class Case2 {
    public static void main(String[] args) {
        String[] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        String[] candidatosSelecionados = new String[5];
        int j=0;
       
        //laço de repetição para gerar um valor pretendido e salvar em uma lista caso o valor seja maior ou igual a 2.000 e que não ultrapasse o tamanho do Array para os selecionados
        for(int i=0; i<candidatos.length;i++){
            Double salarioPretendido = valorPretendido();
           
            if(salarioPretendido<=2000 && j<5)
                candidatosSelecionados[j] = candidatos[i];
                j++;

        }

        //laço de repetição para imprimir os candidatos selecionados. O programa irá imprimir somente os espaços no array que estejam preenchidos com algum candidato, ou seja, diferente de null
        System.out.println("Candidados Selecionados");
        for(int i=0; i < candidatosSelecionados.length; i++){
            if (candidatosSelecionados[i]!= null)
                System.out.println(candidatosSelecionados[i]);

        }
            

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);

    }   

}
