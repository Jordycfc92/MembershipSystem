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
    public Advanced(int idNumber, String firstName, String secondName, String contactNumber, String membershipLevel,
    boolean paidSub, String expertise)
    {
        // initialise instance variables
        super(idNumber, firstName, secondName, contactNumber, membershipLevel, paidSub);
        this.expertise = expertise;
        this.memberType = "Advanced";
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
    
    public String toString(){
       String parentString = super.toString();
       return parentString + " " + expertise;
    }
}
