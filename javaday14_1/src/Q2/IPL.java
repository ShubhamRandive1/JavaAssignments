package Q2;

import java.util.Scanner;

public class IPL {
	
	public void hometeamStadium(Stadium stadium) {
		
		switch(stadium.toString()) {
		
		case "EDEN_GARDENS_STADIUM":
			System.out.println("This is the home ground of KKR");
			break;
		
		case "WANKHEDE_STADIUM":
			System.out.println("This is the home ground of mumbai indians");
			break;
			
		case "CHIDAMBARAM_STADIUM":
			System.out.println("This is the home ground of CSK");
			break;
			
		case "M_CHINNASWAMY_STADIUM":
			System.out.println("This is home ground of RCB");
			break;
	}
}
	
	
	public static void main(String[] args) {
		
		IPL ipl = new IPL();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr the Stadium name you want to watch match");
		
		String stadiumNme = sc.next();
		
		sc.close();
		
		Stadium stadium = Stadium.valueOf(stadiumNme);
		
		ipl.hometeamStadium(stadium);
		
		
	}
	

}
