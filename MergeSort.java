import java.util.HashMap;

import javax.swing.tree.TreeNode;



public class test2 {

	public test2() {
		// TODO Auto-generated constructor stub
	}

	public static void main (String[] args){
		int[] arr = {1,3,2,4,9,6};
		sort(arr);
		
		for(int i : arr){
			System.out.print(i+","); 
		}
	}
	
	public static void sort(int[] arr){
		mergeSort(arr, 0, arr.length - 1); 
	}
	
	public static void mergeSort(int[] arr, int start, int end ){
		
		if (start >= end){
			return; 
		}
		
		int mid = start + (end - start) / 2; 
		
		mergeSort(arr, start, mid); 
		mergeSort(arr, mid + 1, end); 
		merge(arr, start, mid, end); 
		
	}
	
	public static void merge(int[] arr, int start, int mid, int end){
		int[] A = new int[end - start + 1]; 
		int i = start, j = mid + 1, k = 0; 
		
		while (i <= mid && j <= end) {
			if(arr[i] > arr[j]) {
				A[k++] = arr[j++];  
			} else {
				A[k++] = arr[i++]; 
			}
		}
		
		while(i <= mid) {
			A[k++] = arr[i++]; 
		}
		
		while(j <= end) {
			A[k++] = arr[j++]; 
		}
		
		for (int m = 0; m < A.length; m++){
			arr[start+m] = A[m]; 
		}
	}
}







