import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int sum = 0;
        String str = sc.next();
        
        char[] A = str.toCharArray();
        
        for(int i=0 ; i<A.length ; i++){
            sum += A[i] - 48;
        }
        System.out.println(sum);
    }
}