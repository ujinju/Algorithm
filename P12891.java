import java.util.*;
import java.io.*;

public class P12891 {
	
	static int[] myArr;
	static int[] checkArr;
	static int checkSecret;

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		int Result = 0;
		checkArr = new int[4];
		myArr = new int[4];
		char[] A = new char[S];
		checkSecret = 0;
		
		A = bf.readLine().toCharArray();
		st = new StringTokenizer(bf.readLine());
		for(int i=0 ; i <4 ; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if(checkArr[i] == 0) {
				checkSecret++;
			}
		}
		
		for(int i=0 ; i<P ; i++) { //부분문자열 처음 받을 때 세팅
			Add(A[i]);
		}
		
		if(checkSecret == 4) {
			Result++;
		}
		
		//슬라이딩 윈도우
		for(int i=P ; i<S ; i++) {
			int j = i - P; //윈도우 범위를 유지하면서 이동 i가 끝 포인트, j가 시작 포인트
			Add(A[i]);
			Remove(A[j]);
			if(checkSecret == 4) Result++;
		}
		
		System.out.println(Result);
		bf.close();
	}

	private static void Remove(char c) {
		switch(c) {
			case 'A':
				if(myArr[0] == checkArr[0]) checkSecret--;
				myArr[0]--;
				break;
			case 'C':
				if(myArr[1] == checkArr[1]) checkSecret--;
				myArr[1]--;
				break;
			case 'G':
				if(myArr[2] == checkArr[2]) checkSecret--;
				myArr[2]--;
				break;
			case 'T':
				if(myArr[3] == checkArr[3]) checkSecret--;
				myArr[3]--;
				break;
		}
		
	}

	private static void Add(char c) {
		switch(c){
			case 'A':
				myArr[0]++;
				if(myArr[0] == checkArr[0]) checkSecret++; // >= 는 안됨.
				break;
			case 'C':
				myArr[1]++;
				if(myArr[1] == checkArr[1]) checkSecret++; 
				break;
			case 'G':
				myArr[2]++;
				if(myArr[2] == checkArr[2]) checkSecret++; 
				break;
			case 'T':
				myArr[3]++;
				if(myArr[3] == checkArr[3]) checkSecret++; 
				break;
		}
		
	}

}
