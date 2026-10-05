import java.util.Random;
import java.util.Scanner;

public class HighorLow
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        boolean done = false;
        int rndVal = gen.nextInt(10) + 1;
        int userGuess = 0;
        String trash = "";


        do
        {
            IO.print("Enter your guess [1-10] ");
            if (in.hasNextInt())
            {

                userGuess = in.nextInt();
                in.nextLine(); //clear the newline from the buffer


             if(userGuess >= 1 && userGuess <= 10)
             {
                 if (userGuess == rndVal)
                 {
                     IO.println("You guessed the value correctly " + rndVal);
                     done = true;
                 }


                 else if (userGuess > rndVal)
                 {
                     IO.println("Your guess " + userGuess + " is greater than the random value ");
                 }


                 else if (userGuess < rndVal)
                {

                   IO.println("Your guess " + userGuess + " is less than the random value ");

                }


             }

            }

            else
            {
                IO.println("You must enter a valid int in the range [1-10] not: " + trash + " try again!" );
            }

        }while (!done);
    }
}