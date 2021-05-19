import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Welcome everybody !!!");
        String inputUser = myObj.nextLine();

        if (inputUser.equals("quit")) {
            System.exit(0);
        } else {
            System.out.println("Unknown command");
        }

    }
}