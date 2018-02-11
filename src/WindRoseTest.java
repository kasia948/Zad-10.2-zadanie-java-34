import java.util.Scanner;

public class WindRoseTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Gdzie idziemy?");
        WindRose direction = WindRose.valueOf(input.nextLine());
        System.out.println("Ok więc idziemy na "+direction.getDirectionInPL());
    }
}
