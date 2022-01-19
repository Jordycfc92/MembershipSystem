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
    public Junior(int idNumber,String firstName, String secondName, String contactNumber, String membershipLevel,
    boolean paidSub,Officer officer)
    {
        // initialise instance variables
        super(idNumber, firstName, secondName, contactNumber, membershipLevel, paidSub);
        this.officer = officer;
        this.memberType = "Junior";
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
    
    public String getOfficerName(){
        return officer.firstName + " " + officer.secondName;
    }
    
    public String toString(){
        String parentString = super.toString();
        return parentString + " " + getOfficerName();
    }
    
    public String report(){
        return super.report();
    }
    
}
