package project1.pkg1;

/*
 * @author Ayahn
 */

import java.util.Scanner;
/*
 * @author Alex Yahn
 * Project Name: Pet Database
 */
public class Project11 {

   static String[] names = new String[1000];
   static String[] ages = new String[1000];
   static Scanner input = new Scanner(System.in);
   static int counter = 0;
   
   public static void main(String[] args) {
       System.out.println("Pet Database Program.");
       while(true) {
           System.out.println("What would you like to do?\n" +
                   " 1) View all pets\n" +
                   " 2) Add more pets\n" +
                   " 5) Search pets by name\n" +
                   " 6) Search pets by age\n" +
                   " 7) Exit program");
           System.out.print("Your choice: ");
           
           int choice = input.nextInt();
           
           switch(choice) {
           case 1:
               display();
               break;
           case 2:
               add();
               break;
           case 5:
               searchName();
               break;
           case 6:
               searchAge();
               break;
           case 7:
               System.out.println("\nGoodbye!");
               System.exit(0);
               break;
           }
       }
   }
   
      private static void display() {
       System.out.println("+-----------------------+" + 
               "\n| ID |  NAME     |  AGE |" + 
               "\n+-----------------------+");
       for(int i = 0; i < counter; i++) {
           System.out.println("|  " + i + " | \t"  + names[i] + "\t" + "|  " + ages[i] + "   |");
       }
       System.out.println("+-----------------------+\n");
       System.out.println(counter + " rows in set.\n\n");
      }
   
   
      private static void add() {
       Scanner input = new Scanner(System.in);
       int count = 0;    
       while(counter <= 4) {
           System.out.print("add pet (name, age):");
           String entry = input.nextLine();
           String[] arr = entry.split(" ");
           String name = arr[0];
           String age = arr[1];
          
           if(arr.length != 2) {
               System.out.println("Error:" + entry + " is not a valid input");
               break;
           }
           else{
                names[counter] = name;
                ages[counter] = age;
                count++;
                counter++;
           }

       }
       
       if(count == counter) {
           System.out.println(counter + " pets added");
       }
   }
      
    private static void searchName() {
        Scanner input = new Scanner(System.in);
            System.out.println("Enter a name to search:");
            String nChoice = input.nextLine();
            for(int i = 0; i < names[counter].length(); i++) {
                if (names[counter].equals(nChoice)) {
                System.out.println("+-----------------------+" + 
               "\n| ID |  NAME     |  AGE |" + 
               "\n+-----------------------+");
                System.out.println("|  " + i + " | \t"  + names[i] + "\t" + "|  " + ages[i] + "   |");
                System.out.println("+-----------------------+\n");
                System.out.println(counter + " rows in set.\n\n");
            }
        }
    }



    private static void searchAge() {
        Scanner input = new Scanner(System.in);
            System.out.println("Enter an age to search:");
            String aChoice = input.nextLine();
            for(int i = 0; i < ages[counter].length(); i++) {
                if (ages[counter].equals(aChoice)) {
                System.out.println("+-----------------------+" + 
               "\n| ID |  NAME     |  AGE |" + 
               "\n+-----------------------+");
                System.out.println("|  " + i + " | \t"  + aChoice + "\t" + "|  " + ages[i] + "   |");
                System.out.println("+-----------------------+\n");
                System.out.println(counter + " rows in set.\n\n");
            }
        }
    }
    
}
