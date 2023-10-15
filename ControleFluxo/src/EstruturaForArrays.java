public class EstruturaForArrays {
    public static void main(String[] args) {
        String alunos[] = {"Felipe", "João","Maria","Andre"};

        for(int i = 0; i<alunos.length;i++){
            System.out.println(alunos[i]);

        }
        
        //outra forma de escrever o mesmo laço de repetição

        for(String aluno : alunos){
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}
