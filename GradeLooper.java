/*1. Include a loop that continues to prompt the user to enter a student's name
and letter grade until the user doesn't have any more grades to enter.
2. Inside of the loop, keep track of the number of grades entered by the user.
3. Before the program ends, displays the total number of grades 
entered during the session.*/
// Rachel Bridson - CIT2251
// HW1

import java.util.Scanner;

// declaring class
public class GradeLooper {

    // declaring dat main void
    public static void main(String[] args) {

        // welcome message with no sass        
        System.out.println("Welcome to my Grade Looper. Please input your first"
                + " and last name followed by your grade when prompted. "
                + "When complete, please answer Y at the prompt.");  
        System.out.println();        

        // create scanner bc we care about input         
        Scanner input = new Scanner(System.in);        

        // requesting and accepting first name        
        System.out.print("Please enter your first name:");       
        String fName = input.next();        

        // requesting and accepting last name        
        System.out.print("Please enter your last name:");        
        String lName = input.next();        

        //echoing first name and last name so they know we care who they are         
        System.out.print("Thank you " + fName + " " + lName); 
        System.out.println();

        // string to confirm completetion of enterage         
        String confirm = "n";

        // int to hold num of grades input        
        int numofGrades = 0;

        // dat loopage         
        while(confirm.equalsIgnoreCase("n")) {        
        //requesting and cataloguing grades while demanding compliance               
            System.out.println("Please input your letter grade:");        
            String grade = input.next();

            // troubleshooting damn validation of grades
            switch(grade){
                case "A":
                    System.out.println("Great job!");
                    break;
                case "a":
                    System.out.println("Great job!");
                    break;
                case "B":
                    System.out.println("Good job!");
                    break;
                case "b":
                    System.out.println("Good job!");
                    break;
                case "C":
                    System.out.println("Good try!");
                    break;
                case "c":
                    System.out.println("Good try!");
                    break;
                case "D":
                    System.out.println("Try harder!");
                    break;
                case "d":
                    System.out.println("Try harder!");
                    break;
                case "F":
                    System.out.println("Ouch!");
                    break;
                case "f":
                    System.out.println("Ouch!");
                    break;
                default:
                    System.out.println("Please enter a legitimate letter grade.");
                    numofGrades--;
                    break;
                    }
        
            // echoing that we are indeed listening        
            System.out.println("You entered: " + grade);        
            System.out.println();
        
            // keeping track of grades input        
            numofGrades++;                    

            // prompt for completetion        
            System.out.println("Are you done entering your grades "
                    + fName + " " + lName + "? Please answer Y/N");        
            confirm = input.next();        
        } // end while loop

         // echo how many grades were entered and wishing the 
        //filthy animal a genuine nice day        
        System.out.println("Thank you for choosing my Grade Looper. "
                + "You have entered: " + numofGrades + " grades. "
                + "Have a nice day :)"); 
    }
    
}
