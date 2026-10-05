import java.util.Scanner;
public class GasMileage
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        double tankCapacity = 0;
        double mpg = 0;
        double pricePerGallon = 0;
        double cost100 = 0;
        double totalMiles = 0;
        boolean done = false;
        String trash = " ";


        do{
            IO.print("Enter the tank capacity in gallons: ");

            if(in.hasNextDouble())
            {
                tankCapacity = in.nextDouble();
                in.nextLine(); //clears the newline from the buffer
                done = true;
            }

            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid capacity not: " + trash);
            }

        }while(!done);

        IO.print("The capacity is " + tankCapacity);

        done = false;


        do{
            IO.print("Enter the miles per gallons: ");

            if(in.hasNextDouble())
            {
                mpg = in.nextDouble();
                in.nextLine(); //clears the newline from the buffer
                done = true;
            }

            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid mpg not: " + trash);
            }

        }while(!done);

        IO.print("the mpg is " + mpg);

        done = false;

        do{
            IO.print("Enter the price per gallon: ");

            if(in.hasNextDouble())
            {
                pricePerGallon = in.nextDouble();
                in.nextLine(); //clears the newline from the buffer
                done = true;
            }

            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid price per gallon not: " + trash);

            }

        }while(!done);

        IO.print("the price per gallon is " + pricePerGallon);

        done = false;

        //given size of tank, cost per gallon, and miles per gallon
        //Cost to go 100 miles
        // 100/ mpg * price per gallon

        cost100 = 100/mpg * pricePerGallon;

        totalMiles = tankCapacity * mpg;

        IO.print("The cost to go 100 miles is " + cost100);
        IO.print("The total mile on a full tank is " + totalMiles);

    }
}
