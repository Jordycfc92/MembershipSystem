
public class TestArrayInt
{
    public static void testToString(String result, String expected){
        if (result.equals(expected)){
            System.out.println("toString passed");
        }else {
            System.out.println("Error: the result "+ result + " dose not equal the expected "
                + expected);
        }
    }
    
    public static void testGet(int result, int expected){
        if (result == expected){
            System.out.println("toString passed");
        }else {
            System.out.println("Error: the result "+ result + " dose not equal the expected "
                + expected);
        }
    }
    

}
