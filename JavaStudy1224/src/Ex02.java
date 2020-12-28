import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 A : ");
		int a = sc.nextInt();
		System.out.println("정수 B : ");
		int b = sc.nextInt();

		if(a==b) {
			System.out.println("두 값이 같습니다.");
		}else {
			int min, max;
			if(a<b) {
				min=a;
				max=b;
			}else {
				min=b;
				max=a;
			}
			System.out.println("작은값은 "+ min +"입니다.");
			System.out.println("큰값은 "+ max +"입니다.");

		}
		

	}

}
