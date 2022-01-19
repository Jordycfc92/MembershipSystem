import members.*;
/**
 * A class to test the creation and collection of club members
 *
 */
public class TestMemberCollection
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class TestMemberCollection
     */
    public TestMemberCollection()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     */
    public static void testCollection(){
        ArrayMembers memberArray= new ArrayMembers(25, 21);
        
        Beginner member1 = new Beginner(1340,"Jordan", "McMillan", "0770100110", "junior", false);
        Officer member2 = new Officer(1233,"Aaron", "McMillan", "0770100111",  "normal", false, "Purchasing officer");
        Advanced member3 = new Advanced(3241,"Matty", "McMillan", "0770100112", "junior", true, "networks");
        Junior member4 = new Junior(1205,"Ethan", "McMillan", "0770100113", "normal", true, member2);
        Beginner member5 = new Beginner(1200,"Elliott", "McMillan", "0770100114", "retired", true);
        Officer member6 = new Officer(1010,"Peter", "Lane", "0770200111",  "normal", true, "head of club");
        Beginner member7 = new Beginner(1231,"Harry", "Potter", "0770400110", "junior", false);
        Beginner member8 = new Beginner(1356,"Ronald", "Macdonald", "0780100110", "junior", false);
        Officer member9 = new Officer(1191,"Alan", "Turing", "0790102121",  "normal", true, "Finance officer");
        Advanced member10 = new Advanced(2241,"Alan", "Ayers", "0771020112", "normal", false, "Java");
        Beginner member11 = new Beginner(1831,"Alex", "Graham Bell", "0790305157", "junior", false);
        Officer member12 = new Officer(1033,"Daniel", "Bernoulli", "0752200111",  "normal", true, "head of club");
        Beginner member13 = new Beginner(1874,"Niels", "Bohr", "0787800110", "junior", false);
        Advanced member14 = new Advanced(4441,"Robert", "Boyle", "0770155112", "junior", false, "networks");
        Junior member15 = new Junior(1515,"Charles", "Darwin", "0760106116", "normal", true, member6);
        Beginner member16 = new Beginner(1347,"Leonhard", "Euler", "0740104110", "junior", false);
        Junior member17 = new Junior(1645,"Sophie", "Germain", "0750105113", "normal", false, member9);
        Beginner member18 = new Beginner(1300,"Grace", "Hopper", "078900110", "junior", false);
        Junior member19 = new Junior(7895,"Ada", "Lovelace", "0779400113", "normal", true, member12);
        Advanced member20 = new Advanced(5341,"Marie", "Curie", "0777100112", "normal", true, "networks");
        Beginner member21 = new Beginner(1980,"Gertrude", "Elion", "0787100110", "junior", false);
        
        memberArray.set(member1,0);
        memberArray.set(member2,1);
        memberArray.set(member3,2);
        memberArray.set(member4,3);
        memberArray.set(member5,4);
        memberArray.set(member6,5);
        memberArray.set(member7,6);
        memberArray.set(member8,7);
        memberArray.set(member9,8);
        memberArray.set(member10,9);
        memberArray.set(member11,10);
        memberArray.set(member12,11);
        memberArray.set(member13,12);
        memberArray.set(member14,13);
        memberArray.set(member15,14);
        memberArray.set(member16,15);
        memberArray.set(member17,16);
        memberArray.set(member18,17);
        memberArray.set(member19,18);
        memberArray.set(member20,19);
        memberArray.set(member21,20);

        memberArray.produceReport();
        System.out.println("");
        memberArray.produceSortedReport();

    }
    
    public static void main(String[] args){

        testCollection();
       
    }   
}
