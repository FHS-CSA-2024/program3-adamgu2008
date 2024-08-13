//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program3{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("enter length: ");
        
        int length = myObj.nextInt();
        Scanner myObj2 = new Scanner(System.in);
        System.out.print("enter width: ");
        
        int width = myObj2.nextInt();
        
        int area = width*length;
        int perimeter = length*2+width*2;
        
        System.out.println("The length is "+length);
        System.out.println("The width is "+width);
        System.out.println("The area is "+area);
        System.out.println("The perimeter is "+perimeter);

    }
}



//Paste console output below:
/*
enter length: 143
enter width: 82
The length is 143
The width is 82
The area is 11726
The perimeter is 450
*/
