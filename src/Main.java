public class Main {
    public static void main(String[] args) {
      Gamer gamer1 = new Gamer("Farukcan");
      Gamer gamer2 = new Gamer("Batu");
        Arena game = new Arena(gamer1, gamer2);
        game.start();
    }
}