package proxy;

public class Client {
    public static void main(String[] args) {
        GameService gameService = new GameServiceProxy(new LoLGameService());
        gameService.startGame();
    }
}
