
import student.*;

// -------------------------------------------------------------------------
/**
 *  Tests class Entity.
 *  Specifically, the setName and setPictureUrl name.
 * 
 *  @author  al301
 *  @version 2011.09.06
 */
public class EntityTest
    extends TestCase
{
    private Entity entity1;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new EntityTest test object.
     */
    public EntityTest()
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
        entity1 = new Entity();
    }


    // ----------------------------------------------------------
    
 
    /**
     * Tests the setName method.
     */
    public void testSetName()
    {
        entity1.setName("Alice");
        assertEquals("Alice", entity1.getName());
    }

    /**
     * Tests the setPictureUrl method.
     */
    public void testSetPictureUrl()
    {
        entity1.setPictureUrl("Amazing");
        assertEquals("Amazing", entity1.getPictureUrl());
    }
}


