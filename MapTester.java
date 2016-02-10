import java.util.*;
import student.*;

// -------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 * 
 *  @author  your-pid (and if in lab, partner's pid on same line)
 *  @version (place the date here, in this format: yyyy.mm.dd)
 */
public class MapTester
{
    //~ Instance/static variables .............................................

    HashMap<String, String> phoneBook = new HashMap<String, String>();


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new MapTester object.
     */
    public MapTester()
    {
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................

    public void enterNumber(String name, String number)
    {
        if ( phoneBook.get(name) != null)
        {
            System.out.println("Name already taken");
        }
        else 
        {
            phoneBook.put(name, number);
        }
    }
    
    public String lookUpNumber(String name)
    {
        return phoneBook.get(name);
    }
    
    public ArrayList<String> reverse(ArrayList<String> original)
    {
        ArrayList<String> reversed = new ArrayList<String>();
        for ( int i = original.size(); i >= 0; i--)
        {
            String temporary = original.get(i);
            reversed.add(temporary);
        }
        return reversed;
    }
            
    public void buildIndex(ArrayList<Person> original)
    {
        HashMap<String, String> phoneBook = new HashMap<String, String>;
        for ( int i = 0; i < original.size(); i++)
        {
            Person currentPerson = original.get(i);
            phoneBook.put(currentPerson.getName(), currentPerson);
        }
    }
    
    public void reverseIndex(HashMap<String, Person> original)
    {
    }
    
    public void printToN(int maxNumber)
    {
        for ( int i = maxNumber; i > 0; i --)
        {
            System.out.println(i);
        }
    }
}
