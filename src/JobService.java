public class JobService {

    public void viewJobs() {

        System.out.println("1. IBM - Associate System Engineer");
        System.out.println("2. Microland - Associate Engineer");
        System.out.println("3. HCLTech - Graduate Engineer Trainee");

    }

    public void searchJobs(String skill) {
        System.out.println("Searching jobs for: " + skill);
    }

    public void applyJob(int jobId) {
        System.out.println("Applied for Job ID: " + jobId);
    }
}
