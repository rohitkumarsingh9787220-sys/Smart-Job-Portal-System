import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UserService userService = new UserService();
        JobService jobService = new JobService();
        AdminService adminService = new AdminService();

        System.out.println("=== SMART JOB PORTAL SYSTEM ===");
        System.out.println("1. Register User");
        System.out.println("2. Login User");
        System.out.println("3. View Jobs");
        System.out.println("4. Search Jobs");
        System.out.println("5. Apply Job");
        System.out.println("6. Add Job (Admin)");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                userService.registerUser(
                        "Rohit Kumar",
                        "rohit@gmail.com",
                        "12345");
                break;

            case 2:
                userService.loginUser("rohit@gmail.com");
                break;

            case 3:
                jobService.viewJobs();
                break;

            case 4:
                jobService.searchJobs("Java");
                break;

            case 5:
                jobService.applyJob(101);
                break;

            case 6:
                adminService.addJob();
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
