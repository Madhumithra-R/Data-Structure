import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size:");
        int n =sc.nextInt();
        int[] arr = new int[n+1];
        System.out.print("enter element to insert at beginning:");
        int newElement = sc.nextInt();
        System.out.print("enter " + n + " elements:");
        for(int i=0;i<n;i++){
            arr[i+1] = sc.nextInt();
        }
        arr[0] = newElement;
        for(int num:arr){
            System.out.print(num + " ");
        }
        sc.close();
        
    }
}
