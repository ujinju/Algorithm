import java.util.Scanner;

public class P1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i=0 ; i<N ; i++) {
			A[i] = sc.nextInt();
		}
		
		int sum = 0;
		int mNum = 0;
		for(int i=0 ; i<N ; i++) {
			sum += A[i];
			if(A[i] > mNum) {
				mNum = A[i];
			}
		}
		
		System.out.println(sum*100.0/mNum/N);

	}

}
