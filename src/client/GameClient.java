package client;

import domain.user.PcUser;
import domain.user.User;

import java.util.Scanner;

public class GameClient {
    private User user;

    public GameClient() {
        Scanner input = new Scanner(System.in);
        System.out.print("유저 네임을 입력하세요 : ");
        this.user = new PcUser(input.nextLine());
    }

    public void start() {
        System.out.println("GameClient.start");
    }

    public User getUser() {
        return user;
    }
}
