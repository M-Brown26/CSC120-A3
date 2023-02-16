// Myaisa Brown

import java.util.Random;
import java.util.Scanner;

public class Conversation {
  
  static String person_response = "";
  public static void main(String[] arguments){
    Scanner stringScanner = new Scanner(System.in);
    Scanner userInput = new Scanner(System.in);
    Random rand = new Random();
    // String[] transcript = new String[] {};
    // String[] bot_response = new String[] {"Uh huh", "Wow", "Real interesting.", "Yep", "Mm hmm"};
    String bot_response = "Mm hmm";
    
        
    System.out.println("Welcome!");
    System.out.println("Ready to play?");
    System.out.print("How many rounds do you want?");
    int rounds = userInput.nextInt();
    // int random_method = (int)(Math.random());
    

        for (int i = 0; i < rounds; i++){
          person_response = stringScanner.nextLine();
          stringScanner.nextLine();
          // transcript.add(person response);
          System.out.println(bot_response);
          // transcript.add(bot_response);

        }
    System.out.println("That was fun!");
    System.out.println("Goodbye!");
    // System.out.println(transcript);
    }

  }
