import java.util.*;
class Main{
    static class Node{
        int data;
        Node nxt;
    }
    public static void insert(Node head){
        Node obj = new Node();
        Scanner sc = new Scanner(System.in);
        obj.data = sc.nextInt();
        obj.nxt = head.nxt;
        head.nxt = obj;
    }
    public static void display(Node head){
        Node p = head.nxt;
        int sum = 0;
        while(p!=null){
            if(p.data!=0){
                if((p.data%2)!=0){
                    sum = sum+p.data;
                }
            }
            p = p.nxt;
        }
        System.out.print("odd nums addition:"+sum);
    }
    public static void main(String [] args){
        Node head = new Node();
        head.nxt = null;
        System.out.print("enter no.of elements:");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            insert(head);
        }
        display(head);
    }
}