// Hello World
// Juan P Hernandez
// This program outputs a message
import java.util.Scanner;

public class HelloWorld
{
 
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner( System.in );
        //Variables
        String name, message, hello;
        System.out.println("What's your name?");
        name =input.nextLine();
        hello = "Hello ";
        message = hello + name;
        System.out.println(message);
      
    }

}

//nice!
