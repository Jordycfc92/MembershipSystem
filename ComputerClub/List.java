
public class List <T> {
    private ListNode<T> head;

    // the constructor simply creates the class with a null value for "head"
    public List () {
        head = null;
    }
    
    public boolean checkList(T value){
        if (head == null){
            return false;
        }
        
        ListNode current = head;
        while (current!=null){
            if(current.getData() == value){
                return true;
            }
        }
        return false;
    }

    // the join method creates a new ListNode for the given item of data
    // and appends the new item to the end of the list
    public void join (T data) {
        if (head == null) {                       // <1>
            head = new ListNode<T> (null, data);
        } else {
            head.join (data);                     // <2>
        }
    }
    //removed first value in list
    public T leave () {
        if(head == null){
            return null;
        } else{ 
        T result = head.getData();
        head = head.getNext();
        return result;
        }
    }

    public T get (int index) {
        if(head == null){
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return head.get(index);
    }

    public void set (T data, int index) {
        if(head == null || index<0){
            throw new ArrayIndexOutOfBoundsException(index);
        }else{
        head.set(data, index);
        }
    }

    public void insert (T data, int index) {   // <3>
        if(head == null || index<0){
            throw new ArrayIndexOutOfBoundsException(index);
        }
        head = head.insert(data, index);
    }

    public void delete (int index) {
        if(head == null || index<0){
            throw new ArrayIndexOutOfBoundsException(index);
        } else{
        head = head.delete(index);
        }
    }
    
    public String toString(){
        if(head==null){
            return "No head value";
        } else 
        return head.toString();
    }
    
    public void clear(){
        if (head == null){
            return;
        }else {
            head = null;           

        }
    }
    
    public int size(){
        int count = 0;
        ListNode current = head; 
        
        while(current!=null){
            count +=1;
            current =current.getNext();
        }
        return count;
    }
}


