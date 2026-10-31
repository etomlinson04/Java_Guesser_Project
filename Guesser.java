import java.util.Scanner;

public class Guesser {
    private Scanner in = new Scanner(System.in);

    public static void main(String[] args) { 
        new Guesser().run();
    }

    private void run() {
	int choice = -1;
	while (choice != 0) {
	    System.out.println("\n0) Exit: ");
	    System.out.println("1) Human Guesser");
	    System.out.println("2) Computer Guesser\n");
	    System.out.print("Please enter 0-2: ");
	    choice = Integer.parseInt(in.nextLine().trim());

	    if (choice == 1) {
		humanGuesser();
	    } else if (choice == 2) {
		computerGuesser();
            } else if (choice != 0) {
		System.out.println("Invalid Choice.");
            }
       }
       in.close();
   }

   private void humanGuesser() {
       System.out.println("human guesser");
       int target = (int) (Math.random() * 100) + 1;
       int count = 0;
       int guess = -1;

       while (guess != target) {
	   count++;
	   System.out.print(count + ") Please enter a number: ");
	   guess = Integer.parseInt(in.nextLine().trim());
	   if (guess < target) {
	       System.out.println("too low");
	   } else if (guess > target) { 
	       System.out.println("too high");
	   } else {
	       System.out.println("you guessed it!");
	   }

       }
       System.out.println("\nVery good!");
  }

  private void computerGuesser() {
      System.out.println("computer guesser");
      int low = 1, high = 100, count = 0;

      while (low <= high) {
	  int guess = (low + high) / 2;
	  count++;
	  System.out.println(count + ") I guess " + guess);
	  System.out.print("Too (H)igh, too (L)ow, or (C)orrect? ");
	  String answer = in.nextLine().trim().toLowerCase();

	  if (answer.equals("c")) {
	      return;
	  } else if (answer.equals("h")) {
              high = guess - 1;
	  } else if (answer.equals("l")) {
	      low = guess + 1;
	  } else {
	      System.out.println("Please enter H, L, or C.");
	      count--;
	  }
      }
      System.out.println("Something doesn't add up.. did you change your number?");
  }

private int readInt(String prompt) {
    while (true) {
	try {
	    return Integer.parseInt(in.nextLine().trim());
	} catch (NumberFormatException e) {
	    System.out.println("Please enter a number.");
	}
     }
  }
}
