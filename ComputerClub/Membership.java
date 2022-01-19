import members.*;
import java.util.Comparator;

/**
 * A class to control the storage and manipulation of the the club members
 *
 */
public class Membership
{

    /**
     * Constructor for objects of class Membership
     */
    public Membership(){
    }
    
    //
    public static void membershipList(){
        Beginner member1 = new Beginner(1340,"Jordan", "McMillan", "0770100110", "junior", false);
        Officer member2 = new Officer(1233,"Aaron", "McMillan", "0770100111",  "normal", true, "head of club");
        Advanced member3 = new Advanced(3241,"Matty", "McMillan", "0770100112", "junior", false, "networks");
        Junior member4 = new Junior(1205,"Ethan", "McMillan", "0770100113", "normal", true, member2);
        Beginner member5 = new Beginner(1200,"Elliott", "McMillan", "0770100114", "retired", true);
        
        ArrayMembers memberArray= new ArrayMembers(6, 5);
        memberArray.set(member1, 0);
        memberArray.set(member2, 1);
        memberArray.set(member3, 2);
        memberArray.set(member4, 3);
        memberArray.set(member5, 4);
        
        System.out.println(memberArray);
        for(int i =0; i<memberArray.getCurrentSize(); i++){
            System.out.println(memberArray.get(i).report());
        }
        System.out.println("");
        memberArray.sortArrayMem();
        System.out.println(memberArray);

    }
    
    public static void main(String[] args){

        membershipList();
       
    }    
    


    }
