

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class UserTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class UserTest
{
    /**
     * Default constructor for test class UserTest
     */
    public UserTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void basicUser()
    {
        User user1 = new User();
        user1.setEmail("jose@gmail.com");
        assertEquals("jose@gmail.com", user1.getEmail());
    }

    @Test
    public void fullUser()
    {
        User user1 = new User();
        user1.setBio("Bio 1");
        user1.setEmail("email1@gmail.com");
        user1.setLogin("login1");
        user1.setPassword("123");
        assertEquals("Bio 1", user1.getBio());
        assertEquals("email1@gmail.com", user1.getEmail());
        assertEquals("login1", user1.getLogin());
        assertEquals("123", user1.getPassword());
    }

    @Test
    public void postToUser()
    {
        User user1 = new User();
        user1.setLogin("rodrigo");
        Post post1 = new Post();
        post1.setDescription("Partiu APS");
        post1.setAuthor(user1);
        assertEquals("Partiu APS", post1.getDescription());
        assertEquals(user1, post1.getAuthor());
        assertEquals("rodrigo", post1.getAuthor().getLogin());
    }

}




