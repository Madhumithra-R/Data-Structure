import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Main{
    Node head;
    void add(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    void display()
    {
        if(head==null)
        {
            System.out.print("list is empty!");
        }
        else
        {
            Node temp = head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    void removeDuplicates()
    {
        Node temp = head;
        if(temp.data==temp.next.data)
        {
            temp.next=temp.next.next;
        }
        else{
            temp=temp.next;
        }
    }

    public static void main(String[] args){
            Main list = new Main();
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                int data=sc.nextInt();
                list.add(data);
            }
            list.display();
            System.out.println();
            list.removeDuplicates();
            list.display();
        }
    }
