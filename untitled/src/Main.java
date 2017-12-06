import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static String array[] = new String [10];
    Scanner scanInput = new Scanner(System.in); // scanner to get input
    public static void main(String[] args) {
        displaymenu();
    }
    private static void displaymenu(){
        int choice;
        Scanner scanInput = new Scanner(System.in);
        System.out.print("1. Add name " + '\n' +"2.Display name " + '\n' +"3. Quit" + '\n');
        System.out.print("Enter your choice");
        choice = scanInput.nextInt();
        if (choice <1 || choice >3){
            System.out.print("Invalid choice - please re-enter");
        }
        if(choice ==1){
            addname();
        }
        if (choice ==2){
            displaylist();
        }

        if (choice ==3){
            quit();
        }
    }
    private static void addname(){
        String name;
        int choice;
        int position;
        Scanner scanInput = new Scanner(System.in);
        System.out.print("Enter a name to be added to the list");
        name = scanInput.nextLine();
        System.out.print("Enter a position in the list to add the name");
        position = scanInput.nextInt();
        if (position <1 || position >10){
            System.out.print("Error, please re-enter the position");
            position = scanInput.nextInt();
        }

        if (position >= 1 && position <=10){
            array[position -1] = name;
            System.out.print("Would you like to insert another name?" + '\n'+ "1. Yes" + '\n'+"2.No");
            choice = scanInput.nextInt();
            if (choice ==1){
                addname();
            }
            if (choice ==2){
                displaymenu();
            }
        }
    }
    private static void displaylist(){
        System.out.println(Arrays.toString(array));
        displaymenu();
    }
    private static void quit(){
        System.out.print("Program terminating");
    }
}
