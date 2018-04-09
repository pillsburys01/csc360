public class WildCardNeedDemo {
  public static void main(String[] args ) {
     GenericStack<Integer> intStack = new GenericStack<>();
     intStack.push(1); // 1 is autoboxed into new Integer(1)
     intStack.push(2);
     intStack.push(-2);

     System.out.print("The max number is " + max(intStack)); // Error: 
  }

  /** Find the maximum in a stack of numbers */
  public static double max(GenericStack<Number> stack) {
     double max = stack.pop().doubleValue(); // initialize max
     //stack.push(new Double(3.2));

     while (!stack.isEmpty()) {
       double value = stack.pop().doubleValue();
       if (value > max)
         max = value;
     }

     return max;
  }
}
