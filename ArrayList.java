// how arraylist works as a dynamic array

public boolean add(E e){
    ensureCapacity(size+1);
    elementData[size++] = e; 
    return true; 
}


public void ensureCapacity(int minCapacity){

    int oldCapacity = elementData.length; 
    if(minCapacity>oldCapacity){
        Object oldData = elementData; 
        int newCapacity = oldCapacity*3/2+1; 
        elementData = Arrays.copyOf(elementData, newCapacity);
    }
}
