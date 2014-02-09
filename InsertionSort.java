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
		
//		System.out.print(StringToInt("124"));
	}
	
	public static void  sort(int[] arr){
		for (int i = 1 ; i < arr.length  ; i++){
			int temp = arr[i]; 
			int j = i ; 
			while (j > 0 && arr[j - 1] > arr[j]){
				arr[j] = arr[j-1]; 
				j--; 
			}
			arr[j] = temp; 
		}
	}
	
	
	public static void swap(int[] arr, int i , int j){
		int temp = arr[i]; 
		arr[i] = arr[j];
		arr[j] = temp; 
	}
	

	   

	
}
