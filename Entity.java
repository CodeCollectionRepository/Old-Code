
import student.*;

// -------------------------------------------------------------------------
/**
 *  Creates a class with name a pictureurl fields.
 * 
 *  @author  al301
 *  @version 2011.09.06
 */
public class Entity
{
    //~ Instance/static variables .............................................
    private String name;
    private String pictureUrl;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new Entity object.
     */
    public Entity()
    {
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * Returns the current name.
     * @return name return the value for the name field.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Allows the user to change the name field.
     * @param newName the new value for the name field.
     */
    public void setName(String newName)
    {
        name = newName;
    }
    
    /**
     * Returns the current picture Url.
     * @return pictureUrl returns the current value for pictureUrl field.
     */
    public String getPictureUrl()
    {
        return pictureUrl;
    }
    
    /**
     * Allows the user to change the picture url.
     * @param newPictureUrl the new value for the pictureUrl field.
     */
    public void setPictureUrl(String newPictureUrl)
    {
        pictureUrl = newPictureUrl;
    }
    
}
