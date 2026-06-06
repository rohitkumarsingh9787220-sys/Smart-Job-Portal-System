public class JobService {

    public void viewJobs() {

        System.out.println("===== AVAILABLE JOBS =====");
        System.out.println("1. IBM - Associate System Engineer");
        System.out.println("2. Microland - Graduate Engineer Trainee");
        System.out.println("3. HCLTech - Software Engineer");
    }

    public void searchJobs(String skill) {

        System.out.println("Searching jobs for skill: " + skill);

        if (skill.equalsIgnoreCase("Java")) {
            System.out.println("Found: IBM ASE");
            System.out.println("Found: HCLTech Software Engineer");
        } else {
            System.out.println("No matching jobs found.");
        }
    }

    public void applyJob(int jobId) {

        System.out.println("Application Submitted Successfully");
        System.out.println("Applied Job ID: " + jobId);
    }
}
