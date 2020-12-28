import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 A : ");
		int a = sc.nextInt();
		System.out.println("정수 B : ");
		int b = sc.nextInt();
		
	/*	System.out.println("a>=b가 되도록 정렬했습니다.");
		if(a<b) {
			System.out.println("변수 A는 "+b+"입니다.");
			System.out.println("변수 B는 "+a+"입니다.");
		} else {
			System.out.println("변수 A는 "+a+"입니다.");
			System.out.println("변수 B는 "+b+"입니다.");
		}*/
		
		if(a<b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		System.out.println("a>=b가 되도록 정렬했습니다.");
		System.out.println("변수 A는 "+ a +"입니다.");
		System.out.println("변수 B는 "+ b +"입니다.");

	}

}
