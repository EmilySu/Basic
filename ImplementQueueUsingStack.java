//implement two queue using two stacks

Public class Queue<E>{
    
    private Stack<E> inbox = new Stack<E>(); 
    private Stack<E> outbox = new Stack<E>(); 
    
    private void queue(E item){
        inbox.push(item);
    }

    private E dequeue(){
        if(outbox.isEmpty()){
            while(!inbox.isEmpty()){
                outbox.push(inbox.pop()); 
            }
        }
        return outbox.pop(); 
    }
}

