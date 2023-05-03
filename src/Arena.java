public class Arena {
    Gamer gamer1;
    Gamer gamer2;
    static boolean isOver;

    Arena(Gamer g1,Gamer g2){
         this.gamer1=g1;
         this.gamer2=g2;
    }

    void start(){
      while(!isOver){
        gamer1.move();
        gamer2.move();
        processMoves();
        displayScores(gamer1);
        displayScores(gamer2);
      }
    }

    void processMoves(){
        if (gamer1 == null || gamer2==null || isOver ==true) return;
        else if(gamer1.Sign == gamer2.Sign) Gamer.numberOfDraws++;
        else if(gamer1.Sign == HandSign.PAPER && gamer2.Sign == HandSign.ROCK)
            gamer1.numberOfWins++;
        else if(gamer1.Sign == HandSign.ROCK && gamer2.Sign == HandSign.SCISSOR)
            gamer1.numberOfWins++;
        else if(gamer1.Sign == HandSign.SCISSOR && gamer2.Sign == HandSign.PAPER)
            gamer1.numberOfWins++;
        else
            gamer2.numberOfWins++;

        Gamer.numberOfTrials++;

    }
    void displayScores(Gamer gamer){
        String data= String.format("name: %s number of wins: %d  number " +
                        "of draws: %d  number of trials %d", gamer.name, gamer.numberOfWins,
                Gamer.numberOfDraws, Gamer.numberOfTrials);
        System.out.println(data);
    }

}
