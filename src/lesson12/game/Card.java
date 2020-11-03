package lesson12.game;

public class Card {
    private String fullName;
    private int value;

    public Card() {
    }

    public Card(String fullName, int value) {
        this.fullName = fullName;
        this.value = value;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.fullName;
    }
}
