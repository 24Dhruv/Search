import java.util.*;

 public class search{
    public static void main(String args[]){
int N = sc.nextInt();
int [] arr = new int[N];
  for(int i=0;i<N;i++){
      arr[i] = sc.nextInt();
    }
System.out.println("enter m");
 int M = sc.nextInt();
    for(int i=0;i<N;i++){
        if (arr[i]== M) {
            System.out.println(i);            
        }
    }
}}
