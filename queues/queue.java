public class queue{
    int front=0;
    int rear=-1;
    int queue[];

    // queue constructor method used to initialize our queue array
    queue(int size){
        queue = new int[size];
    }

    // enqueue method is used to store a new item at the rear of the queue
    void enqueue(int item){
        if(rear == (queue.length-1)){
            System.out.println("Queue overflow!");
            return;
            // Will return without enqueue if queue is full
        }
        queue[++rear] = item;
        // pre increment the rear and store the item into queue
    }

    void dequeue(){
        if(front == (rear + 1)){
            System.out.println("Queue underflow!");
            return;
            // Will return without dequeue if queue is empty
        }
        System.out.println("Element DeQueued: "+queue[front++]);
    }

    void display(){
        if( (rear == -1) || (front == (rear + 1)) ){
            System.out.println("Queue is empty!");
            return;
            // Will return without printing if queue is empty
        }
        System.out.println("\nQueue Elements:");
        for(int i=front;i<=rear;i++)
            System.out.print(queue[i]+"\t");
        // Will print all queue items in front to rear order
    }

    int peek(){
        if( (rear == -1) || (front == (rear + 1)) ){
            System.out.println("Queue is empty!");
            return 0;
            // Will return 0 as fail code if queue is empty
        }
        return queue[front];
    }

    void reset(){
        front = 0;
        rear = -1;
        for (int i=0;i<queue.length;i++){
            queue[i] = 0;
        }
        System.out.println("Queue has been reset!");
    }
}