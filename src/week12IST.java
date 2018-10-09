
/*** Author: [Rowan van Beveren s5107347]
 * * Date: [Start date - 04/10/18 End date - 04/10/18]
 * * Week: [12]
 * * Description: [These are all of the week 12 IST's done in sequential order (They are all labeled with comments)
 * These are potentially sightly more advanced than the way the task was asked to be done however fulfil the same purpose] */
import java.util.Scanner;
public class week12IST {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Which program would you like to run? \n 1 = newSalaryProgram \n 2 = newSalaryDoubleProgram \n 3 = salaryIncreaseProgram \n 4 = calculateAverageProgram \n 5 = tableOfSquaresAndCubes \n 6 = whatIsThePercentage \n 7 = reverseNumbers \n 8 = convertingNumbers (Hard coded) \n 9 = convertingNumbers ");
        int number = scan.nextInt();
        if (number == 1) {
            newSalaryProgram();
        }
        else if (number == 2) {
            newSalaryDoubleProgram();
        }
        else if (number == 3) {
            salaryIncreaseProgram();
        }
        else if (number == 4) {
            calculateAverageProgram();
        }
        else if (number == 5) {
            tableOfSquaresAndCubes();
        }
        else if (number == 6) {
            whatIsThePercentage();
        }
        else if (number == 7){
            reverseTheNumber();
        }
        else if (number == 8){
            convertingValuesHard();
        }
        else if (number == 9){
            convertingValues();
        }
        else {
            System.out.println("The number you have given is not an option please choose from the options given");
        }




    }


    public static void newSalaryProgram() {              //Task 1

        int currentSalary = 23000;
        int newSalary;

        Scanner input = new Scanner(System.in);


        System.out.println("Is it time to pay the employees. Yes or No?");
        String answer = input.nextLine();
        input.close();


        if (answer.equals("yes")) {
            newSalary = currentSalary + 200;
            System.out.println("The new salary of the employee is " + newSalary);
        } else if (answer.equals("no")) {
            System.out.println("The employees were not given a raise their salary is still " + currentSalary + " be careful of a revolution");

        }


    }

    public static void newSalaryDoubleProgram() {        //Task 2

        double currentSalary = 23000;
        double newSalary;

        Scanner input = new Scanner(System.in);


        System.out.println("Is it time to pay the employees. Yes or No?");
        String answer = input.nextLine();
        answer.toLowerCase();
        input.close();


        if (answer.equals("yes")) {
            newSalary = currentSalary + 200.50;
            System.out.println("The new salary of the employee is " + newSalary);
        } else if (answer.equals("no")) {
            System.out.println("The employees were not given a raise their salary is still " + currentSalary + " be careful of a revolution");
        }

    }


    public static void salaryIncreaseProgram() {                     //Task 3
        int currentSalary = 23000;
        double increaseValue = 1.2;
        double newSalary;

        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to increase the salary of the employees by 20%? Yes or No?");
        String answer = input.nextLine();
        answer.toLowerCase();                       // Have converted to lower case as it will prevent the problem of the user inputting a different way of typing the answer e.g Yes or No
        input.close();

        if (answer.equals("yes")) {
            newSalary = currentSalary * increaseValue;
            System.out.println("The new salary of the employee is " + newSalary);
        } else if (answer.equals("no")) {
            System.out.println("The employees were not given a raise their salary is still " + currentSalary + " be careful of a revolution");
        }


    }

    public static void calculateAverageProgram() {           //Task 4

        Scanner input = new Scanner(System.in);


        int count;
        double total = 0;
        for (count = 1; count < 6; count++) {  // Reason count is set to 1 is so that when the sentence is asked about what number you would like to enter it is more clear.
            System.out.println("Please enter number " + count);
            double number = input.nextInt();
            total = total + number;

        }

        double average = total / 5;

        System.out.println("The total of the numbers that you have entered is " + total + "\n The average of the numbers that you have entered is " + average);


    }

    public static void tableOfSquaresAndCubes() {       //Task 5

        int count;
        int number;
        int square;
        int cube;

        for (count = 1; count < 11; count++) {
            number = count;
            square = number * number;
            cube = number * number * number;

            if (count == 1) {
                System.out.println("Number  Square  Cube \n" + number + "       " + square + "       " + cube);
            }
            else if (count > 3 && count < 10){
                System.out.println(number + "       " + square + "      " + cube); // don't know how to print out in a table sort of format without the numbers being pushed to one side in java
            }
            else if (count == 10){
                System.out.println(number + "      " + square + "     " + cube);
            }


        }


    }

    public static void  whatIsThePercentage(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter in the amount of marks the student got in the test");
            double score = input.nextInt();
        System.out.println("Please enter the total amount of marks available for the test");
            double total = input.nextInt();

            if (score > total){
                 System.out.println("The score of the student cannot exceed the total marks for the test. Please re-enter the marks");
                 whatIsThePercentage();
            }
            else {
                double percentage = score / total * 100;
                System.out.println("The percentage the student obtained was " + percentage + "%");
            }
    }


    public static void reverseTheNumber(){




    }



    public static void convertingValuesHard(){
        double lbs = 200;
        double kg;
        double brp = 100;
        double euro;
        double fahrenheit = 75;
        double celsius;
        int hour = 1;
        int min = 28;
        int seconds = 42;
        int tSeconds;

        kg = lbs * 0.453592;
        euro = brp * 1.14;
        celsius = (fahrenheit - 32)*5/9;
        tSeconds = (hour * 60 * 60) + (min *60) + seconds;


        System.out.println(lbs + "lbs is equivalent to " + kg + "kg");
        System.out.println("£"+ brp + " is equivalent is to " + euro + " Euros");// unable to find euro symbol
        System.out.println(fahrenheit + " Fahrenheit is equivalent to " + celsius + " Celsius");
        System.out.println(hour + " hour " + min + " minutes " + seconds + " seconds is equivalent to " + tSeconds + " seconds" );






    }

    public static void convertingValues(){

    Scanner input = new Scanner(System.in);
    System.out.println("What would you like to convert. \n 1 = Pounds to Kilograms \n 2 = British pounds to Euros \n 3 = Fahrenheit to Celsius \n 4 = Time to seconds" );
       int answer = input.nextInt();
       if(answer == 1){



       }









    }


}

