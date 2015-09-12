import java.io.*;

public class Problem6{
	

	public static void main(String[] args) throws Exception {
		
		int month,day,year;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] monthList = {"","January","February","March","April","May","June","July","August","September","October","November","December"};
		
		System.out.print("Input numeric month:");
		month = Integer.parseInt(br.readLine());
		System.out.print("Input numeric day:");
		day = Integer.parseInt(br.readLine());
		System.out.print("Input year:");
		year = Integer.parseInt(br.readLine());
		
		if(month>12){
			System.out.print("Invalid");
		}else{
			System.out.print(monthList[month]+","+day+" "+year);
		}
		
	}
	
}