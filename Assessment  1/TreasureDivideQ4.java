package assessment2;

// Treasure subarray
public class TreasureDivideQ4 {

	public static void main(String[] args) {
//		int[] treasure = {1,5,11,5};
		int[] treasure = {1,5,3};
		int totalTreasure = 0;
		for(int i = 0; i < treasure.length; i++) {
			totalTreasure += treasure[i];
		}
		System.out.println((totalTreasure % 2 == 0)?"True":"False");
	}

}
