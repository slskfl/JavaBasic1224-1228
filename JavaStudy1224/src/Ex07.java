import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		 do{
			 System.out.print("������ : ");
			int num = scan.nextInt();
				
			if(num<0) {
				System.out.println("�� ���� �����Դϴ�.");
			}else if(num>=0) {
				System.out.println("�� ���� ����Դϴ�.");
			}
			System.out.print("�ٽ��ѹ�? 1-YES, 2-NO : ");
			int more = scan.nextInt();
			if(more==1) {
				continue;
			} else {
				break;
			}
		}while(true);
	}

}
