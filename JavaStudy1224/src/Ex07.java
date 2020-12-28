import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		 do{
			 System.out.print("정수값 : ");
			int num = scan.nextInt();
				
			if(num<0) {
				System.out.println("이 값은 음수입니다.");
			}else if(num>=0) {
				System.out.println("이 값은 양수입니다.");
			}
			System.out.print("다시한번? 1-YES, 2-NO : ");
			int more = scan.nextInt();
			if(more==1) {
				continue;
			} else {
				break;
			}
		}while(true);
	}

}
