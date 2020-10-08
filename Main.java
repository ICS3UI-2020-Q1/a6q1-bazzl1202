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

    //put heights into array using loop
    for(int i = 0; i < heightNumber; i++){
      int heightInput = input.nextInt();
    }
    
  }
}

