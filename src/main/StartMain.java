package main;

import service.GameClient;
import service.GameService;

public class StartMain {
    public static void main(String[] args) {
        GameClient client = new GameClient();
        GameService service = new GameService(client);

        service.start();
    }
}
