
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     
        
    //New Class
    CarClass CarSample = new CarClass();

    //Year Model
    Scanner keyboard = new Scanner(System.in);

    System.out.println ("Please input Year Model of car.");
        //Integer Number
        int YearModel = Integer.parseInt(keyboard.nextLine());

    CarSample.SetYearModel (YearModel);

    //Make
    System.out.println (
    "Please input Make of car.");
        String Make = keyboard.nextLine();

    CarSample.SetMake (Make);

    //Speed
    System.out.println (

    "Please input Speed of car.");
    //Set to Zero
    CarSample.SetSpeed (
    0);
        int Speed = keyboard.nextInt();

    CarSample.SetSpeed (Speed);
    
    //Output
    System.out.println("The year model of your car: " + CarSample.GetYearModel());
    System.out.println("The make of your car: " + CarSample.GetMake());

    //Accelerate Method 5 Times
    for (int i = 0;
    i< 5; ++i
        ) 
    {
    
    CarSample.Accelerate();
    System.out.println("Speed of your car: " + CarSample.GetSpeed());
    }

    //Brake Method 5 Times
    for (int i = 0;
    i< 5; ++i
        ) 
    {
    
    CarSample.Brake();
    System.out.println("Speed of your car: " + CarSample.GetSpeed());
    }
}
}



