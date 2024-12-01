package client;

import java.util.Scanner;

public class GameClient {
    private final Scanner input = new Scanner(System.in);

    public String getUserName() {
        System.out.print("유저 네임을 입력하세요 : ");
        return input.nextLine();
    }

    public int selectMenu() {
        System.out.println("=== 메뉴를 선택하세요. ===");
        System.out.println("1. 게임 시작");
        System.out.println("2. 기록 확인");
        System.out.print("메뉴 입력 : ");
        return input.nextInt();
    }
}
