import java.util.Random;
import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int num = rand.nextInt(3); 	
		int check;
		
		/*if(num%3==0) {
			check=num%3;
			System.out.println("��ǻ�Ͱ� �� ��: ����" + check);
		} else if(num%3==1) {
			check=num%3;
			System.out.println("��ǻ�Ͱ� �� ��: ����" + check);
		} else if(num%3==2) {
			check=num%3;
			System.out.println("��ǻ�Ͱ� �� ��: ��" + check);
		} */
		
		switch(num) {
		case 0:
			System.out.println("����");
			break;
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("��");
			break;
		}
		System.out.print("��ǻ�Ͱ� �� �� : ");
	}

}
