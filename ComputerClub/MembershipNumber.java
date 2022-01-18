import java.util.Random;

/**
 * MembershipNumber is a class that is concerned with allocation of membership numbers
 * It is imperative to have unique membership numbers for each member
 */
public class MembershipNumber
{
    // instance variables - replace the example below with your own
    public static List<Integer> memberNumbers;
    

    /**
     * Constructor for objects of class MembershipNumber
     */
    public MembershipNumber()
    {
        List<Integer> memberNumbers = new List<>();
    }
    
    
    public static String newMembershipNum(){
        List<Integer> memberNumbers = new List<>();
        
        for (int i =0; i <25; i++){
            Random rand = new Random();
            int memNum = rand.nextInt (99999);
            if (memberNumbers != null){
                while(memberNumbers.checkList(memNum)){
                memNum = rand.nextInt (99999);
        } 
        }
            memberNumbers.join(memNum);
        }
        

        String memNumFormatted = String.format("%05d", memNum);
        return memNumFormatted;        
    }



}