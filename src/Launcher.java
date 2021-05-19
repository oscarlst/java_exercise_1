import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Welcome everybody !!!");
        String input = myObj.nextLine();

        while (!input.equals("quit")) {
            if (input.equals("fibo")) {
                System.out.println("Veuillez saisir la valeur de n :");
                input = myObj.nextLine();
                System.out.println(fibonacci(Integer.parseInt(input)));
            } else {
                System.out.println("Unknown command");
            }
            input = myObj.nextLine();
        }
    }

    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}