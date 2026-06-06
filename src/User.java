public class User {

    private int userId;
    private String name;
    private String email;
    private String password;
    private String skills;

    public User(int userId, String name, String email, String password, String skills) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.skills = skills;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSkills() {
        return skills;
    }
}
