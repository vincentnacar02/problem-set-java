import java.io.*;
public class Problem8{
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int highest = 0;
		int lowest = 0;
		
		for (int i = 1; i <= 3; i++){
			System.out.print("Input num "+i+":");
			int num = Integer.parseInt(br.readLine());
			
			if(i==1){
				lowest = num;
				highest = num;
			}
			
			if(num >= highest){
				highest = num;
			}else if(num < lowest){
				lowest = num;
			}
			
		}
		System.out.println("Highest:"+highest);
		System.out.println("Lowest:"+lowest);
		
		
	}

}