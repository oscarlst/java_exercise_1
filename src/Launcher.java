import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Bienvenue,\nVeuillez saisir du texte :");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while (!input.equals("quit")) {
            if (input.equals("fibo")) {
                System.out.println("Veuillez saisir la valeur de n :");
                input = scan.nextLine();
                System.out.println(fibonacci(Integer.parseInt(input)));
            } else {
                System.out.println("Unknown command");
            }
            input = scan.nextLine();
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