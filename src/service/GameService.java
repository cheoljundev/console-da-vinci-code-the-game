package service;

import domain.user.User;

public class GameService {
    private final User user;
    private final GameClient client;

    public GameService(GameClient client) {
        this.client = client;
        user = client.getUser();
    }

    public void start() {
        client.start();
        System.out.println("GameService.start");
    }
}
