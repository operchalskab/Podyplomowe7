public enum TshirtSize {
    S (48 , 71, 36),
    M (52, 74, 38),
    L (56, 76, 41),
    XL (61, 79, 41);


    private int chestwidth;
    private int shirtLength;
    private int sleeveLength;

    TshirtSize(int chestwidth, int shirtLength, int sleeveLength) {
        this.chestwidth = chestwidth;
        this.shirtLength = shirtLength;
        this.sleeveLength = sleeveLength;
    }

    public int getChestwidth() {
        return chestwidth;
    }

    public int getShirtLength() {
        return shirtLength;
    }

    public int getSleeveLength() {
        return sleeveLength;
    }
}
