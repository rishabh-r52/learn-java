package stacks;
// Packages this class under the package stacks

import java.util.Scanner;
// Imports the Scanner class so we can take inputs in our program

public class stackops {
    public static void main(String args[]){
        Scanner scMain = new Scanner(System.in);
        // Scanner scMain for taking inputs throughout the program

        System.out.print("Enter Stack Size: ");
        stack stack1 = new stack(scMain.nextInt());
        // Reads the stack size and initializes our stack using constructor stackclass

        while(true){
            System.out.println("\n1. PUSH\n2. POP\n3. DISPLAY\n4. Exit");
            // Menu for traversing through different features of this program
            switch(scMain.nextInt()){
                case 1:
                    System.out.print("\nElement to PUSH: ");
                    stack1.push(scMain.nextInt());
                    // Will read int input from scMain and directly send to push method
                    break;
                case 2:
                    stack1.pop();
                    // Will move the topmost element to stack1.popped and reduce top by 1
                    // int item = stack1.popped;
                    // Can use the above line to access the popped element
                    break;
                case 3:
                    stack1.display();
                    break;
                case 4:
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