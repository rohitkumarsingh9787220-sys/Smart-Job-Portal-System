public class Job {

    private int jobId;
    private String companyName;
    private String jobTitle;
    private String location;
    private String skillsRequired;
    private String salary;

    public Job(int jobId, String companyName, String jobTitle,
               String location, String skillsRequired, String salary) {

        this.jobId = jobId;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.location = location;
        this.skillsRequired = skillsRequired;
        this.salary = salary;
    }

    public int getJobId() {
        return jobId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getLocation() {
        return location;
    }

    public String getSkillsRequired() {
        return skillsRequired;
    }

    public String getSalary() {
        return salary;
    }
}
