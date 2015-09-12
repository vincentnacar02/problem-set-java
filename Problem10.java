import java.io.*;
public class Problem10{
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] monthList = {"","January","February","March","April","May","June","July","August","September","October","November","December"};
		
		System.out.print("Input:");
		String str = br.readLine();
		String[] part = str.split("/");
		int index = Integer.parseInt(part[0]);
		int day = Integer.parseInt(part[1]);
		if	(index>12){
			System.out.print("Invalid month");
			
		}else{
			String month = monthList[index];
			String result = getZodiac(month,day);
			System.out.print(result);
		}	
	}
	
	public static String getZodiac(String month,int day){
		String res = "";
		if(month=="March"){
			if(day>=21 && day<=31){
				res = "Aries";
			}else{
				res = "Pisces";
			}
		}
		if(month=="April"){
			if(day>=1 && day<=20){
				res = "Aries";
			}else{
				res = "Taurus";
			}
		}
		if(month=="May"){
			if(day>=1 && day<=20){
				res = "Taurus";
			}else{
				res = "Gemini";
			}
		}
		if(month=="June"){
			if(day>=1 && day<=20){
				res = "Gemini";
			}else{
				res = "Cancer";
			}
		}
		if(month=="July"){
			if(day>=1 && day<=20){
				res = "Cancer";
			}else{
				res = "Leo";
			}
		}
		if(month=="August"){
			if(day>=1 && day<=20){
				res = "Leo";
			}else{
				res = "Virgo";
			}
		}
		if(month=="September"){
			if(day>=1 && day<=20){
				res = "Virgo";
			}else{
				res = "Libra";
			}		
		}
		if(month=="October"){
			if(day>=1 && day<=20){
				res = "Libra";
			}else{
				res = "Scorpio";
			}
		}
		if(month=="November"){
			if(day>=1 && day<=20){
				res = "Scorpio";
			}else{
				res = "Sagittarius";
			}
		}
		if(month=="December"){
			if(day>=1 && day<=20){
				res = "Sagittarius";
			}else{
				res = "Capricorn";
			}
		}
		if(month=="January"){
			if(day>=1 && day<=20){
				res = "Capricorn";
			}else{
				res = "Aquarius";
			}
		}
		if(month=="February"){
			if(day>=1 && day<=20){
				res = "Aquarius";
			}else{
				res = "Pisces";
			}
		}
		return res;
	}
	
}