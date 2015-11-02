
public class HourGlass{

	public static void gar(int n){
		boolean rerun = true;
		String stars = "";
		String spaces = " ";
		for (int i = n; i >= 0; i--) {

			if(rerun == true){ 
				spaces = new String(new char[i]='g');//.replace("\0", "**");
				stars = new String(new char[n-i+1]).replace("\0", " ");
				System.out.println(spaces + "*"); //afhv er + "*"?
				System.out.print(stars);
			}

			if(rerun == false) 
				//hvad a ad koma herna?





			//hvad gerir tessi if-skipun?
			//afhv tarf hun ad vera herna en ekki annarstadar? fx linu 9
			if(i == 0 && rerun == true){
				rerun = false;
				i = n;
			}			
		}
	}

	public static void main(String[] args) {
		gar(5);
	}
}
