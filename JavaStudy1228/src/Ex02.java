import java.util.Random;
import java.util.Scanner;


public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int com = 10 + rand.nextInt(90);
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("10부터 99사이의 숫자를 맞추세요.");
		
		int user;
		do {
			System.out.print("어떤 숫자일까? ");
			user = sc.nextInt();
			if(user>com) {
				System.out.println("더 작은 숫자입니다.");
			}else if(user<com) {
				System.out.println("더 큰 숫자입니다.");
			}
		}while(com != user);
		
		System.out.println("정답입니다.");

	}

}
