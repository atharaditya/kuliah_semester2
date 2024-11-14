package LinkedList;

class node {
     int nilai;
    node next;
    
    public node(int a,node n)
    {
        nilai=a;
        next=n;
    }
    
    public node(int a)
    {
        nilai=a;
    }
}

public class Single_LinkedList_wtail {
    private static node head;
    private static node tail;
    private static int list;
    
    public Single_LinkedList_wtail()
    {
        head=null;
        tail=null;
    }
    
    static boolean isempty()
    {
        return head==null&&tail==null;
    }
    
    static void insert(int i)
    {
        if(isempty())
        {
            node link=new node(i);
            head=link;
            tail=link;
            System.out.println("nilai "+i+" masuk linked list");
            list++;
        }else
        {
            node temp=new node(i, head);
            head=temp;
            System.out.println("nilai "+i+" masuk linked list");
            list++;
        }
    }

    static void delete() {
        if(isempty())
        {
            System.out.println("linked list kosong");
        }else
        {
            System.out.println("nilai "+head.nilai+" terhapus");
            head=head.next;
            list--;
        }
    }

    static void insertafter(int k, int indeks) {
        if(isempty())
            System.out.println("maaf linked list kosong");
        else
        {
            if(indeks>list)
                System.out.println("maaf, indeks melebihi panjang linked list");
            else
            {
                node temp=head;
                node fixed;
        
                for(int i=1;i<indeks;i++)
                {
                temp=temp.next;
                }        
                fixed=new node(k, temp.next);
                temp.next=fixed;
                System.out.println("nilai "+k+" masuk linked listx");
                list++;
            }
        }
    }

    static void insertlast(int i) {
        if(isempty())
            System.out.println("maaf, linked list kosong");
        else
        {
            tail.next=new node(i);
            tail=tail.next;
            System.out.println("nilai "+i+" masuk dibagian tail dari linked list");
            list++;
        }
    }

    static void deletelast() {
        if(isempty())
            System.out.println("maaf, linked list kosong");
        else
        {
            node temp=head;
            System.out.println("nilai "+tail.nilai+" terhapus");
            for(int i=1;i<list-1;i++)
            {
                temp=temp.next;
            }            
            temp.next=temp.next.next;
            tail=temp;
            list--;
        }
    }

    static void display() {
        node temp=head;
        System.out.println("jumlah data dalam linked list "+list);
        while(temp!=null)
        {
            System.out.println("isi linked list :"+temp.nilai);
            temp=temp.next;
        }                        
    }    
    
    public static void main(String[] args) {
        
        Single_LinkedList_wtail a=new Single_LinkedList_wtail();
        a.insert(13);
        a.insert(3);
        a.insert(1);
        a.insert(2);
        a.display();       
        a.insertlast(9);
        a.display();
        a.deletelast();
        a.deletelast();
        a.display();
        
        
    }
}