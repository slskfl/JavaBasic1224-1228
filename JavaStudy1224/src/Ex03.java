import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� A : ");
		int a = sc.nextInt();
		System.out.println("���� B : ");
		int b = sc.nextInt();
		
	/*	System.out.println("a>=b�� �ǵ��� �����߽��ϴ�.");
		if(a<b) {
			System.out.println("���� A�� "+b+"�Դϴ�.");
			System.out.println("���� B�� "+a+"�Դϴ�.");
		} else {
			System.out.println("���� A�� "+a+"�Դϴ�.");
			System.out.println("���� B�� "+b+"�Դϴ�.");
		}*/
		
		if(a<b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		System.out.println("a>=b�� �ǵ��� �����߽��ϴ�.");
		System.out.println("���� A�� "+ a +"�Դϴ�.");
		System.out.println("���� B�� "+ b +"�Դϴ�.");

	}

}
