import java.util.Date;

public class User {
    
    private String email;
    private String password;
    private String login;
    private String bio;
    private Date created;
    
    public User() {
        this.created = new Date();
    }
    
    public Date getCreated() {
        return created;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
}
