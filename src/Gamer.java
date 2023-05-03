import java.util.Scanner;

enum HandSign{
    ROCK,
    SCISSOR,
    PAPER
}

public class Gamer {
    static int numberOfDraws;
    static int numberOfTrials;
    int numberOfWins;
    String name;
    HandSign Sign;

    public Gamer(String name)
{
    this.name=name;
}

void move()
{
   if(Arena.isOver) return;
    System.out.println(this.name+"'s turn ");
    Scanner input = new Scanner(System.in);
    System.out.println("press q for quit, s for scissor, r for rock, p for paper");
    Boolean isInputInValid = false;
    do{
      String userChoice=input.nextLine();
      switch(userChoice){
          case "q":
            Arena.isOver=true;
          case "r":
            this.Sign=HandSign.ROCK;
            break;
          case "p":
            this.Sign=HandSign.PAPER;
            break;
          case "s":
            this.Sign=HandSign.SCISSOR;
            break;
          default:
              System.out.println("Wrong input type again ");
              isInputInValid=true;
      }
        System.out.println(this.name +"'s choice is "+ this.Sign);
    }while(isInputInValid);

}









}