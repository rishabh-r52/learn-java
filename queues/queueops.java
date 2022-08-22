import java.util.Scanner;
// Imports the Scanner class so we can take inputs in our program

public class queueops {
    public static void main(String args[]){
        Scanner scMain = new Scanner(System.in);
        // Scanner scMain for taking inputs throughout the program

        System.out.print("Enter queue Size: ");
        queue queue1 = new queue(scMain.nextInt());
        // Reads the queue size and initializes our queue using constructor queue

        while(true){
            System.out.println("\n1. Enqueue\n2. Dequeue\n3. Peek (Front element)\n4. Reset\n5. Display\n6. Exit");
            // Menu for traversing through different features of this program
            switch(scMain.nextInt()){
                case 1:
                    System.out.print("\nElement to Enqueue: ");
                    queue1.enqueue(scMain.nextInt());
                    // Will increment the rear index by 1 and add an item to the rear of the queue
                    break;
                case 2:
                    queue1.dequeue();
                    // Will remove an element from the front of the queue and increment front index by 1
                    break;
                case 3:
                    int peeked = queue1.peek();
                    if(peeked != 0)
                        System.out.println("Peeked: "+peeked);
                    break;
                case 4:
                    queue1.reset();
                    break;
                case 5:
                    queue1.display();
                    break;
                case 6:
                    scMain.close();
                    // Closes the scMain Scanner
                    System.exit(0);
                    // Exit the program with code 0 indicating normal exit
                default:
                    System.out.println("Invalid input!");
                    // Incase the user inputs a value other than given case numbers
            }
        }

        // End of main method
    }
    // End of class
}
// End of program