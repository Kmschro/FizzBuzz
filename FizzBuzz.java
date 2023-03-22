public class FizzBuzz
{
    public static void main(String args[])
    {
        int counter = 1;
        while (counter > 0 && counter < 101)
        {
            if (counter%5 == 0 && counter%3 == 0)
            {
                System.out.println("FizzBuzz");
                counter++;
            }
            else if (counter%3 == 0)
            {
                System.out.println("Fizz");
                counter++;
            } 
            else if (counter%5 == 0)
            {
                System.out.println("Buzz");
                counter++;
            }
            else
            {
                System.out.println(counter);
                counter++;
            }
        }

    }
}