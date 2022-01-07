package members;


/**
 * Advanced members have an area of expertise
 */
public class Advanced extends Beginner
{
    // instance variables - replace the example below with your own
    private String expertise;

    /**
     * Constructor for objects of class Advanced
     */
    public Advanced(String firstName, String secondName, String contactNumber, int idNumber, String membershipLevel,
    String expertise)
    {
        // initialise instance variables
        super(firstName, secondName, contactNumber, idNumber, membershipLevel);
        this.expertise = expertise;
    }

    /**
     * return the Advanced members expertise
     *
     */
    public String getExpertise()
    {
        // put your code here
        return expertise;
    }
    
    public void setExpertise(String newExpertise){
        this.expertise = newExpertise;
    }
}
