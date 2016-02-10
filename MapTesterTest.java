
import student.*;
import java.util.*;

// -------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your test class here.
 *  Summarize what your test objectives are.
 * 
 *  @author  al301 (and if in lab, partner's pid on same line)
 *  @version (place the date here, in this format: yyyy.mm.dd)
 */
public class MapTesterTest
    extends TestCase
{
    //~ Constructor ...........................................................
    ArrayList<String> newTest;
    MapTester one = new MapTester();
    ArrayList<String> oldTest;

    // ----------------------------------------------------------
    /**
     * Creates a new MapTesterTest test object.
     */
    public MapTesterTest()
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
        ArrayList<String> newTest = new ArrayList<String>();
        ArrayList<String> oldTest = new ArrayList<String>();
    }


    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    public void testReverse()
    {
        newTest.add("lol");
        newTest.add("lol");
        newTest.add("lol");
        newTest.add("lol");
        newTest.add("Hi");
        newTest.add("Hi");
        newTest.add("Hi");
        newTest.add("Hi");
        one.reverse(newTest);
        assertEquals("Hi", newTest.get(1));
    }
}
