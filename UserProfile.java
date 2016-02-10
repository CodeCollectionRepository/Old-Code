
import student.*;

// -------------------------------------------------------------------------
/**
 *  A user profile class that extends the Entity class.
 *  Has password, email, and thumb picture url fields.
 * 
 *  @author  al301
 *  @version 2011.09.06
 */
public class UserProfile
    extends Entity
{
    //~ Instance/static variables .............................................
    private String password;
    private String email;
    private String pictureThumbUrl;
    


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new UserProfile object.
     */
    public UserProfile()
    {
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................

    /**
     * Returns the current value for password.
     * @return password returns the current value for the 
     * password field.
     */
    public String getPassword()
    {
        return password;
    }
    
    /**
     * Allows user to change the password.
     * @param newPassword the new value for the password field.
     */
    public void setPassword(String newPassword)
    {
        password = newPassword;
    }
    
    /**
     * Returns the current value for email.
     * @return email returns the current value of the email field.
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Allows the user to change the value for email field.
     * @param newEmail the new value for the email field.
     */
    public void setEmail(String newEmail)
    {
        email = newEmail;
    }
    
    /** 
     * Returns the current value for pictureThumbUrl.
     * @return pictureThumbUrl returns the current value for
     * the pictureThumbUrl field.
     */
    public String getPictureThumbUrl()
    {
        return pictureThumbUrl;
    }
    
    /**
     * Allows user to change the value for pictureThumbUrl field.
     * @param newPictureThumbUrl the new value for the 
     * pictureThumbUrl field.
     */
    public void setPictureThumbUrl(String newPictureThumbUrl)
    {
        pictureThumbUrl = newPictureThumbUrl;
    }
}
