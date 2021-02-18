/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int numberToCheck = 0;
        App app = new App();
        app.printNumber(2);
    }

    /*
    Method for testing purposes
     */
    public int fizzBuzz(int numberToCheck){
        if(numberToCheck < 1){
            System.out.println("Invalid value less than 1");
            return -1;
        }

        else if(((numberToCheck % 3) == 0) && ((numberToCheck % 5) == 0)){
            return -2;
        }
        else if(numberToCheck % 3 == 0){
            return 0;
        }

        else if (numberToCheck % 5 == 0){
            return 0;
        }
        return numberToCheck;
    }

    public String fizzBuzzStringOutPut(int numberToCheck){
        if(numberToCheck < 1){
            System.out.println("Invalid value less than 1");
            return "invalid value less than one";
        }

        else if(((numberToCheck % 3) == 0) && ((numberToCheck % 5) == 0)){
            return "fizz buzz";
        }
        else if(numberToCheck % 3 == 0){
            return "fizz";
        }

        else if (numberToCheck % 5 == 0){
            return "buzz";
        }

        return Integer.toString(numberToCheck);
    }

    public String printNumber(int number){
        for(int i = 1; i <=number; i++){
            System.out.println(fizzBuzzStringOutPut(i));
        }
        //for testing
        return "invalid value fed to print less than one";
    }


}
