// TestMyLinkedListForHW.java
// This program tests the following methods --
// In the MyLinkedList class:
//     boolean contains(E e)
//     E get(int index)
//     int indexOf(E e)
//     int lastIndexOf(E e)
//     E set(int index, E d)


import java.util.*;

public class TestMyLinkedListForHW {
  public static void main(String[] args) {
  	MyLinkedList<String> stringList = new MyLinkedList<String>();
  	stringList.add("Alabama");
	stringList.add("Alaska");
	stringList.add("Arizona");
	stringList.add("Arkansas");
	stringList.add(4, "California");
	stringList.set(1, "Arkansas");
	System.out.println(stringList);
	System.out.println("contains Arizona: " + stringList.contains("Arizona"));
	System.out.println("contains Alaska: " + stringList.contains("Alaska"));
	System.out.println("get(2): " + stringList.get(2));
	System.out.println("index of Arkansas: " + stringList.indexOf("Arkansas"));
	System.out.println("last index of Arkansas: " + stringList.lastIndexOf("Arkansas"));
	System.out.println("set(2, null): " + stringList.set(2, null));
	System.out.println("get(2): " + stringList.get(2));
	System.out.println("contains null: " + stringList.contains(null));
	System.out.println("index of null: " + stringList.indexOf(null));
	System.out.println("last index of null: " + stringList.lastIndexOf(null));
	try {
		stringList.get(-1);
		throw new RuntimeException("Should not get here.");
	}
	catch (IndexOutOfBoundsException ex) {
		System.out.println("Caught exception -- Good.");
	}
	try {
		stringList.get(5);
		throw new RuntimeException("Should not get here.");
	}
	catch (IndexOutOfBoundsException ex) {
		System.out.println("Caught exception -- Good.");
	}
	try {
		stringList.set(-1, "Colorado");
		throw new RuntimeException("Should not get here.");
	}
	catch (IndexOutOfBoundsException ex) {
		System.out.println("Caught exception -- Good.");
	}
	try {
		stringList.set(5, "Conneticut");
		throw new RuntimeException("Should not get here.");
	}
	catch (IndexOutOfBoundsException ex) {
		System.out.println("Caught exception -- Good.");
	}
	System.out.println();

    MyLinkedList<Object> objectList = new MyLinkedList<Object>();
    objectList.add(1);
    objectList.add(2);
    objectList.add(3);
    objectList.add(4);
    objectList.add(0, "James");
    objectList.add(0, "Jake");
    objectList.add(3, "Jill");
    objectList.add(3, "Jane");
    objectList.add(6, "Joel");
    objectList.add(9, "John");
    objectList.addLast("Jonathan");
  	System.out.println(objectList);
    for (int i = 0; i < objectList.size(); i++) {
      System.out.print(objectList.get(i) + " ");
    }
    System.out.println();
    System.out.println("--------Required tests completed.--------");
    System.out.println();
  }
}
