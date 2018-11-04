package Main.tShirt;

public enum tShirtSize {

    S(48, 71, 36),
    M(52, 74, 38),
    L(56, 76, 41),
    XL(61, 79, 41);

    private int chestWidth;
    private int shirtLength;
    private int sleeveLength;

    tShirtSize(int chestWidth, int shirtLength, int sleeveLength) {
        this.chestWidth = chestWidth;
        this.shirtLength = shirtLength;
        this.sleeveLength = sleeveLength;
    }

    public int getChestWidth() {
        return chestWidth;
    }

    public int getShirtLength() {
        return shirtLength;
    }

    public int getSleeveLength() {
        return sleeveLength;
    }
}
