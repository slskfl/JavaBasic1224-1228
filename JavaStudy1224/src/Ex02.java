import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.print("���� A : ");
		int a = sc.nextInt();
		System.out.println("���� B : ");
		int b = sc.nextInt();

		if(a==b) {
			System.out.println("�� ���� �����ϴ�.");
		}else {
			int min, max;
			if(a<b) {
				min=a;
				max=b;
			}else {
				min=b;
				max=a;
			}
			System.out.println("�������� "+ min +"�Դϴ�.");
			System.out.println("ū���� "+ max +"�Դϴ�.");

		}
		

	}

}
