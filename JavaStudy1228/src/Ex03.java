import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 A : ");
		int a = sc.nextInt();
				
		System.out.print("정수 B: ");
		int b = sc.nextInt();
		if(a>b) {
					int temp = a;
					a = b;
					b = temp;
		}
		
		do {
			System.out.print(a + " ");
			a= a + 1; 
			//a++; 
			//++a;
		}while(a<=b);
		
		System.out.println();


	}

}
