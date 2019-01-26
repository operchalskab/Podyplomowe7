public enum Directions {
    NORTH ("N", "Północ", "North"),
    NORTHWEST ("NW", "PółnocnyZachód", "NorthWest"),
    NORTHEAST ("NE", "PółnocnyWschód", "NorthEast"),
    SOUTH ("S", "Południe", "South"),
    SOUTHWEST("SW", "PołudniowyZachód", "SouthWest"),
    SOUTHEAST ("SE", "PołudniowyWschód", "SouthEast"),
    EAST ("E", "Wschód", "East"),
    WEST ("W", "Zachód", "West");

    private String skrot;
    private String pl;
    private String en;

    Directions(String skrot, String pl, String en) {
        this.skrot = skrot;
        this.pl = pl;
        this.en = en;
    }

    public String getSkrot() {
        return skrot;
    }

    public String getPl() {
        return pl;
    }

    public String getEn() {
        return en;
    }
}
