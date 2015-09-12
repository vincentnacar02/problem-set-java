import java.io.*;
public class Problem9{
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Input numeric value:");
		int num = Integer.parseInt(br.readLine());
		
		
		if(num >= 0){
			System.out.print("Positive,");
		}else{
			System.out.print("Negative,");
		}
		
		if ( num % 2 == 0 ){
			System.out.print("Even,");
		}else{
			System.out.print("Odd,");
		}
		if (num < 100){
			System.out.print("Less than 100 , Not 3-digit Number");
		}else{
			if(num == 100){
				System.out.print("Equal 100 , 3-digit Number");
			}else{
				System.out.print("Greater than 100 , 3-digit Number");		
			}
		}
		
	}
}