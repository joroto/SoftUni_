package Cards_With_Power;

public enum Card_Suits{
    CLUBS (0),
    DIAMONDS (13),
    HEARTS (26),
    SPADES (39);
    private int suitPower;

    Card_Suits(int i) {
        this.suitPower = i;
    }

    public int getSuitPower() {
        return this.suitPower;
    }

}
