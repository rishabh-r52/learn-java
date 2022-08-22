package stacks;
// Packages this class under the package stacks

public class stack{
    int top=-1;
    int stack[];
    int popped;
    // Popped variable is used to store the last popped element
    // It is not currently in use, For future purposes

    // stack constructor method used to initialize our stack array
    stack(int size){
        stack = new int[size];
    }

    // push method is used to store a new item to the top of the stack
    void push(int item){
        if(top == (stack.length-1)){
            System.out.println("Stack overflow!");
            return;
            // Will return without pushing if stack is full
        }
        stack[++top] = item;
        // pre increment the top and store the item into stack
    }

    void pop(){
        if(top == -1){
            System.out.println("Stack underflow!");
            return;
            // Will return without popping if stack is empty
        }
        popped = stack[top--];
        // store the topmost item into popped and post decrement the top
        System.out.println("Element POPPED: "+popped);
    }

    void display(){
        if(top == -1){
            System.out.println("Stack empty!");
            return;
            // Will return without printing if stack is empty
        }
        System.out.println("\nStack Elements:");
        for(int i=top;i>=0;i--)
            System.out.println(stack[i]);
        // Will print all stack items in top to bottom order
    }
}