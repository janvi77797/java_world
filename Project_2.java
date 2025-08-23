package myProjects;
import java.util.Scanner;
import java.util.Random;
public class Project_2 {
    public static void main(String[] args) {
        // Number Guessing Game
        Scanner s=new Scanner(System.in);
        Random ran=new Random();
        int rnm=ran.nextInt(100)+1;
        System.out.println("hey! this is number guessing game");
        System.out.println("you have to choose one number between 1 and 100");
       int guess=-1;
        int attempts=0;
        while(rnm!=guess){
            System.out.println("enter your number");
            guess=s.nextInt();
            attempts++;
            if (guess>rnm) {
                System.out.println("too high! enter low number");
            }
            else if(guess<rnm){
                System.out.println("too low! enter high number");
            }
            else{
                System.out.println("great! you did it in "+attempts+"attempts");
            }
        }

    }
}
