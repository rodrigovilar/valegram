import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class User {
    
    private String email;
    private String password;
    private String login;
    private String bio;
    private Date created;
    private List<Post> posts = new ArrayList<Post>();
    
    public User() {
        this.created = new Date();
    }
    
    public void addPost(Post post) {
        this.posts.add(post);
    }
    
    public List<Post> getPosts() {
        return posts;
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
    
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getBio() {
        return bio;
    }
    
    public void setBio(String bio) {
        this.bio = bio;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
}
