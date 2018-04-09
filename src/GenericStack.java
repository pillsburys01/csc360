public class GenericStack<E> {
  private java.util.ArrayList<E> list = new java.util.ArrayList<>();
  //private E e;
  //private E e = new E();
  //private E e = (E)new Object();
  //private E[] array;
  //private E[] array = new E[10];
  //private E[] array = (E[])new Object[10];
  
  public int getSize() {
    return list.size();
  }

  public E peek() {
    return list.get(getSize() - 1);
  }

  public void push(E o) {
    list.add(o);
  }

  public E pop() {
    E o = list.get(getSize() - 1);
    list.remove(getSize() - 1);
    return o;
  }

  public boolean isEmpty() {
    return list.isEmpty();
  }
  
  @Override
  public String toString() {
    return "stack: " + list.toString();
  }
  
  public static void main(String[] args) {
	 GenericStack<Integer> stack = new GenericStack<>();
	 for (int i = 1; i <= 5; i++)
		 stack.push(i);
	 int sum = 0;
	 while (!stack.isEmpty()) {
		 int value = stack.pop();
		 System.out.print(value + " ");
		 sum += value;
	 }
	 System.out.println();
	 System.out.println("Sum of values: " + sum);
	 System.out.println();
	 
	 GenericStack<String> stack2 = new GenericStack<>();
	 stack2.push("University");
	 stack2.push("Kentucky");
	 stack2.push("Northern");
	 sum = 0;
	 while (!stack2.isEmpty()) {
		 String value = stack2.pop();
		 System.out.print(value + " ");
		 sum += value.length();
	 }
	 System.out.println();
	 System.out.println("Sum of string lengths: " + sum);
  }
}

