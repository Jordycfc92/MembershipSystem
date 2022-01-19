import members.*;
/**
 * Write a description of class TestMembers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestMemberCreation
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class TestMembers
     */
    public TestMemberCreation()
    {

    }
    
    public static void main(String[] args){
        
        testMemberCreation();
    }
    
    public static void testEqualStrings(String result, String expected){
        if (result.equals(expected)){
            System.out.println("Pass");
        } else{
            System.out.println("Error: result " + result + " does not equal expected " + expected);
        }
    }
    
    public static void testMemberCreation(){
        
        Beginner member1 = new Beginner(12001,"Jordan", "McMillan", "0770100110", "junior", false);
        Officer member2 = new Officer(12002,"Aaron", "McMillan", "0770100111",  "normal", true, "head of club");
        Advanced member3 = new Advanced(12003,"Matty", "McMillan", "0770100112", "junior", false, "networks");
        Junior member4 = new Junior(12004,"Ethan", "McMillan", "0770100113", "normal", true, member2);
        Beginner member5 = new Beginner(12005,"Elliott", "McMillan", "0770100114", "retired", true);
        
        testEqualStrings(member1.toString(), "12001 Beginner Jordan McMillan 0770100110 junior false");
        testEqualStrings(member2.toString(), "12002 Officer Aaron McMillan 0770100111 normal true head of club");
        testEqualStrings(member3.toString(), "12003 Advanced Matty McMillan 0770100112 junior false networks");
        testEqualStrings(member4.toString(), "12004 Junior Ethan McMillan 0770100113 normal true Aaron McMillan");
        testEqualStrings(member5.toString(), "12005 Beginner Elliott McMillan 0770100114 retired true");
    }


}
