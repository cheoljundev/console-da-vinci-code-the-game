package controller;

import client.GameClient;
import domain.menu.Menu;
import domain.menu.game.Single;
import domain.user.PcUser;
import domain.user.User;

public class GameController {
    private final GameClient client;
    private User user;

    public GameController() {
        client = new GameClient();
    }

    public void start() {
        // 유저 생성
        String userName = client.getUserName();
        this.user = new PcUser(userName);

        // 메뉴 처리
        int menuNumber = client.selectMenu();
        Menu menu = createMenu(menuNumber);
        if (menu == null) {
            System.out.println("유효하지 않은 메뉴입니다. 프로그램을 종료합니다.");
            return;
        }
        menu.start();
    }

    private Menu createMenu(int menuNumber) {
        Menu menu = null;
        if (menuNumber == 1) {
            menu = new Single();
        }
        return menu;
    }
}
