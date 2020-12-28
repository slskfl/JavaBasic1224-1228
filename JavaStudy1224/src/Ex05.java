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
			System.out.println("컴퓨터가 낸 것: 가위" + check);
		} else if(num%3==1) {
			check=num%3;
			System.out.println("컴퓨터가 낸 것: 바위" + check);
		} else if(num%3==2) {
			check=num%3;
			System.out.println("컴퓨터가 낸 것: 보" + check);
		} */
		
		switch(num) {
		case 0:
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		case 2:
			System.out.println("보");
			break;
		}
		System.out.print("컴퓨터가 낸 것 : ");
	}

}
