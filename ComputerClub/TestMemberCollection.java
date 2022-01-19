import members.*;
/**
 * A class to test the creation and collection of club members
 *
 */
public class TestMemberCollection
{
    
    public static ArrayMembers memberArray;
    /**
     * Constructor for objects of class TestMemberCollection
     */
    public TestMemberCollection()
    {
        // initialise instance variables
        
    }

    public static String testCollection(){
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
        
        //Test sample of members package and all associated classes
        System.out.println("Test the production of members");
        testEqualStrings(member1.toString(), "1340 Beginner Jordan McMillan 0770100110 junior false");
        testEqualStrings(member2.toString(), "1233 Officer Aaron McMillan 0770100111 normal false Purchasing officer");
        testEqualStrings(member3.toString(), "3241 Advanced Matty McMillan 0770100112 junior true networks");
        testEqualStrings(member4.toString(), "1205 Junior Ethan McMillan 0770100113 normal true Aaron McMillan");
        testEqualStrings(member5.toString(), "1200 Beginner Elliott McMillan 0770100114 retired true");
        
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
        
        
        //show an unordered report
        memberArray.produceReport();        
        //show sorted report
        String sortRep = memberArray.produceSortedReport();
        System.out.println(sortRep);
        
        //test that report is ordered
        System.out.println("Test order of sorted report");
        int[] sortedIDOrder = {1010,1033,1191,1200,1205,1231,1233,1300,1340,1347,1356,1515,1645,1831,1874,1980,2241,3241,4441,5341};
        for(int i = 0; i < memberArray.getCurrentSize()-1; i++){
            testEqualInts(memberArray.get(i).getIDNumber(), sortedIDOrder[i]);  
        }
        return sortRep;
    
    }
    
    public static void taskFiveTest(){
        ArrayMembers memberArray= new ArrayMembers(6, 0);
        
        Beginner member1 = new Beginner(1340,"Jordan", "McMillan", "0770100110", "junior", false);
        Officer member2 = new Officer(1233,"Aaron", "McMillan", "0770100111",  "normal", false, "Purchasing officer");
        Advanced member3 = new Advanced(3241,"Matty", "McMillan", "0770100112", "junior", true, "networks");
        Beginner member4 = new Beginner(1200,"Elliott", "McMillan", "0770100114", "retired", true);
        Officer member5 = new Officer(1010,"Peter", "Lane", "0770200111",  "normal", true, "head of club");
        
        System.out.println("Add members to task five test ArrayMembers structure");
        memberArray.add(member1);
        memberArray.add(member2);
        memberArray.add(member3);
        memberArray.add(member4);
        memberArray.add(member5);
        
        System.out.println(memberArray.produceReport());
        
        System.out.println("Add members to task five test ArrayMembers structure");
        memberArray.removeWithId(1233);
        System.out.println(memberArray.produceReport());
    }
    
    public static void testEqualInts(int result, int expected){
        if (result ==expected){
            System.out.println("Pass");
        } else{
            System.out.println("Error: result " + result + " does not equal expected " + expected);
        }
    }
    
    public static void testEqualStrings(String result, String expected){
       if (result.equals(expected)){
           System.out.println("Pass");
       } else{
           System.out.println("Error: result " + result + " does not equal expected " + expected);
        }
    }

    public static void main(String[] args){

        testCollection();
        taskFiveTest();
        
       
    }   
}
