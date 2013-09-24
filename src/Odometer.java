import java.text.DecimalFormat;
import java.util.Scanner;


public class Odometer {

	/**
	 * @param args
	 */
	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
	    	  
	          Scanner scanner = new Scanner(System.in);
	          int i=0;
	          float[] diameter = new float[100];
	          float[] time = new float[100];
	          int[] revolutions = new int[100];
	          while (scanner.hasNextLine()) {
	              String line = scanner.nextLine();
	              String []splitString = line.split("\\s+");
	              if(Integer.parseInt(splitString[1])!=0)
	              {
	            	  diameter[i] = Float.parseFloat(splitString[0]);
	            	  revolutions[i] = Integer.parseInt(splitString[1]);
	            	  time[i] = Float.parseFloat(splitString[2]);
	            	  i++;
	              }
	              else
	            	  break;
	          }
	          scanner.close();
	          for(int j=0;j<i;j++)
	          {
	        	  double distance = (double) ((3.1415927*diameter[j])*revolutions[j])/(12*5280);
	        	  double speed = (distance/(time[j]))*3600;
	        	  System.out.printf("Trip #"+(j+1)+": "+"%.2f %.2f",Math.round(distance * 100.00) / 100.00,Math.round(speed * 100.00) / 100.00);
	        	  System.out.println();
	          }
	      } catch (Exception e) {
	          e.printStackTrace();
	      }
	}

}
