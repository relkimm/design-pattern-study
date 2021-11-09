package proxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        GameService gameService = new GameServiceProxy(new LoLGameService());
        gameService.startGame();

        Client client = new Client();
        client.dynamicProxy();
    }

    private void dynamicProxy() {
        GameService gameService = this.getGameServiceProxy(new LoLGameService());
        gameService.startGame();
    }

    private GameService getGameServiceProxy(GameService target) {
        return (GameService) Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                new Class[]{GameService.class},
                (proxy, method, args) -> {
                    System.out.println("dynamic proxy start");
                    method.invoke(target, args);
                    System.out.println("dynamic proxy end");
                    return null;
                });
    }
}
