package members;


/**
 * Each Officer has an area of club responsibility:
 * Head of club, Publicity officer, Purchasing officer, Fincance officer.
 */
public class Officer extends Beginner
{
    // instance variables - replace the example below with your own
    private String responsibleFor;

    /**
     * Constructor for objects of class Officer
     */
    public Officer(int idNumber,String firstName, String secondName, String contactNumber, String membershipLevel,
    boolean paidSub, String responsibleFor )
    {
        super(idNumber,firstName, secondName, contactNumber,  membershipLevel, paidSub);
        this.responsibleFor = responsibleFor;
        this.memberType = "Officer";
    }

    /**
     * return the officers club responsibility
     *
     */
    public String getResponsibleFor()
    {
        return responsibleFor;
    }
    
    public void setResponsibleFor(String newResponsibleFor){
        if(!newResponsibleFor.equalsIgnoreCase("head of club") || !newResponsibleFor.equalsIgnoreCase("Publicity officer")
        ||!newResponsibleFor.equalsIgnoreCase("Purchasing officer") || !newResponsibleFor.equalsIgnoreCase("Finance officer")){
            System.out.println("Responsibilty no recognised");
        }else{
            this.responsibleFor = newResponsibleFor;
        }
    }
    
    public String toString(){
       String parentString = super.toString();
       return parentString + " " + responsibleFor;
    }
}
