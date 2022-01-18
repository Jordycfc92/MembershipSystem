import java.util.Random;

/**
 * MembershipNumber is a class that is concerned with allocation of membership numbers
 * It is imperative to have unique membership numbers for each member
 */
public class MembershipNumber
{
    // instance variables - replace the example below with your own
    private List<Integer> memberNumbers;
    

    /**
     * Constructor for objects of class MembershipNumber
     */
    public MembershipNumber()
    {
        // initialise instance variables
        
    }
    
    public String newMembershipNum(){
        
        Random rand = new Random();
        int memNum = rand.nextInt (99999);
        
        while(memberNumbers.checkList(memNum)){
            memNum = rand.nextInt (99999);
        }
        
        memberNumbers.join(memNum); // add the membership number used simple linked list, no limit on members
        
        String memNumFormatted = String.format("%05d", memNum);
        return memNumFormatted;        
    }



}