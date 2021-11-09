package proxy;

public class GameServiceProxy implements GameService {
    private GameService gameService;

    public GameServiceProxy(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void startGame() {
        if(this.gameService == null) {
            this.gameService = new LoLGameService();
        }
        long before = System.currentTimeMillis();
        gameService.startGame();
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
}
