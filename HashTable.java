// hashtable basic:


Linear probing : when there is a collision, we try to find an empty cell sequentially and put the value into the nearest empty cell. However, this approach has an issue of forming the primary clusters and the performance can get really bad. For this, we need to keep load factor and, from time to time, we need to rehash. 

Seperate Chaing: the other workaround is to have a linked list at each index. This allows us to not worry about load factor too much. However, we also don't want to make linked list become too full either. 

Also, if the loader factor is too small, it may imply that we are wasting space. 
loadfactor: the number of items in the hashtable divided by the size of hashtable . 



// Hashtable node class

private class HashEntry {
	private String key; 
	private int value; 
	
	HashEntry (String key, int value) {
		this.key = key; 
		this.value = value; 
	}

	public String getKey(){
		return key; 	
	}

	public int getValue(){
		return value; 
	}
}



public class HashTable {

	private int length ; 
	private HashEntry[] hashArray; 
	private double numItem = 0;
	private int loadfactor = 0 ;  

	public void HashTable() {
		int defaultSize = 11; 
		hashArray = new HashEntry[defaultSize];
		length = defaultSize;  
	}


	public void HashTable(int size) {
		if (size <= 0) {
			throw new RuntimeException ("Invalid size! ");
		}

		hashArray = new HashEntry[size]; 
		length = size; 
	}

	public void insert (String key, int value) {

		// corner case; 
		
		loadfactor = numItem / length;

		// at this time load factor won't be able to be great than  
		if (loadfactor > 0.5) {
			rehash(); 
		}


		int hashcode  = hashFunc(key);
		while (hashArray[hashcode ] != null  ) 
			hashcode ++; 
			hashcode  = hashcode  % length; 
		}
		HashEntry  item = new HashEntry(key, value);
		hashArray[hashcode] = item; 
		
		
	}

	public int hashFunc (String key) {
		
		key = key.toLowerCase(); 
		int N = 27; 
		int hashCode = key.charAt(0) - 'a' + 1; 
		
		for (int i = 1; i < key.length(); i++){
			hashCode =(hashCode * N + (key.charAt(i) - 'a' + 1))%length;
		}

		hashCode = hashcode % length; 

		//make sure hashCode is smaller than the length; 
		return hashCode;
	
	}

	public boolean contains (String key) {
 
		if (getEntry(key) == null) {
			return false; 
		} else {
			return true; 
		}
	}

	public HashEntry getEntry(String key){
		int hashcode = hashFunc(key);
		HashEntry cur = hashArray[hashcode]; 

		while (cur!= null && !cur.getkey().equals(key){
			hashcode ++ ; 
			hashcode  = hashcode % length; 
			cur = hashArray[hashcode]; 	
		}

		if(cur == null) {
			return null; 
		} else {	
			return cur; 
		}
	}


	private void rehash(){
		
		int newlength  = 2 * length + 1; 
		
		HashEntry[] oldHashArray = hashArray ; 
		hashArray = new HashEntry[newlength];
		length = newlength; 
		
		// new array 
		for(int i = 0 ; i < oldHashArray.length; i++) {
			if (oldHashArray[i] != null) {
				insert(oldHashArray[i].getKey());
			}	
		}		

	}

	

}
















