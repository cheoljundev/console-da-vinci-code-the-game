package client;

import domain.menu.game.Single;
import domain.menu.Menu;
import domain.user.PcUser;
import domain.user.User;

import java.util.Scanner;

public class GameClient {
    private User user;
    Scanner input = new Scanner(System.in);

    public GameClient() {
        System.out.print("유저 네임을 입력하세요 : ");
        this.user = new PcUser(input.nextLine());
    }

    public void start() {
        Menu menu = selectMenu();
        menu.start();
    }

    private Menu selectMenu() {
        Menu menu = null;
        System.out.println("===메뉴를 선택하세요.===");
        System.out.println("1. 게임 시작");
        System.out.println("2. 기록 확인");
        System.out.print("메뉴 입력 : ");
        int selectedMenu = input.nextInt();
        if (selectedMenu == 1) {
            menu = new Single();
        }
        return menu;
    }

    public User getUser() {
        return user;
    }
}
