package assessment2;
 // Q1 Marathon
import java.util.*;

public class MarathonQ1 {

	public static void main(String[] args) {
		System.out.println("Enter a starting distance:");
		Scanner input = new Scanner(System.in);
		
		int distance = input.nextInt();
		while(distance < 5 || distance > 8) {
			if(distance >=5 && distance <=8) {
				break;
			}
			System.out.println("Sorry, Choose between 5km to 8km");
			System.out.println("Enter a starting distance:");
			distance = input.nextInt();
		}
		for(int i = distance; i >= 0; i--) {
			if(i!=0)
			System.out.println("Disance to run: "+i);
			if(i == distance - 1) {
				System.out.println("Good Start, Keep it up!");
			}
			else if(i <=3 && i > 0) {
				System.out.println("Almost There!");
			}
			if(i == 0) {
				System.out.println("Done for the day!");
			}
		}
	}
}

