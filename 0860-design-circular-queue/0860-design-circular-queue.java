class MyCircularQueue {
 private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    public MyCircularQueue(int k) {
        capacity=k;
        queue=new int[k];
        front=0;
        rear=-1;
        size=0;
    }
    public boolean enQueue(int value) {
        if (isFull()) 
            return false;
        rear=(rear+1)%capacity;
        queue[rear]=value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) 
            return false;
        front=(front + 1)%capacity;
        size--;
        return true;
    }
    public int Front() {
        if (isEmpty()) 
            return -1;
        return queue[front];
    }
    
    public int Rear() {
        if (isEmpty())
            return -1;
        return queue[rear];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==capacity;
    }
}

