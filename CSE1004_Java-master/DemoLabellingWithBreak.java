import java.util.Scanner;
public class DemoLabellingWithBreak
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        // nextDouble() reads the next double from the keyboard
        double first = in.nextDouble();
        double second = in.nextDouble();
        double result;
        boolean t = true;

        //System.out.print("Enter an operator (+, -, *, /): ");

        //Char is a single alphabet where as String is a sequence of characters.
        //char is a primitive data type
        //char operator = in.next().charAt(0); //This will return the first char of the string

            add:
            {
                
            sub:
            {
                

            mul:
            {
                
                
            divisionoperation:
            {
                
                
            // operator doesn't match any case constant (+, -, *, /)
            defaul:
            {
                System.out.println(" I am done!!!");
                 if(t)
                {
                    //System.out.println("I am terminating this program");
                    break mul;
                    
                }
               
            }
            result = first / second;
            System.out.println("Number1 \t"+ first + "\t + "+ "/" + "\tNumber 2 \t"+  second  + "=\t"+  result);
        }
        result = first * second;
        System.out.println("Number1 \t"+ first + "\t + "+ "*"  + "\tNumber 2 \t"+  second  + "=\t"+  result);
    }
    result = first - second;
    System.out.println("Number1 \t"+ first + "\t + "+ "-"  + "\tNumber 2 \t"+  second  + "=\t"+  result);
}
result = first + second;
System.out.println("Number1 \t"+ first + "\t + "+ "+"  + "\tNumber 2 \t"+  second  + "=\t"+  result);
}
                        
        
    }
}