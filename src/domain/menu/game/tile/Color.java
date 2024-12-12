package domain.menu.game.tile;

public enum Color {
    BLACK("■"),
    WHITE("□");

    private String icon;

    Color(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
