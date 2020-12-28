import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("세 자리 정수값 :");
			num = scan.nextInt();
			if(num<100 || num>999) {
				continue;
			} else {
				System.out.println("입력한 값은 "+ num + "입니다.");
				break;
			}
		}while(true);
		
		/*do {
			
			System.out.print("세 자리의 정숫값: ");
			num = sc.nextInt();
		}while(num<100 || num>999);
		System.out.println("입력한 값은 " + num + "입니다.");
		*/

		
	}

}
