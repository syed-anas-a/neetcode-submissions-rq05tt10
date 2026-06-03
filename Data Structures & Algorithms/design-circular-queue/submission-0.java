class MyCircularQueue {

    int size;
    int[] arr;
    int front;
    int rear;
    int currSize;

    public MyCircularQueue(int k) {
        this.size = k;
        this.arr = new int[k];
        this.front = 0;
        this.rear = -1;
        this.currSize = 0;
    }
    
    public boolean enQueue(int value) {
        if(currSize == size) {
            return false;
        }
        rear = (rear+1) % size;
        arr[rear] = value;
        currSize++;
        return true;
    }
    
    public boolean deQueue() {
        if(currSize == 0) {
            return false;
        }
        front = (front+1) % size;
        currSize--;
        return true;
    }
    
    public int Front() {
        if(currSize == 0) {
            return -1;
        }
        return arr[front];
    }
    
    public int Rear() {
        if(currSize == 0) {
            return -1;
        }
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return currSize == 0;
    }
    
    public boolean isFull() {
        return currSize == size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */