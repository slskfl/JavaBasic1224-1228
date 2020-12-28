import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("몇 개의 *를 표시할까요? : ");
		int num = sc.nextInt();
		
		if(num>0) {
			int i = 0;
			while(i<num/2) {
				System.out.print("*+");
				i++;
			}
			if(num%2==1) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
