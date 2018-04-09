public class ShowUncheckedWarning {
  public static void main(String[] args) {
    java.util.ArrayList<String> list = 
      new java.util.ArrayList<String>();
    //list.add(new Integer(17));
    list.add("Java Programming");
    System.out.println(list.get(0).length());
  }
}

