package myProjects;
import java.util.Random;
import java.util.Scanner;
public class Project_1 {
    public static void main(String[] args) {
        // Rock Paper Scissor

        // 0 --> Rock
        // 1 --> Paper
        // 2 --> Scissors
        Random rand=new Random();
        Scanner s=new Scanner(System.in);

        System.out.println("0 for Rock , 1 for Paper , 2 for Scissor");

        int num=s.nextInt(3);
        int random=rand.nextInt(3);

        if(random==0 && num==2){
            System.out.println("you won");
        }
        else if (random==1 && num==0) {
            System.out.println("computer  won");

        }
        else if(random==2 && num==1){
            System.out.println("computer  won");
        }
        else if(random ==num){
            System.out.println("it is draw");
        }
        else{
            System.out.println("you won");
        }
        System.out.println("computer choice "+random);

    }
}
