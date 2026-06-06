import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== SMART JOB PORTAL ===");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. View Jobs");

        int choice = sc.nextInt();

        System.out.println("You selected: " + choice);
    }
}
