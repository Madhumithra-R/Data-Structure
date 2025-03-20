import java.util.Scanner;
public class Main{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter array size:");
        int n = sc.nextInt();
        
        int[] arr = new int[n+1];
        System.out.print("enter " + n + " elements:");
        
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
            
        }
        System.out.print("enter elements to insert at the end:");
        arr[n]=sc.nextInt();
        
        System.out.print("updated array: ");
       
        for(int num: arr){
            System.out.print(num + " ");
        }
        sc.close();
        
       
    }
}
    
