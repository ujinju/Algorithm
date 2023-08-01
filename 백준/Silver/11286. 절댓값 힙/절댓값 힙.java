import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2) -> {
			
			int first_abs = Math.abs(o1);
			int second_abs = Math.abs(o2);
			
			if(first_abs == second_abs) { //절댓값이 같은 경우 음수 우선
				return o1 > o2 ? 1 : -1; //만약 o1이 o2보다 크면 1을 리턴 아니면 -1을 리턴
			} else {
				return first_abs - second_abs; //절댓값 작은 데이터 우선
			}
			
		});
		for(int i=0 ; i<N ; i++) {
			int request = Integer.parseInt(br.readLine());
			if(request != 0) {
				myQueue.add(request);
			} else {
				if(myQueue.isEmpty()) {
					System.out.println("0");
				} else {
					System.out.println(myQueue.poll());
				}
			}
		}
	}

}
