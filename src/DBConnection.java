public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/jobportal";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";

    public static void connect() {

        System.out.println("Connecting to Database...");
        System.out.println("URL: " + URL);
        System.out.println("Database Connected Successfully");
    }
}
