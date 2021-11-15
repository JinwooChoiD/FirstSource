import java.util.*;
import java.time.*;
public class java20211010 {
	static void solution(int a,int b) {
		
		
		System.out.println(LocalDate.of(2016,a,b).getDayOfWeek().toString().substring(0, 3));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		java20211010.solution(a,b);
		
		}
	}


