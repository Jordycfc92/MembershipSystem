
public class ListNode <T>{
    private ListNode <T> next;
    private T value;
    
    public ListNode(ListNode<T> next, T value){
        this.next = next;
        this.value = value;
    }

    public ListNode<T> getNext(){
        return next; 
    }

    public T getValue(){
        return value;
    }

    public String toString(){
        String result ="";

        result+="[";
        ListNode<T> current = this; 
        while(current != null){
            result += current.value;
            if (current.next!= null){
                result+= ", \n ";
            }
            current = current.next; 
        }
        result+="]";
        return result; 
    }

    public void setNext(ListNode<T> next){
        this.next = next;
    }


    public void join (T value) {
        ListNode<T> current = this;

        // walk the list to find the last item
        while (current.getNext () != null) {
            current = current.getNext ();
        }

        // make a new node from data and place it in the lastItem
        current.setNext (new ListNode<T> (null, value));              // <1>
    }

    
    public T get(int i){
        ListNode<T> current = this;
        int currentIndex =0;

        while(current!=null){
            if(currentIndex == i){
                return current.getValue(); 
            }
            currentIndex+=1;
            current = current.getNext();
        }

        throw new ArrayIndexOutOfBoundsException(i);
    }

    public void set (T value, int i){
        ListNode<T> current = this;
        int currentIndex = 0;

        while(current!=null){
            if (currentIndex ==i){
                current.value = value;
                return;
            }
            currentIndex += 1;
            current = current.getNext();
        }
        throw new ArrayIndexOutOfBoundsException (i);
    }
    
    public ListNode insert (T value, int index){
        ListNode<T> current = this;
        int currentIndex =0;
        
        if (index <0){
            throw new ArrayIndexOutOfBoundsException(index);
        }
        
        if(index == 0){
            return new ListNode(current, value);
        }

        while (current!= null){
            if(currentIndex+1 == index){
                ListNode<T> insertedNode = new ListNode<T>(current.getNext(), value);
                current.next = insertedNode;
                return this; 
            }
            currentIndex += 1;
            current = current.getNext();
        }

        throw new ArrayIndexOutOfBoundsException(index);
    }
    
    public ListNode<T> delete (int index){
        ListNode<T> current = this;
        int currentIndex = 0;
        
        if(index<0){
            throw new ArrayIndexOutOfBoundsException(index);
        }
        
        if(index==0){
            return next;
        }
        
        while(current!=null){
            if(currentIndex +1 == index){
                current.setNext(current.getNext().getNext());
                return this;
            }
            currentIndex +=1;
            current = current.getNext();
        }
        throw  new ArrayIndexOutOfBoundsException(index);
    }

}
