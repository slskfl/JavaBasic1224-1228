import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
				
		System.out.println("카운트다운 합니다.");
		do {
			System.out.print("양의 정숫값 : ");
			num = sc.nextInt();
		}while(num<=0);

		while(num>=0) {
			System.out.println(num--);
		}

	}

}
