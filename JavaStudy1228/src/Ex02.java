import java.util.Random;
import java.util.Scanner;


public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int com = 10 + rand.nextInt(90);
		System.out.println("���� ���߱� ���� ����!");
		System.out.println("10���� 99������ ���ڸ� ���߼���.");
		
		int user;
		do {
			System.out.print("� �����ϱ�? ");
			user = sc.nextInt();
			if(user>com) {
				System.out.println("�� ���� �����Դϴ�.");
			}else if(user<com) {
				System.out.println("�� ū �����Դϴ�.");
			}
		}while(com != user);
		
		System.out.println("�����Դϴ�.");

	}

}
