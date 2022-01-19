import members.*;
public class ArrayMembers
{

    private Beginner[] array;
    private int maximumSize;
    private int currentSize;

    public ArrayMembers(int maximumSize, int currentSize){
        array = new Beginner[maximumSize];
        this.maximumSize = maximumSize;
        this.currentSize = currentSize;
    }

    public String toString(){
        String result ="";

        result += "[";
        for(int i =0; i<currentSize; i++){
            result += array[i];
            if(i+1<currentSize){
                result += ", \n";
            }
        }
        result += "]";
        return result;
    }

    public int getCurrentSize(){
        return currentSize;
    }

    public void set (Beginner value, int index) throws ArrayIndexOutOfBoundsException{
        if(index<0 || index > currentSize){
            throw new ArrayIndexOutOfBoundsException (index);

        }

        array[index] = value;
    }

    public Beginner get (int index) throws ArrayIndexOutOfBoundsException {
        if(index<0 || index > currentSize){
            throw new ArrayIndexOutOfBoundsException(index);
        }

        return array[index];
    }

    public void insert (Beginner value, int index)throws ArrayIndexOutOfBoundsException {
        if(index<0 || index > currentSize || currentSize == maximumSize){
            throw new ArrayIndexOutOfBoundsException(index);
        }

        for(int i = currentSize-1; i>=index; i=i-1){
            array[i+1] = array[i];
        }
        array[index] = value;
        currentSize+=1;
    }

    public void delete (int index){
        if(index<0 || index > currentSize){
            System.out.println ("Error in set, Index is out of bounds.");
            return;
        }

        for (int i = index; i < currentSize; i++){
            array[i] = array[i+1];
        }
        currentSize-=1;
    }

    public void sortArrayMem(){
        if(currentSize <= 0){
            System.out.print("Error, ArrayMember is empty");
            return;
        }
        int t;
        t=0;
        do{
            doInsert(array, t);
            t++;
        } while(t!=currentSize);

    }

    public static void swap (Beginner[] arr, int i1, int i2) {
        Beginner temp;

        temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }   

    public static void doInsert (Beginner[] arr1, int top) {
        for (int i=0; i<top; i=i+1) {
            if (arr1[i].getIDNumber() > arr1[top].getIDNumber()) {
                swap (arr1, i, top);
            }
        }
    } 

    public String produceReport(){
        String report;
        report ="";
        for(int i =0; i<currentSize-1; i++){
            report += (get(i).report());
            report += " \n";
        }
        return report;
    }
    
    public String produceSortedReport(){
        sortArrayMem();
        return produceReport();
    }

}
