import java.util.Random;
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �� �Դϱ�? : ");
		int month = scan.nextInt();
		
		/*if(month%13==12 || month%13==1 || month%13==2 ) {
			System.out.println("�ܿ�");
		}else if(month%13==3 || month%13==4 || month%13==5) {
			System.out.println("��");
		}else if(month%13==6 || month%13==7 || month%13==8) {
			System.out.println("����");
		}else if(month%13==9 || month%13==10 || month%13==11) {
			System.out.println("����");
		}else {
			System.out.println("�׷� ���� �����ϴ�.");
		}*/
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("��");
			break;
		case 6: case 7: case 8:
			System.out.println("����");
			break;
		case 9: case 10: case 11:
			System.out.println("����");
			break;
		case 12: case 1: case 2:
			System.out.println("�ܿ�");
			break;
		default:
			System.out.println("�׷� ���� �����ϴ�.");
			break;
	}

	}

}
