import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� A : ");
		int a = sc.nextInt();
		System.out.print("���� B : ");
		int b = sc.nextInt();
		System.out.print("���� C : ");
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

	
		System.out.println("a<=b<=c�� �ǵ��� �����߽��ϴ�.");
		System.out.println("���� A�� "+ a +"�Դϴ�.");
		System.out.println("���� B�� "+ b +"�Դϴ�.");
		System.out.println("���� C�� "+ c +"�Դϴ�.");

	}

}
