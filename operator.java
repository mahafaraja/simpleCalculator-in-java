abstract class operator 
{

abstract double calculate(double number1, double number2);

}
/**  these classes extends the abstract class operator for every operator
 * every subclass below have the same method as the superclass operator,
 * thats why we have the override symbol

**/

  class addition extends operator{

 // method to give the sum. 

 @Override
  double calculate(double number1,double number2) {
    return number1+number2;
  }

}


class substraction extends operator{
  @Override

  //method to give the rest.

  double calculate(double number1,double number2) {
    return number1-number2;
  }
    
}

class division extends operator{
  @Override
  //method to give the quotient.
  double calculate(double number1,double number2) {
    return number1/number2;
  }
    
}

class multiplication extends operator{
  @Override

  //method to give the product.
  double calculate(double number1,double number2) {
    return number1*number2;
  }
    
}
