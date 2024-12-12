package domain.menu.game.tile;

public class Tile implements Comparable<Tile>{
    private Color color;
    private int number;

    public Tile(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    public Color getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Tile another) {
        //todo : 비교 구현 필요. 숫자가 같으면 Black이 작은거임.
        return 0;
    }

    @Override
    public String toString() {
        return color.getIcon() + "(" + number + ")";
    }
}
