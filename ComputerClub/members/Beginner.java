package members;


/**
 * All members of the club would have to start as a beginner in some sense.
 * It therefore seems prudent to have the beginner class as the parent class to all members
 */
public class Beginner
{
    // instance variables
    protected String firstName;
    protected String secondName;
    protected String contactNumber; // not an integer, a string of digits representing an address
    protected String idNumber; // ID numbers are unique, not an integer,digits representing an address
    protected String subscriberLevel;
    protected boolean paidSub;

    /**
     * Constructor for objects of class Beginner
     */
    public Beginner(String firstName, String secondName, String contactNumber, String idNumber, String subscriberLevel, boolean paidSub)
    {
        this.firstName = firstName;
        this.secondName = secondName;
        this.contactNumber = contactNumber;
        this.idNumber = idNumber;
        this.subscriberLevel = subscriberLevel;
        this.paidSub = paidSub;

    }

    public String getName(){
        return firstName + secondName;
    }
    
    public void setFirstName(String newFirstName){
        if (newFirstName.length()< 2){
            System.out.println("Error, first name must have more than two characters");
        }else{
            this.firstName = newFirstName;
        }
    }
    
    public void setSecondName(String newSecondName){
        if (newSecondName.length()< 2){
            System.out.println("Error, second name must have more than two characters");
        }else{
            this.secondName = newSecondName;
        }
    }
    
    public String getContactNumber(){
        return contactNumber;
    }
    
    public void setContactNumber(String newContactNum){
        if(newContactNum.length() <11){
            System.out.println("Error, all contact numbers must be mobile numbers of 11 digits");
        } else{
            this.contactNumber = newContactNum;
        }
    }
    
    public String getIdNumber(){
        return idNumber;
    }
    
    public String getSubscriberLevel(){
        return subscriberLevel;
    }
    
    public void setSubscriberLevel(String newSubscriberLevel){
        if (!newSubscriberLevel.equalsIgnoreCase("junior") || !newSubscriberLevel.equalsIgnoreCase("normal") 
        || !newSubscriberLevel.equalsIgnoreCase("retired")){
            System.out.println("Error, subscriber level is not recognised");
        } else{
            this.subscriberLevel = newSubscriberLevel;
        }
    }
    
    
}
