package CodSoft;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber{
    int Num;
    int max=100;
    Scanner sc=new Scanner(System.in);
    int attempts;
    int maxAttempts=5;
    int wins=0;

    public GuessTheNumber(){
        Random ran=new Random();
        Num=Math.abs(ran.nextInt())%(max+1);
    }

    public void play(){
        boolean playAgain=true;
        while(playAgain){
        	Random ran=new Random();
            Num=Math.abs(ran.nextInt())%(max+1);
            attempts=0;
            System.out.println("New game started");
            System.out.println("You have total 5 attempts ");

        while(attempts<maxAttempts){


            System.out.print("Enter your Number: ");
            int guess=sc.nextInt();
            attempts++;
            if(guess>Num){
                System.out.println("Your Guess is too high");
            }else if(guess<Num){
                System.out.println("Your Guess is too low");
            }else if(guess==Num){
                wins++;
                System.out.println("Congratulations, you guessed it right, your current score is "+wins);
                break;
            }
            if(attempts<maxAttempts){
                System.out.println("Attempts left: "+(maxAttempts-attempts));
            }else{
                System.out.println("Your Attempts are over, the number was: "+Num+" & your score was:"+wins);
            }
        }
        System.out.println("Do you want to restart the game(yes/no):");
        String playAgainInput=sc.next().toLowerCase();
        playAgain=playAgainInput.equals("yes");
        if(!playAgain){
            System.out.println("Game is ended.");
        }
    }
}
    public static void main(String[] args) {
        System.out.println("Welcome to the Game");
        GuessTheNumber guess=new GuessTheNumber();
        guess.play();
    }
}
