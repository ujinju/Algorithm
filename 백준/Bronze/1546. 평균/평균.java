import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int sum = 0;
        int max = 0;
        for(int i=0 ; i<N ; i++){
            int temp = sc.nextInt();
            sum += temp;
            if(temp > max){
                max = temp;
            }
        }
        
        System.out.println(sum*100.0/max/N);
    }
}