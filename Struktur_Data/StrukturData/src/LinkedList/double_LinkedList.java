package LinkedList;

class link {
    link next;
    link prev;
    Object data;
    
    public link(Object a, link b,link c)
    {
        data=a;
        next=b;
        prev=c;
    }
}

class double_linked {
    static link head;
    static link tail;
    static link current;
    static int list;
    
    public double_linked()
    {
        head=new link("Dummy head", null, null);
        tail=new link("Dummy tail", null, null);
        tail.prev=head;
        head.next=tail;
    }
    
    public boolean isempty()
    {
        return head.next==tail&&tail.prev==head;
    }
    
    public void inserthead(Object a) {
        current=head.next;
        link temp=new link(a, current, current.prev);
        current.prev.next=temp;
        current.prev=temp;
        current=temp;
        System.out.println("nilai "+a+" dimasukkan dibagian head");
        list++;
    }
    
    public void inserttail(Object a) {
        current=tail.prev;        
        link temp=new link(a, current.next, current);
        current.next.prev=temp;
        current.next=temp;
        current=temp;
        
        System.out.println("nilai "+a+" dimasukkan dibagian tail");
        list++;                
    }
    
    public void deletehead() {
        if(isempty())
            System.out.println("no node to delete");
        else
        {
            link temp=head.next;
            current=head.next;
            current.next.prev=current.prev;
            current.prev.next=current.next;
            current=current.next;
            System.out.println("nilai "+temp.data+" dihapus dari linkedlist");
            list--;
        }
    }
    
    public void deletetail() {
        if(isempty())
            System.out.println("no node to delete");
        else
        {
            link temp=tail.prev;
            current=tail.prev;
            current.prev.next=current.next;
            current.next.prev=current.prev;
            current=current.prev;
            System.out.println("nilai "+temp.data+" dihapus dari linkedlist");
            list--;            
        }
    }
    
    public void deletepos(int indeks)
    {
        if(isempty())
            System.out.println("no node to delete");
        else {
            if(indeks>list)
                System.out.println("sorry, indeks out of range");
            else
            {
                link temp=head.next;
                for(int i=1;i<indeks-1;i++)
                {
                    temp=temp.next;
                }
                
                if(indeks==1)
                {
                    current=head.next;
                    current.next.prev=current.prev;
                    current.prev.next=current.next;
                    current=current.next;
                    System.out.println("nilai "+temp.data+" dihapus dari linkedlist");
                    list--;                    
                }else
                {
                    link del=temp.next;
                    current=temp.next;
                    current.next.prev=current.prev;
                    current.prev.next=current.next;
                    current=current.next;
                    System.out.println("nilai "+del.data+" dihapus dari linkedlist");
                    list--;
                }
                
            }
        }
    }
    
    public void displayforward() {
        link temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        
        System.out.println("jumlah elemen double linked list "+list);
    }
    
}

public class double_LinkedList {
    public static void main(String[] args) {
        
        double_linked a=new double_linked();
        a.inserthead(4);
        a.inserthead(1);
        a.inserthead(15);
        a.inserthead(10);
        a.inserttail(12);
        a.displayforward();
        a.deletehead();
        a.deletepos(3);
        a.deletetail();
        a.displayforward();
        a.inserttail(19);
        a.inserttail(14);
        a.inserthead(25);
        a.inserthead(20);
        
    }
}