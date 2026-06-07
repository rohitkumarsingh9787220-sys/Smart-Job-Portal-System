import java.util.*;

class User {
    int id;
    String name;
    String email;
    String password;

    User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}

class Job {
    int id;
    String title;
    String company;
    String location;

    Job(int id, String title, String company, String location) {
        this.id = id;
        this.title = title;
        this.company = company;
        this.location = location;
    }
}

class JobApplication {
    int applicationId;
    String userEmail;
    int jobId;
    String status;

    JobApplication(int applicationId, String userEmail, int jobId, String status) {
        this.applicationId = applicationId;
        this.userEmail = userEmail;
        this.jobId = jobId;
        this.status = status;
    }
}

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Job> jobs = new ArrayList<>();
    static ArrayList<JobApplication> applications = new ArrayList<>();

    static int userId = 1;
    static int jobId = 101;
    static int applicationId = 1001;
    static User loggedInUser = null;

    public static void main(String[] args) {
        seedJobs();

        while (true) {
            System.out.println("\n===== SMART JOB PORTAL SYSTEM =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. View Jobs");
            System.out.println("4. Search Job");
            System.out.println("5. Apply for Job");
            System.out.println("6. View My Applications");
            System.out.println("7. Admin Add Job");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    loginUser();
                    break;
                case 3:
                    viewJobs();
                    break;
                case 4:
                    searchJob();
                    break;
                case 5:
                    applyJob();
                    break;
                case 6:
                    viewMyApplications();
                    break;
                case 7:
                    adminAddJob();
                    break;
                case 8:
                    System.out.println("Thank you for using Smart Job Portal System!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    static void seedJobs() {
        jobs.add(new Job(jobId++, "Java Developer", "TCS", "Bangalore"));
        jobs.add(new Job(jobId++, "Software Engineer Trainee", "Infosys", "Pune"));
        jobs.add(new Job(jobId++, "Backend Developer", "Wipro", "Hyderabad"));
    }

    static void registerUser() {
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        users.add(new User(userId++, name, email, password));
        System.out.println("Registration successful!");
    }

    static void loginUser() {
        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        for (User user : users) {
            if (user.email.equals(email) && user.password.equals(password)) {
                loggedInUser = user;
                System.out.println("Login successful. Welcome, " + user.name + "!");
                return;
            }
        }

        System.out.println("Invalid email or password.");
    }

    static void viewJobs() {
        System.out.println("\n===== AVAILABLE JOBS =====");

        if (jobs.isEmpty()) {
            System.out.println("No jobs available.");
            return;
        }

        for (Job job : jobs) {
            System.out.println("Job ID: " + job.id);
            System.out.println("Title: " + job.title);
            System.out.println("Company: " + job.company);
            System.out.println("Location: " + job.location);
            System.out.println("-------------------------");
        }
    }

    static void searchJob() {
        System.out.print("Enter keyword to search: ");
        String keyword = sc.nextLine().toLowerCase();

        boolean found = false;

        for (Job job : jobs) {
            if (job.title.toLowerCase().contains(keyword)
                    || job.company.toLowerCase().contains(keyword)
                    || job.location.toLowerCase().contains(keyword)) {

                System.out.println("Job ID: " + job.id);
                System.out.println("Title: " + job.title);
                System.out.println("Company: " + job.company);
                System.out.println("Location: " + job.location);
                System.out.println("-------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching jobs found.");
        }
    }

    static void applyJob() {
        if (loggedInUser == null) {
            System.out.println("Please login first to apply for a job.");
            return;
        }

        viewJobs();

        System.out.print("Enter Job ID to apply: ");
        int selectedJobId = sc.nextInt();
        sc.nextLine();

        for (Job job : jobs) {
            if (job.id == selectedJobId) {
                applications.add(new JobApplication(applicationId++, loggedInUser.email, selectedJobId, "Pending"));
                System.out.println("Application submitted successfully!");
                return;
            }
        }

        System.out.println("Invalid Job ID.");
    }

    static void viewMyApplications() {
        if (loggedInUser == null) {
            System.out.println("Please login first.");
            return;
        }

        boolean found = false;

        System.out.println("\n===== MY APPLICATIONS =====");

        for (JobApplication app : applications) {
            if (app.userEmail.equals(loggedInUser.email)) {
                System.out.println("Application ID: " + app.applicationId);
                System.out.println("Job ID: " + app.jobId);
                System.out.println("Status: " + app.status);
                System.out.println("-------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No applications found.");
        }
    }

    static void adminAddJob() {
        System.out.print("Enter admin password: ");
        String adminPassword = sc.nextLine();

        if (!adminPassword.equals("admin123")) {
            System.out.println("Invalid admin password.");
            return;
        }

        System.out.print("Enter job title: ");
        String title = sc.nextLine();

        System.out.print("Enter company name: ");
        String company = sc.nextLine();

        System.out.print("Enter location: ");
        String location = sc.nextLine();

        jobs.add(new Job(jobId++, title, company, location));
        System.out.println("Job added successfully by admin.");
    }
}
