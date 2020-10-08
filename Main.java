import java.util.Scanner;
/**
 * Asks for number of heights says average and says heights above average.
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for the number of heights
    System.out.println("How many heights would you like to enter");
    // create a varaible for user height input
    int heightNumber = input.nextInt();

    // ask the user to enter in all the heights
    System.out.println("Please enter the heights on separate lines");

    // create an array
    double[] heights = new double[heightNumber];

    // create a variable to store the sum
    double sum = 0;

    //put heights into array using loop and calculate sum
    for(int i = 0; i < heightNumber; i++){
      heights[i] = input.nextInt();
      // add the heights to sum
      sum = sum + heights[i];
    }

    // determine the average
    double average = sum / heightNumber;
    // let the user know
    System.out.println("The average height is " + average + "cm");

    // tell the user the heights above average
    System.out.println("The heights above average are");

    // use for loop to go through index to see greater than average
    for( int i = 0; i < heightNumber; i++){
     if(heights[i] > average){
       System.out.println(heights[i]);
      }
    }
    
  }
}

