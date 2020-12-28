import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 A : ");
		int a = sc.nextInt();
		System.out.print("정수 B : ");
		int b = sc.nextInt();
		System.out.print("정수 C : ");
		int c = sc.nextInt();
		int mid;
		
		if(a>=b) {
			if(b>=c) {
				mid=b;
			}else if(a<=c) {
				mid=a;
			}else {
				mid=c;
			}
		}else if(a>c) {
			mid=a;
		}else if(b>c) {
			mid=c;
		}else {
			mid = b;
		}

		System.out.println("중앙값은 " + mid + "입니다.");

	}

}
