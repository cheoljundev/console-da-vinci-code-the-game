package main;

import client.GameClient;
import controller.GameController;

public class StartMain {
    public static void main(String[] args) {
        GameController controller = new GameController();
        controller.start();
    }
}
