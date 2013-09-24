import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SystemInOut {
  public static void main(String[] args) {
      try {
    	  
          Scanner scanner = new Scanner(System.in);

          while (scanner.hasNextLine()) {
              String line = scanner.nextLine();
              System.out.println(line);
          }
          scanner.close();
      } catch (Exception e) {
          e.printStackTrace();
      }
  }
}