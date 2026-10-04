import java.util.Scanner;
public class p4
{
 public static void main(String args[])
  {
   Scanner s1 = new Scanner(System.in);
   
   System.out.println("Enter first numeber :");
   double num1 = s1.nextDouble();
   System.out.println("Enter second number :");
   double num2 = s1.nextDouble();

   System.out.println("Addition ="+(num1 + num2));
   System.out.println("Subtraction ="+(num1 - num2));
   System.out.println("Multiplication ="+(num1 * num2));
   
     if(num2!=0){
        System.out.println("Division ="+(num1/num2));
        System.out.println("Modulus ="+(num1%num2));
     }
     else{
         System.out.println("Division and Modulus cannot be performed with 0.");    
     }
     
  } 
}