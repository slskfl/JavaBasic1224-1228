import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("���� �������� �ڸ����� ǥ���մϴ�.");
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ������ : ");
		int num = scan.nextInt();
		int count=0;
		do {
			num/=10;
			count++;
		}while(num>0);
		System.out.println("�Է��� ���ڴ� " + count + "�ڸ��Դϴ�.");
	}

}
