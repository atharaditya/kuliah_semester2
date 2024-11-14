package LinkedList;

class linked {
    Object nilai;
    linked next;
    
    public linked(Object i,linked n)
    {
        nilai=i;
        next=n;
    }
}


public class LinkedList_dummy {
    
    private static linked head;
    private static int list;

    
    public LinkedList_dummy()
    {
        head=new linked("dummy_head", null);
    }
    
    static boolean isempty()
    {
        return head.next==null;
    }
    
    static void insert(Object i)
    {
        linked temp;
        temp=new linked(i, head.next);
        head.next=temp;
        System.out.println("nilai "+i+" masuk linked list");
        list++;
    }
    
    static void delete() {
        if(head.next!=null)
        {
            System.out.println("nilai "+head.next.nilai+" terhapus");
            head.next=head.next.next;
            list--;
        }else
        {
            System.out.println("maaf, linked list kosong");
        }
    }
    
    static void display() {
        System.out.println("jumlah data dalam linked list :"+list);
        linked temp=head;
        while(temp!=null)
        {
            System.out.println("isi linked list :"+temp.nilai);               
            temp=temp.next;
        }
    }
    
    public static void main(String[] args) {
        
        LinkedList_dummy a=new LinkedList_dummy();
        a.delete();
        a.display();
        a.insert(3);
        a.insert(2);
        a.insert(5);
        a.display();
        a.delete();
        a.delete();
        a.delete();
        a.delete();
        a.display();
        
        
    }
}