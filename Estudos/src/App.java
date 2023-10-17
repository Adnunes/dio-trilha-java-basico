public class App {
    public static void main(String[] args) throws Exception {
        int finalScore=0;
        System.out.println(finalScore);
        String[] games = {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"};

        for (int i=0; i<games.length;i++){
          String[] auxScores = games[i].split(":");
          int x = Integer.valueOf(auxScores[0]);
          int y = Integer.valueOf(auxScores[1]);
          
          if (x>y)
            finalScore=finalScore+3;
          
          else if (x==y)
            finalScore=finalScore+1;
          System.out.println(finalScore);
       
        }
       
    }



    
}
