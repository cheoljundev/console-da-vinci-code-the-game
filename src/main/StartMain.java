package main;

import client.GameClient;

public class StartMain {
    public static void main(String[] args) {
        GameClient client = new GameClient();
        client.start();
    }
}
