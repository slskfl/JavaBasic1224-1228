import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("�� �ڸ� ������ :");
			num = scan.nextInt();
			if(num<100 || num>999) {
				continue;
			} else {
				System.out.println("�Է��� ���� "+ num + "�Դϴ�.");
				break;
			}
		}while(true);
		
		/*do {
			
			System.out.print("�� �ڸ��� ������: ");
			num = sc.nextInt();
		}while(num<100 || num>999);
		System.out.println("�Է��� ���� " + num + "�Դϴ�.");
		*/

		
	}

}
