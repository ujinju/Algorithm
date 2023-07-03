import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659{
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        
        long[] sum = new long[N+1];
        for(int i=1 ; i<=N ; i++){
            sum[i] = sum[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        
        for(int m=0 ; m<M ; m++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(sum[j] - sum[i-1]);
        }
    }
}