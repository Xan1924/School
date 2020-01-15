package school;

import java.io.*;

public class Lotto {

    @SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
        DataInputStream input = new DataInputStream(System.in);
        String replay = "";
        int check, check2 = 0, check4 = 0, winning_numbers, num1 = 5, num2 = 30, num3 = 500 , num4 = 100000, num5 = 1000000, num6 = 30000000;
        int bank = 50, guess1, guess2 , guess3, guess4, guess5, guess6, hold;
        System.out.println("Welcome to the Lotto496");
        System.out.println("You currently have $"+bank+" in your bank account\nOne try costs $5");
        System.out.print("Would you like to play? (Y/N): ");
        while(check2 == 0) {
            String start = input.readLine();
            if (start.equalsIgnoreCase("y")) {
                    System.out.println("OK");
                    check2 = 1;
                    bank = bank - 5;
                    System.out.println("");
                }
             else if (start.equalsIgnoreCase("n")) {
                System.out.println("Very Well");
                replay = "n";
                check = 1;
            }
        
                else {
                    System.out.print("Please only type 'y' for yes and 'n' for no: ");
                }
        	}

// Loop starts
        while (!replay.equalsIgnoreCase("n")) {
            check = 0;
            winning_numbers = 0;
// Creating the numbers
            int win1 = (int) (Math.random() * 49 + 1);
            int win2 = (int) (Math.random() * 49 + 1);
            int win3 = (int) (Math.random() * 49 + 1);
            int win4 = (int) (Math.random() * 49 + 1);
            int win5 = (int) (Math.random() * 49 + 1);
            int win6 = (int) (Math.random() * 49 + 1);
// Checking for duplicates
            while (win2 == win1) {
                win2 = (int) (Math.random() * 49 + 1);
            }
            while (win3 == win2 || win3 == win1) {
                win3 = (int) (Math.random() * 49 + 1);
            }
            while (win4 == win3 || win4 == win2 || win4 == win1) {
                win4 = (int) (Math.random() * 49 + 1);
            }
            while (win5 == win4 || win5 == win3 || win5 == win2 || win5 == win1) {
                win5 = (int) (Math.random() * 49 + 1);
            }
            while (win6 == win5 || win6 == win4 || win6 == win3 || win6 == win2 || win6 == win1) {
                win6 = (int) (Math.random() * 49 + 1);
            }
//Sorting the winning numbers
            for (int x = 1; x <= 5; x++){
                if(win1 > win2){
                    hold = win1;
                    win1 = win2;
                    win2 = hold;
                }
                if(win2 > win3){
                    hold = win2;
                    win2 = win3;
                    win3 = hold;
                }
                if(win3 > win4){
                    hold = win3;
                    win3 = win4;
                    win4 = hold;
                }if(win4 > win5){
                    hold = win4;
                    win4 = win5;
                    win5 = hold;
                }if(win5 > win6){
                    hold = win5;
                    win5 = win6;
                    win6 = hold;
                }
            }
//Cheat
            System.out.println(win1 + "\t" + win2 + "\t" + win3 + "\t" + win4 + "\t" + win5 + "\t" + win6);
// User guesses
            System.out.println("Please enter your six numbers(No repeating numbers or numbers over 49 or under 1) ");
            System.out.print("First Number :  ");
             guess1 = Integer.parseInt(input.readLine());
            while (guess1 < 1 || guess1 > 49){
                System.out.print("NUMBERS 1-49 ONLY!! First Number:  ");
                guess1 = Integer.parseInt(input.readLine());
            }
             System.out.print("Second Number:  ");
             guess2 = Integer.parseInt(input.readLine());
             while (guess2 == guess1 || guess2 < 1 || guess2 > 49) {
                 if (guess2 == guess1) {
                     System.out.print("NO REPEATING NUMBERS!! Second Number:  ");
                 }
                 else{
                     System.out.print("NUMBERS 1-49 ONLY!! Second Number:  ");
                 }
                 guess2 = Integer.parseInt(input.readLine());
             }
            System.out.print("Third Number :  ");
             guess3 = Integer.parseInt(input.readLine());
            while (guess3 == guess2 || guess3 == guess1 || guess3 < 1 || guess3 > 49) {
                if (guess3 == guess2 || guess3 == guess1) {
                    System.out.print("NO REPEATING NUMBERS!! Third Number:  ");
                }
                else{
                    System.out.print("NUMBERS 1-49 ONLY!! Third Number:  ");
                }
                guess3 = Integer.parseInt(input.readLine());
            }
            System.out.print("Fourth Number:  ");
             guess4 = Integer.parseInt(input.readLine());
            while (guess4 == guess3 || guess4 == guess2 || guess4 == guess1 || guess4 < 1 || guess4 > 49) {
               if (guess4 == guess3 || guess4 == guess2 || guess4 == guess1) {
                   System.out.print("NO REPEATING NUMBERS!! Fourth Number:  ");
               }
               else{
                   System.out.print("NUMBERS 1-49 ONLY!! Fourth Number:  ");
               }
                guess4 = Integer.parseInt(input.readLine());
            }
            System.out.print("Fifth Number :  ");
             guess5 = Integer.parseInt(input.readLine());
            while (guess5 == guess4 || guess5 == guess3 || guess5 == guess2 || guess5 == guess1 || guess5 < 1 || guess5 > 49) {
                if  (guess5 == guess4 || guess5 == guess3 || guess5 == guess2 || guess5 == guess1) {
                    System.out.print("NO REPEATING NUMBERS!! Fifth Number:  ");
                }
                else{
                    System.out.print("NUMBERS 1-49 ONLY!! Fifth Number:  ");
                }
                guess5 = Integer.parseInt(input.readLine());
            }
            System.out.print("Sixth Number :  ");
             guess6 = Integer.parseInt(input.readLine());
            while (guess6 == guess5 || guess6 == guess4 || guess6 == guess3 || guess6 == guess2 || guess6 == guess1 || guess6 < 1 || guess6 > 49) {
                if (guess6 == guess5 || guess6 == guess4 || guess6 == guess3 || guess6 == guess2 || guess6 == guess1) {
                    System.out.print("NO REPEATING NUMBERS!! Sixth Number:  ");
                }
                else{
                    System.out.print("NUMBERS 1-49 ONLY!! Sixth Number:  ");
                }
                guess6 = Integer.parseInt(input.readLine());
            }
            System.out.println("");
//Sorting the guess numbers
            for (int i = 1; i <= 5; i++){
                if(guess1 > guess2){
                    hold = guess1;
                    guess1 = guess2;
                    guess2 = hold;
                }
                if(guess2 > guess3){
                    hold = guess2;
                    guess2 = guess3;
                    guess3 = hold;
                }
                if(guess3 > guess4){
                    hold = guess3;
                    guess3 = guess4;
                    guess4 = hold;
                }if(guess4 > guess5){
                    hold = guess4;
                    guess4 = guess5;
                    guess5 = hold;
                }if(guess5 > guess6){
                    hold = guess5;
                    guess5 = guess6;
                    guess6 = hold;
                }
            }
//Displaying the guess numbers
            System.out.println( "Your numbers are:        "+ guess1 + "\t" + guess2 + "\t" + guess3 + "\t" + guess4 + "\t" + guess5 + "\t" + guess6);
//Checking for winning numbers
            if (guess1 == win1 || guess1 == win2 || guess1 == win3 || guess1 == win4 || guess1 == win5 || guess1 == win6){
                winning_numbers++;
            }
            if (guess2 == win1 || guess2 == win2 || guess2 == win3 || guess2 == win4 || guess2 == win5 || guess2 == win6){
                winning_numbers++;
            }
            if (guess3 == win1 || guess3 == win2 || guess3 == win3 || guess3 == win4 || guess3 == win5 || guess3 == win6){
                winning_numbers++;
            }
            if (guess4 == win1 || guess4 == win2 || guess4 == win3 || guess4 == win4 || guess4 == win5 || guess4 == win6){
                winning_numbers++;
            }
            if (guess5 == win1 || guess5 == win2 || guess5 == win3 || guess5 == win4 || guess5 == win5 || guess5 == win6){
                winning_numbers++;
            }
            if (guess6 == win1 || guess6 == win2 || guess6 == win3 || guess6 == win4 || guess6 == win5 || guess6 == win6){
                winning_numbers++;
            }
            System.out.println("The winning numbers are: " + win1  + "\t" + win2 + "\t" + win3 + "\t" + win4 + "\t" + win5 + "\t" + win6);
//Giving the prizes
            if (winning_numbers == 6){
                System.out.println("YOU WON THE JACKPOT!!!!!!\nYou have received $30,000,000 in your bank account.");
                bank = bank + num6;
            }
            else if (winning_numbers == 5) {
                System.out.println("You got 5 matching numbers!\nYou have received $1,000,000 in your bank account.");
                bank = bank + num5;
            }
            else if (winning_numbers == 4) {
                System.out.println("You got 4 matching numbers!\nYou have received $100,000 in your bank account.");
                bank = bank + num4;
            }
            else if (winning_numbers == 3) {
                System.out.println("You got 3 matching numbers!\nYou have received $500 in your bank account.");
                bank = bank + num3;
            }
            else if (winning_numbers == 2) {
                System.out.println("You got 2 matching numbers!\nYou have received $30 in your bank account.");
                bank = bank + num2;
            }
            else if (winning_numbers == 1) {
                System.out.println("You got 1 matching number!\nYou have received $5 in your bank account.");
                bank = bank + num1;
            }
            else{
                System.out.println("You lost! Try next time!");
            }
            System.out.println("You currently have $"+bank+" in your bank account");
            System.out.println("");
//Play Again Prompt
            if (bank >= 5){
           
            System.out.print("Would you like to play again?(Y/N): ");
            while(check == 0) {
                String playresponse = input.readLine();
                if (playresponse.equalsIgnoreCase("y")) {
                    if (bank >= 5){
                        System.out.println("OK");
                        check = 1;
                        bank = bank - 5;
                    }
                    else{
                        System.out.println("You don't have enough money");
                        check = 1;
                        replay = "n";
                        System.out.print("Please visit this website to stop gambling\nhttp://www.gamblersanonymous.org/ga/");
                    }
                } else if (playresponse.equalsIgnoreCase("n")) {
                    System.out.println("Very Well");
                    replay = "n";
                    check = 1;
                   System.out.print("Would you like to donate to charity? (Y/N)");
                   int check3 = 0;
                   while(check3 == 0) {
                   String charity = input.readLine();
          
					if (charity.equalsIgnoreCase("y")) {
                            System.out.println("OK");
                            check3 = 1;
                            System.out.print("Enter the amount of money to be donated(Bank = $"+bank+ "): ");
                            while (check4 == 0){
                            int donate = Integer.parseInt(input.readLine());
                            if (donate <= bank) {
                            	System.out.println("You have donated $"+donate+" to charity");
                            	check4 = 1;
                            }
                            else {
                            	System.out.println("You can't donate that amount of money ");
                            	
                            }
                           
                        }
					}
					else if (charity.equalsIgnoreCase("n")) {
                        System.out.println("Very Well");
                        check3 = 1;
					}
                    else {
                        System.out.print("Please only type 'y' for yes and 'n' for no: ");
                    	}
                   }
                }
            	}
            }
                    else{
                        System.out.println("You don't have enough money to continue playing");
                        check = 1;
                        replay = "n";
                        System.out.print("Please visit this website to stop gambling\nhttp://www.gamblersanonymous.org/ga/");
                    }
        	}	
        }
    }
    
