package domain.menu.game.tile;

public class Tile implements Comparable<Tile>{
    private Color color;
    private Integer number;

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
        int numberComparison = number.compareTo(another.number);
        if (numberComparison != 0) { // compareTo에서 반환값 0은 동등을 의미.
            return numberComparison;
        }
        // 숫자가 같으면 color 비교
        return color.compareTo(another.color);
    }

    @Override
    public String toString() {
        return color.getIcon() + "(" + number + ")";
    }
}
