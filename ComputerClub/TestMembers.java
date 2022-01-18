import members.*;
/**
 * Write a description of class TestMembers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestMembers
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class TestMembers
     */
    public TestMembers()
    {

    }
    
    public static void main(String[] args){
        Beginner jordan = new Beginner("Jordan", "McMillan", "0770100110", MembershipNumber.newMembershipNum(), 
        "junior", true);
        
        Beginner aaron = new Beginner("Aaron", "McMillan", "0770100111", MembershipNumber.newMembershipNum(), 
        "junior", true);
        Beginner matty = new Beginner("Matty", "McMillan", "0770100112", MembershipNumber.newMembershipNum(), 
        "junior", true);
        Beginner ethan = new Beginner("Ethan", "McMillan", "0770100113", MembershipNumber.newMembershipNum(), 
        "junior", true);
        Beginner elliott = new Beginner("Elliott", "McMillan", "0770100114", MembershipNumber.newMembershipNum(), 
        "junior", true);
        
        System.out.println(jordan);
        
        System.out.println(MembershipNumber.memberNumbers.toString());
        
    }


}
