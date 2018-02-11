public enum WindRose {
    NORTH("północ"),
    EAST("wschód"),
    SOUTH("południe"),
    WEST("zachód");

    private final String directionInPL;

    WindRose(String directionInPL) {
        this.directionInPL = directionInPL;
    }
    public String getDirectionInPL() {
        return directionInPL;
    }
}
