import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
				
		System.out.println("ī��Ʈ�ٿ� �մϴ�.");
		do {
			System.out.print("���� ������ : ");
			num = sc.nextInt();
		}while(num<=0);

		while(num>=0) {
			System.out.println(num--);
		}

	}

}
