import java.util.Random;
import java.util.Scanner;

public class MemoryGame {

    private int number;

    public MemoryGame (Integer RandomNum){

        number = RandomNum;

    }

    public void userCommand (){

        Scanner scan = new Scanner(System.in);


        System.out.print("Please enter yes if you want to start memory game and no if otherwise: ");
        String yesNo = scan.nextLine();


    }



    public void printNUm() {

        Random randomNum = new Random();

        int range = 10;
        int randomNum = random.nextInt();


    }


}
