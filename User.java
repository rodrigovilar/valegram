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
    private List <Relation> myFollowers = new ArrayList<Relation>();
    private List <Relation> myFolloweds = new ArrayList<Relation>();
    private List<AccountType> accountTypes = new ArrayList<AccountType>();
    
    public void addAccountType(AccountType accountType) {
        this.accountTypes.add(accountType);
    }
    
    public void addFollowed(Relation followed) {
        this.myFolloweds.add(followed);
    }

    public void addFollower(Relation follower) {
        this.myFollowers.add(follower);
    }

    
    public List<User> getFolloweds(){
        List<User> temp = new ArrayList<User>();
        for( Relation r : myFolloweds){
            temp.add(r.getFollowed());
        }
        return temp;
    }
    
    public List<User> getFollowers(){
        List<User> temp = new ArrayList<User>();
        for( Relation r : myFollowers){
            temp.add(r.getFollower());
        }
        return temp;
    }
    
    public List<Post> getFeed() {
        return null;
    }
    
    public void addPost(Post post) {
        this.posts.add(post);
    }
    
    public List<Post> getPosts() {
        return posts;
    }
    
    void setCreated(Date created) {
        this.created = created;
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
