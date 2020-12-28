import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("몇 개의 *를 표시할까요?");
		int num = scan.nextInt();
		
		for (int i=0; i<num; i++) {
			System.out.print("*");
		}
		
		/*System.out.println();
		
		while(num>0) {
			System.out.print("*");
			num--;
			if (num==0) {
				break;
			}
		}*/
		
		System.out.println();
		
		do {
			System.out.print("*");
			num--;
		}while(num>0);
	}

}
