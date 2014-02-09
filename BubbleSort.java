import java.util.ArrayList;

public class Test {

	public static void main(String[] args){
		int[] arr = {1,5,4,2,3}; 
		bubbleSort(arr); 
		for(int k : arr){
			System.out.print(k+" ");
		}

	}

	public static void bubbleSort(int[] arr){
		for(int i = arr.length-1; i>=0; i--){
			for(int j = 0; j <i; j++){
				if(arr[j]>arr[j+1]) swap(arr, j, j+1); 
			}
		}
	}

	public static void swap(int[] arr, int i , int j){
		int temp = arr[i]; 
		arr[i] = arr[j]; 
		arr[j] = temp; 
	}
}




