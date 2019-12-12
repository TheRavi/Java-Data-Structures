/**
 * Program to perform Stack operations using Arrays
 */
package com.problems.stack;

/**
 * @author rkumar
 *
 */
public class StackArray {
  static int top = -1;
  static int[] numArray = new int[5];

  /**
   * @param args
   */
  public static void main(String[] args) {
    push(numArray,3);
    push(numArray,4);
  }

  public static int[] push(int[] stack, int item) {
    top++;
    numArray[top] = item;
    return stack;
  }
}
