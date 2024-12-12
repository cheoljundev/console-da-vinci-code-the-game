package domain.menu.game.mode;

import domain.menu.Menu;

public class Single implements PlayMode, Menu {
    @Override
    public void start() {
        System.out.println("싱글 모드 시작");
    }

    @Override
    public void setVictoryRule() {
        System.out.println("승리 조건 세팅");
    }
}
