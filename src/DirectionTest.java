public class DirectionTest {
    public static void main(String[] args) {
        Directionsa directions = new Directionsa(Directions.EAST);

        System.out.println("Kierunek to: " + directions.getKierunek() + " " + directions.getKierunek().getPl() +" "+directions.getKierunek().getSkrot());
    }
}
