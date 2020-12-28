import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 A : ");
		int a = sc.nextInt();
		System.out.print("정수 B : ");
		int b = sc.nextInt();
		System.out.print("정수 C : ");
		int c = sc.nextInt();
		
		if(a>b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if(b>c) {
			int temp = b;
			b = c;
			c = temp;
		}
		if(a>b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if(a>c) {
			int temp = a;
			a = c;
			c = temp;
		}

	
		System.out.println("a<=b<=c가 되도록 정렬했습니다.");
		System.out.println("변수 A는 "+ a +"입니다.");
		System.out.println("변수 B는 "+ b +"입니다.");
		System.out.println("변수 C는 "+ c +"입니다.");

	}

}
