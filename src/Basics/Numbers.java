package Basics;

public class Numbers {

	public static void main(String[] args) {
		int[] arr = {5,6,9,2,8,4};
		System.out.println("Maximum number in array is :");
		System.out.println(findMax(arr));
		System.out.println("Minimum number in array is :");
		System.out.println(findMin(arr));
		System.out.println("Average in array is :");
		System.out.println(findAvg(arr));
		

	}
	public static int findMax(int[] arr) {
		int max= arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		} return max;
	}
	public static int findMin(int[] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			
		} return min;
		
	}
	public static int findAvg(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum= sum+ arr[i];
		}return sum/arr.length ;
	} 

}
