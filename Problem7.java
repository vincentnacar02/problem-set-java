import java.io.*;
public class Problem7{

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input numeric value:");
		String str = br.readLine();
		char[] a = str.toCharArray();
		int num = 0;
		
		if (a.length < 3){
			System.out.print("OUT OF RANGE");
		}else{
			for(int i = 0;i < a.length;i++){
				
				  if(Character.isDigit(a[i]))
				  {
					  Character c1 = a[i];
					  String s1 = c1.toString();
					  int i1 = Integer.parseInt(s1);

					  num = num+i1;
				  }
			}

			System.out.println(num);			
		}
		
	}
}
