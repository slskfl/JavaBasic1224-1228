import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 개의 *를 표시할까요?");
		int num = scan.nextInt();
		
		for(int i=0; i<num; i++){
			if(i%2==0) {
				System.out.print("*");
			} else if(i%2==1) {
				System.out.print("+");
			}
		}
		System.out.println();
		
		if(num>0) {
			int i = 0;
			while(i<num) {
				if(i%2==0) {
					System.out.print("*");
				}else {
					System.out.print("+");
				}
				i++;
			}
			System.out.println();
		}

	}

}
