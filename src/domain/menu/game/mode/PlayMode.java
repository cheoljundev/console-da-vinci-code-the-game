package domain.menu.game.mode;

import domain.menu.Menu;

public interface PlayMode extends Menu {
    void start();
    void setVictoryRule();
}
