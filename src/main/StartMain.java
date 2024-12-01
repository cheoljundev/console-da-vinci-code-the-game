package main;

import client.GameClient;
import controller.GameController;

public class StartMain {
    public static void main(String[] args) {
        GameClient client = new GameClient();
        GameController controller = new GameController(client);
        controller.start();
    }
}
