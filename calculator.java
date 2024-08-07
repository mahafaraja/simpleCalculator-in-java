/**Author:faraja maha (mahafaraja@gmail.com)
 * Date: monday 5th august 2024 
 * first subimit
*/

import java.util.*;

public class calculator{
    public static void main(String[] args) {
      
      Scanner input= new Scanner(System.in);
      
      System.out.println("ENTER FIRST NUMBER:");
      double number1=input.nextDouble();
      
      System.out.println("SHOOSE OPERATOR FROM(+,-,*,/):");
      char operator=input.next().charAt(0);
      
      System.out.println("ENTER FIRST NUMBER:");
      double number2=input.nextDouble();
      
       operator op=null;
      switch(operator){
        case'+': 
        op= new addition();
          break;

          case'-': 
        op= new substraction();
          break;

          case'*': 
        op= new multiplication();
          break;

          case'/': 
          op= new division();
            break;

          default:
          System.out.println("inter a valid operator bro!");
      }
      double result= op.calculate( number1,number2);
       System.out.println(number1+" "+" "+number2+" " +"=" +result);
      
      
      
      
  }
}