import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainCases {
    

    public static void main(String[] args) {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        System.out.println("*********CASE UM*********");
        case1(candidatos);
        
        System.out.println("*********CASE DOIS E TRÊS*********");
        case2(candidatos);

        
        


        
    }
    
    static void case1(String [] candidatos){
          

        for (int i=0; i<candidatos.length;i++) {
            if (valorPretendido() > 2000)
                System.out.println("Ligar para o Candidato");
                
            
            else if (valorPretendido() == 200)
                System.out.println("Ligar para o candidato, com contra proposta");
            
            else 
                System.out.println("Aguardando resultado dos demais candidatos");    
        }

    }

    static void case2(String [] candidatos){
        String[] candidatosSelecionados = new String[5];
        Double [] salariosPretendidos = new Double[5];
        int j=0;
               
        for(int i=0; i<candidatos.length;i++){
            Double salarioPretendido = valorPretendido();
                                   
            if(salarioPretendido<=2000 && j<5){
                salariosPretendidos[j] = salarioPretendido;
                candidatosSelecionados[j] = candidatos[i];
                
                j++;
                       
            }
            
                 
        }    
        case3(candidatosSelecionados, salariosPretendidos);
        case4(candidatosSelecionados);

    }

    static void case3(String [] candidatosSelecionados, Double [] salariosPretendidos){
        for(int i=0; i<candidatosSelecionados.length;i++){
            System.out.println(candidatosSelecionados[i] + " " + salariosPretendidos[i]);
        }

    }

    static void case4(String [] candidatosSelecionados){
        int tentativas=1;
        boolean validacao = valorLogico();
        System.out.println("*********CASE QUATRO*********");
        for (int i = 0; i<candidatosSelecionados.length;i++){
            
          if(candidatosSelecionados[i] != null){
                while (validacao==false && tentativas<4){
                    tentativas++;
                    validacao = valorLogico();
               
                
                 }
                if (tentativas==5){
                    System.out.println("Não conseguimos contato com o " + candidatosSelecionados[i]);
                    tentativas=1;
                    validacao = valorLogico();
                }

                else if (tentativas == 1){
                    System.out.println("Conseguimos contato com o " + candidatosSelecionados[i] + " após " + tentativas + " tentativas.");
                    tentativas=1;
                    validacao = valorLogico();
                }
                else{
                    System.out.println("Conseguimos contato com o " + candidatosSelecionados[i] + " após " + (tentativas-1) + " tentativas.");
                   tentativas=1;
                   validacao = valorLogico();
                }
            }
        
        }

        

    }


  

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }   

    static boolean valorLogico(){
        return new Random().nextInt(3)==1;
    }

}
