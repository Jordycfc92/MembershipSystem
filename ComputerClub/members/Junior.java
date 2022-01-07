package members;


/**
 * Juniors are one of the levels of membership.
 * Juniors have one additional attribute, an assigned officer
 */
public class Junior extends Beginner
{
    // instance variables - replace the example below with your own
    private Officer officer;

    /**
     * Constructor for objects of class Junior
     */
    public Junior(String firstName, String secondName, String contactNumber, int idNumber, String membershipLevel,
    Officer officer)
    {
        // initialise instance variables
        super(firstName, secondName, contactNumber, idNumber, membershipLevel);
        this.officer = officer;
    }

    /**
     * Return the assigned officer
     */
    public Officer getOfficer()
    {
        return officer;
        
    }
    
    public void setOfficer(Officer newOfficer){
        // when officers are stored in a data structre(to be decided) iterate through officers to check 
        // if the new officer is in the list
        this.officer = newOfficer;
    }
    
    
}
