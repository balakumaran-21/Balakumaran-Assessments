package assessment2;
// Minimum Jumps to reach the end
public class MinJumpsQ3 {

	public static void main(String[] args) {
		int[] arr = {1,3,5,8,9,2,6,7,6,8,9};
		int i = 0,count =0,index = 0;
		while(index <= arr.length) {
			if(index+arr[i+1] > index+arr[i] || index+arr[i] > arr.length) {
				index+=arr[i+1];
			}
			else {
				index+=arr[i];
			}
			count++;
			i++;
			
		}
		System.out.println(count);
	}

}
