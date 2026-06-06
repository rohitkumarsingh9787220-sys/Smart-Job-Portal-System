public class Application {

    private int applicationId;
    private int userId;
    private int jobId;
    private String status;

    public Application(int applicationId, int userId, int jobId, String status) {
        this.applicationId = applicationId;
        this.userId = userId;
        this.jobId = jobId;
        this.status = status;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public int getUserId() {
        return userId;
    }

    public int getJobId() {
        return jobId;
    }

    public String getStatus() {
        return status;
    }

    public void displayApplication() {
        System.out.println("Application ID: " + applicationId);
        System.out.println("User ID: " + userId);
        System.out.println("Job ID: " + jobId);
        System.out.println("Status: " + status);
    }
}
