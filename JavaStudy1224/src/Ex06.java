import java.util.Random;
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 월 입니까? : ");
		int month = scan.nextInt();
		
		/*if(month%13==12 || month%13==1 || month%13==2 ) {
			System.out.println("겨울");
		}else if(month%13==3 || month%13==4 || month%13==5) {
			System.out.println("봄");
		}else if(month%13==6 || month%13==7 || month%13==8) {
			System.out.println("여름");
		}else if(month%13==9 || month%13==10 || month%13==11) {
			System.out.println("가을");
		}else {
			System.out.println("그런 월을 없습니다.");
		}*/
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("그런 월은 없습니다.");
			break;
	}

	}

}
