import java.util.Date;


public class UserLogic {
    
    public static User createUser() {
        User user = new User();
        user.setCreated(new Date());
        return user;
    }
    
    
    public static User getUserByLogin(String login) {
        Object obj = null; //Carregar do BD 
        
        User user = new User();
        //user.setCreated(obj.getCreated());
        
        return user;
    }
    
    public static void addFollowed(User follower, User toBeFollowed) {
        Relation relation = new Relation ();
        relation.setFollower(follower);
        relation.setFollowed(toBeFollowed);

        follower.addFollowed(relation);

        toBeFollowed.addFollower(relation);
    }

    
}
