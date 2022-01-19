
public class List <T> {
    protected ListNode<T> head;

    // the constructor simply creates the class with a null value for "head"
    public List () {
        head = null;
    }


    public void join (T value) {
        if (head == null) {                       // <1>
            head = new ListNode<T> (null, value);
        } else {
            head.join (value);                     // <2>
        }
    }
    //removed first value in list
    public T leave () {
        if(head == null){
            return null;
        } else{ 
        T result = head.getValue();
        head = head.getNext();
        return result;
        }
    }
    
    public boolean hasNextValue(){
        if (head == null){
            return false;
        } else{
            List current = this;
            if(current!= null){
                return true;
            }
        }
        return false;
    }
    
    public void set (T value, int index) {
       if(head == null || index<0){
           throw new ArrayIndexOutOfBoundsException(index);
       }else{
       head.set(value, index);
       }
    }

    public T get (int index) {
        if(head == null){
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return head.get(index);
    }

    public void insert (T value, int index) {  
        if(head == null || index<0){
            throw new ArrayIndexOutOfBoundsException(index);
        }
        head = head.insert(value, index);
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
    
    public boolean contains(T value){
        if (head == null){
            return false;
        } else{
            ListNode current = head;
            while (current != null){
                if(current.getValue().equals(value)){
                    return true;
                }
                current=current.getNext();
            }
            return false;
        }
    }
    
    public int size(){
        int sizeCount = 0;
        ListNode current = head; 
        while(current!=null){
            sizeCount +=1;
            current =current.getNext();
        }
        return sizeCount;
    }
    
    // public void sortList(){
        // int index;
        // boolean flag;
        // do{
            // ListNode current = head;
            // ListNode previous = null;
            // ListNode next = head.getNext();
            // flag = false;
            // index = 0;
            // while(next!=null){
                // if(current.getValue()> next.getValue()){
                    // flag = true;
                    // index++;
                    // if (previous !=null){
                        // ListNode temp = next.getNext();
                        
                        // previous.setNext(next);
                        // next.setNext(current);
                        // current.setNext(temp);
                    // } else{
                        // ListNode temp = next.getNext();
                        // head = next;
                        // next.setNext(current);
                        // current.setNext(temp);
                    // }
                    // previous =next; 
                    // next=current.getNext();
                // }else{
                    // previous = current;
                    // current=next;
                    // next=next.getNext();
                // }
            // }
        // }while(flag);

    // }   

}


