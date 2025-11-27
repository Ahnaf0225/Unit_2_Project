import java.util.Random;
import java.util.Scanner;

public class MemoryGame {

    private int number;
    private int number1, number2, number3, number4, number5;

    public MemoryGame(Integer RandomNum) {
       number = RandomNum;
   }
    
    public void userCommand() throws InterruptedException {
       Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter yes to start the memory game or no to quit: ");
       String yesNo = scan.nextLine();

        if (yesNo.equals("yes")) {
           printNum();
           askUser();
       } else {
           System.out.println("Game cancelled.");
       }
   }

    public void printNum() throws InterruptedException {
        Random random = new Random();
        
        number1 = random.nextInt(10);
       number2 = random.nextInt(10);
       number3 = random.nextInt(10);
       number4 = random.nextInt(10);
       number5 = random.nextInt(10);

        System.out.println("Remember these numbers:");
       System.out.println(number1);
       System.out.println(number2);
       System.out.println(number3);
       System.out.println(number4);
       System.out.println(number5);
       Thread.sleep(1000);
        
        for (int i = 0; i < 25; i++) {
           System.out.println();
       }
   }
    public void askUser() {
       Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the 5 numbers you remember (with spaces plz):");
        
        int guess1 = scan.nextInt();
       int guess2 = scan.nextInt();
       int guess3 = scan.nextInt();
       int guess4 = scan.nextInt();
       int guess5 = scan.nextInt();

        if (guess1 == number1 && guess2 == number2 && guess3 == number3 &&
               guess4 == number4 && guess5 == number5) {

            System.out.println("Wow! You guessed everything correctly!");
        } 
        
        else {
           System.out.println("Incorrect. The correct numbers were:");
           System.out.println(number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5);
       }
   }
}








