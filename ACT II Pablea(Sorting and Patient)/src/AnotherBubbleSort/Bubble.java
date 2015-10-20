import java.util.*;
public class Bubble {
  public static void main(String []args) {
    int number;
    Scanner inputDevice = new Scanner(System.in);
 
    System.out.print("Input number of integers to sort: ");
    number = inputDevice.nextInt();
 
    int array[] = new int[number];
 
    for (int i = 0; i < number; i++) {
    	System.out.print("Enter number " + (i+1) + ": ");
    	array[i] = inputDevice.nextInt();
    }
 
	for (int i = 0; i < (number - 1 ); i++) {
      for (int d = 0; d < number - i - 1; d++) {
        if (array[d] > array[d+1]) /* For descending order use < */
        {
          int swap   = array[d];
          array[d]   = array[d+1];
          array[d+1] = swap;
        }
      }
    }
    System.out.print("\n");
    System.out.println("******************************");
    System.out.println("*    SORTED LIST OF NUMBER   *");
    System.out.println("******************************");
    System.out.print("\n");
    System.out.print("Ascending: ");
    
    for (int i = 0; i < number; i++) {
      System.out.print(array[i] + ", ");
    }

    for (int i = 0; i < (number - 1); i++) {
      for (int d = 0; d < number - i - 1; d++) {
        if (array[d] < array[d+1]) /* For ascending order use < */
        {
          int swap   = array[d];
          array[d]   = array[d+1];
          array[d+1] = swap;
        }
      }
    }
    System.out.print("\n");
    System.out.print("\n" + "Descending: ");
    for (int i = 0; i < number; i++) {
      System.out.print(array[i] + ", ");
    }
  }
}