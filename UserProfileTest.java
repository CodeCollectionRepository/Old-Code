
import student.*;

// -------------------------------------------------------------------------
/**
 *  Test class for the UserProfile class.
 *  Tests the mutator methods for password, email and 
 *  thumb picture Url.
 * 
 *  @author  al301
 *  @version 2011.09.06
 */
public class UserProfileTest
    extends TestCase
{
    private UserProfile userProf1;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new UserProfileTest test object.
     */
    public UserProfileTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }

    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    public void setUp()
    {
        userProf1 = new UserProfile();
    }

    // ----------------------------------------------------------
    /*# Insert your own test methods here */

    /**
     * Tests the password mutator method.
     */
    public void testSetPassword()
    {
        userProf1.setPassword("Yummy");
        assertEquals("Yummy", userProf1.getPassword());
    }

    /**
     * Tests the email mutator method.
     */
    public void testSetEmail()
    {
        userProf1.setEmail("hi@vt.edu");
        assertEquals("hi@vt.edu", userProf1.getEmail());
    }

    /**
     * Tests the thumbUrl mutator method.
     */
    public void testSetThumbUrl()
    {
        userProf1.setPictureThumbUrl("google.com");
        assertEquals("google.com", userProf1.getPictureThumbUrl());
    }
}

