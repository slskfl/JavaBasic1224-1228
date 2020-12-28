import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("양의 정수값의 자릿수를 표시합니다.");
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수값 : ");
		int num = scan.nextInt();
		int count=0;
		do {
			num/=10;
			count++;
		}while(num>0);
		System.out.println("입력한 숫자는 " + count + "자리입니다.");
	}

}
