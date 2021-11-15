import java.util.*;
class Problem1{
	
	static int problem(int[] a, int[] b) {
		
		int result=0;
		for(int i = 0 ; i < a.length; i++) {
			result+=(a[i]*b[i]);
		}
		
		return result;
		
	}
	static int solution(String s) {
		int result;
		result=Integer.valueOf(s);
		return result;
	}
	static ArrayList solution(int[] arr) {
		ArrayList<Integer> result = new ArrayList<>();
		int num = arr[0];
		result.add(num);
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] !=num) {
				result.add(arr[i]);
				num = arr[i];
			}
			
			
		}
		return result;
	
}
}
class UpDown{
		static Random Ran=new Random();
		static int result=Ran.nextInt(100);
	static String Upd(int num) {
		if(result>num) {
			return "up";
		}
		else if(result<num) {
			return "down";
		}
		else if(result==num) {
			
			return "ok";
		}
		return "d";
			
	}
}
public class java20211009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[] a= new int[] {1,2,3,4};
		int[] b= new int[] {(-3),(-1),0,2};
		//1번문제
		System.out.println(Problem1.problem(a, b));
		//2번문제
		String s="1572";
		System.out.println(Problem1.solution(s));
		//3번문제
		int[] arr= {1,1,3,3,0,1,1};
		System.out.println(Problem1.solution(arr));
		
		
		int index=0; //4번문제
		
		while(index==10) {
			
		System.out.println("숫자를 입력하세요");
		
		int num=input.nextInt();
		
		UpDown.Upd(num);
		
		
		index++;
		}
		
	}

}
