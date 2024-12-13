package domain.menu.recode;

import domain.menu.Menu;

public class GameRecodeService implements Menu {

    private GameRecordRepository repository;

    @Override
    public void start() {
        System.out.println("기록 조회 시작");
    }

    // todo: 필드 및 메서드
}
