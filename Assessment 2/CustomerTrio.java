package assessment3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

interface MenuItem{
	static Scanner input = new Scanner(System.in);
	public String item = "";
	public double price = 0.00;
}

class Sandwich implements MenuItem{
	static public String[] items = {"cheeseBurger","Club Sandwich"};
	static public double[] prices = {2.75,1.25};
	Sandwich(){
		System.out.println("1. " + items[0]+  " "+ prices[0]);
		System.out.println("2. " + items[1]+  " "+ prices[1]);
	}
}

class Salad implements MenuItem{
	static public String[] items = {"SpinachSalad","Colesaw"};
	static public double[] prices = {1.15,3.50};
	Salad(){
		System.out.println("1. " + items[0]+  " "+ prices[0]);
		System.out.println("2. " + items[1]+  " "+ prices[1]);
	}
}

class Drink implements MenuItem{
	static public String[] items = {"OrangeSoda","Capuchino"};
	static public double[] prices = {1.25,2.30};
	Drink(){
		System.out.println("1. " + items[0]+  " "+ prices[0]);
		System.out.println("2. " + items[1]+  " "+ prices[1]);
	}
}

class Trio implements MenuItem{
	public Trio(){
		System.out.println("Choose menu from above");
		int c = input.nextInt();
		c-=1;
		if(c == 0) {
			System.out.print(Sandwich.items[0]+ '/' + Salad.items[0]+ '/' + Drink.items[0]+"\n");
			System.out.println("$4.00");
		}
		if(c == 1) {
			System.out.print(Sandwich.items[1]+ '/' + Salad.items[1]+ '/' + Drink.items[1]+"\n");
			System.out.println("$6.25");
		}
	}
}
public class CustomerTrio {

	public static void main(String[] args) {
		new Sandwich();
		new Salad();
		new Drink();
		new Trio();
	}

}
