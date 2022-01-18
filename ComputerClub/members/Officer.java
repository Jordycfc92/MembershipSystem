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
    public Officer(String firstName, String secondName, String contactNumber, String idNumber, String membershipLevel,
    String respobsibleFor, boolean paidSub)
    {
        super(firstName, secondName, contactNumber, idNumber, membershipLevel, paidSub);
        this.responsibleFor = responsibleFor;
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
        ||!newResponsibleFor.equalsIgnoreCase("Purchasing officer") || !newResponsibleFor.equalsIgnoreCase("Fincance officer")){
            System.out.println("Responsibilty no recognised");
        }else{
            this.responsibleFor = newResponsibleFor;
        }
    }
}
