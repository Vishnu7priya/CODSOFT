package numbergame;

import java.util.Random;
import java.util.Scanner;

class PlayGame {
    
        int score=0;
        int round = 0;
        
    public void playGame(){
        
        Random random = new Random();
        int randomNumber = random.nextInt(100)+1;
        final int totalAttempts = 7;
        int currentAttempt = 0;
        int guess;
        System.out.println("Random Number Generated!");
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Guess the Random Number: ");
            guess = sc.nextInt();
            System.out.println("Attempt - "+(++currentAttempt));
            if(guess<randomNumber){
                System.out.println("Your Guess is Too Low!\n");
                if(currentAttempt==7){
                    System.out.println("You Lost This Round!");
                    System.out.println("The Correct Number is"+randomNumber);
                }    
            }else if(guess>randomNumber){
                System.out.println("Your Guess is Too High!\n");
                if(currentAttempt==7){
                    System.out.println("You Lost This Round!");
                    System.out.println("The Correct Number is"+randomNumber);
                }    
            }else{
                System.out.println("Your Guess is Correct!\nYou Won This Round!");
                score++;
                break;
            }
        }while(currentAttempt<totalAttempts);
        
        System.out.println("Round: "+(++round));
        System.out.println("Your Score: "+score);
        System.out.println("\nDo You Want To Play Again?\n1. Yes\n2. No");
        int selectOption = sc.nextInt();
        System.out.println();
        
        if(selectOption==1){
            playGame();
        }else if(selectOption==2){
            System.out.println("Your Total Score: "+score);
            System.out.println("Total Rounds: "+round);
            System.exit(0);
        }    
    }    
}

public class NumberGame {
    public static void main(String[] args) {
        PlayGame game = new PlayGame();
        game.playGame();
    }    
}