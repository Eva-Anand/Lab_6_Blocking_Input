
void main()
{
        Scanner in = new Scanner(System.in);

        double cVal = 0;
        double fVal  = 0;
        boolean done = false;
        String trash = "";

        //F = C * 9/5.0 + 32
        do {
           IO.print("Enter the C value: ");

           if (in.hasNextDouble())
           {
               cVal = in.nextDouble();
               fVal = cVal * 9 / 5.0 + 32;

               IO.println("The value " + cVal + " in Celcius is " + fVal + " in Farenheit!");
               done = true;
           }

           else
           {
               trash = in.nextLine();
               IO.println("You must enter a valid farenheit value not: " + trash);
               IO.println("Try again!");
           }
        }while(!done);
}
