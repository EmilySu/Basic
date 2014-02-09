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
		for(int i = 0; i< arr.length-1; i++){
			int min = i; 
			for(int j = i+1; j < arr.length; j++){
				if(arr[j]<arr[min]) min = j; 
			}
			swap(arr, i,min); 
		}
	}

	public static void swap(int[] arr, int i , int j){
		int temp = arr[i]; 
		arr[i] = arr[j]; 
		arr[j] = temp; 
	}
}




