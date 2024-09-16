//always start with importing our scanner so we can use it!
import java.util.Scanner;


/* our first practice file!
* create a 3 question quiz game (lots of if/else likely)
* requirements: keep track of the user's score, has to have at least 3 questions, use if/else
* can be any topic you pick :) feel free to pick some obscure or niche topics!
* good luck!
* */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;    
        System.out.println("whats 4+2");
        int answer1 = sc.nextInt(); 
        if (answer1 == 6){
            System.out.println("correct!");
            System.out.println((++score) + " is your score");
       }else{
            System.out.println("Wrong!");
            System.out.println(score + " is your score");
       
        } 
        System.out.println("whats 5+6");
        int answer2 = sc.nextInt(); 
        if (answer2 == 11){
            System.out.println("correct!");
            System.out.println((++score) + " is your score");
       }else{
            System.out.println("Wrong!");
            System.out.println( score + " is your score");
        }
        System.out.println("whats 8+2");
        int answer3 = sc.nextInt(); 
        if (answer3 == 10){
            System.out.println("correct!");
            System.out.println((++score) + " is your score");
       }else{
            System.out.println("Wrong!");
            System.out.println(score + "is your score");
        }
    }
}

