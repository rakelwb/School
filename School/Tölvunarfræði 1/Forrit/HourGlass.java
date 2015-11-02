
public class HourGlass{

	public static void main (String[] args){
		int n = Integer.parseInt(args[0]);
		boolean rerun = true;
		String stars = "";
		String spaces = " ";

		for (int i = n; i > 0; i--) {

			if(rerun == true){ 
				stars = new String(new char[n-i]).replace("\0", " ");
				spaces = new String(new char[i-1]).replace("\0", "**");
				System.out.print(stars);
				System.out.println(spaces + "*"); //afhv er + "*"?
			}

			if(rerun == false)  {

				spaces = new String(new char[n-i]).replace("\0", "**");
				stars = new String(new char[i-1]).replace("\0", " ");
				System.out.print(stars);
				System.out.println(spaces + "*");		
			}


			if(i == 1 && rerun == true){
				rerun = false;
				i = n;
			}			
		}
	}
}

