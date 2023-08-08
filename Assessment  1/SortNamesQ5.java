package assessment2;

// Ascending order sort names
public class SortNamesQ5 {

	public static void main(String[] args) {
		String[] names = {"Manoj Kumar", "Tom Hanks", "Manoj Bajpayee", "Tom Cruise", "John Wick", "Alice Smith", "Alice Wonderland", "John Cena"};
//		String[] names = {"John", "Alice","Zack","Bella","Edward"};
		sort(names);
	}
	static void sort(String[] names) {
		for(int i = 0; i < names.length - 1; i++) {
			for(int j = i+1; j < names.length; j++) {
				if(names[i].compareTo(names[j]) > 0) {
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		for(int i = 0; i < names.length; i++) {
			 System.out.println(names[i]);
		}
	}

}
