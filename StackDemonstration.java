/**
 * Program to Demonstrate Stack Class
 */
package com.problems.stack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author rkumar
 *
 */
public class StackDemonstration {

  /**
   * @param args main class
   */
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    try {
      System.out.println("Is Stack Empty : " + isEmpty(stack));
      stack.push(1);
      stack.push(2);
      stack.push(3);
      System.out.println("Is Stack Empty : " + isEmpty(stack));
      System.out.println("Stack Elements : " + stack);
      System.out.println("Item at the top of the Stack : " + stack.peek());
      System.out.println("Location of 1 from top of Stack : " + search(stack, 1));
      System.out.println("Location of 5 from top of Stack : " + search(stack, 5));
      stack.pop();
      stack.pop();
      stack.pop();
      System.out.println("Is Stack Empty : " + isEmpty(stack));
      System.out.println("Performing pop() operation ...");
      stack.pop();
    } catch (EmptyStackException e) {
      System.out.println("This stack is empty ; cannot perform pop operation");
    }
    try {
      System.out.println("Is Stack Empty : " + isEmpty(stack));
      System.out.println("Performing peek() operation ...");
      stack.peek();
    } catch (EmptyStackException e) {
      System.out.println("This stack is empty ; cannot perform peek operation");
    }
  }

  static String search(Stack<Integer> stack, int searchData) {
    int resultIndex = stack.search(searchData);
    if (resultIndex == -1)
      return "Not Found";
    return String.valueOf(resultIndex);
  }

  static String isEmpty(Stack<Integer> stack) {
    if (stack.isEmpty())
      return "Yes";
    return "No";
  }
}
