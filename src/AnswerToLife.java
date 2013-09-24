import java.util.Scanner;


public class AnswerToLife {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);

		    while(true) {
		      int n = in.nextInt();
		      if (n == 42) break;
		      System.out.println(n);
		    }
	 }
}
