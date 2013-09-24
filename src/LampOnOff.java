import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class LampOnOff 
{
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
	  try {
    	  
          while (scanner.hasNextLine()) {
              ArrayList<Lamp> a = new ArrayList<Lamp>();
              String line = scanner.nextLine();
              String []splitString = line.split("\\s+");
              int no = Integer.parseInt(splitString[0]);
              if(no!=0)
              {
            	  for(int i=1;i<(no+1);i++)
            	  {
            		  Lamp l = new Lamp(splitString[i]);
            		  a.add(l);
            	  }
            	  if (scanner.hasNextLine()) {
            		  String secondLine = scanner.nextLine();
            		  String []splitSecondString = secondLine.split("\\s+");
            		  for(int i=0;i<no;i++)
            		  {
            			  int onoff = Integer.parseInt(splitSecondString[i]);
            			  Lamp l1 = (Lamp) a.get(i);
            			  if(onoff==1)
            			  {
            				  l1.turnOn();
            			  }
            			  else
            			  {
            				  l1.turnOff();
            			  }
            			  System.out.print(l1.toString()+" ");
            		  }
            		  System.out.println();
            	  }
              }
              else
            	  break;
          }
          scanner.close();
      } catch (Exception e) {
          e.printStackTrace();
      }
  }
}

class Lamp
{
	boolean status;
	String name;
	public Lamp(String s)
	{
		this.name = s;
	}
	public void turnOn()
	{
		this.status = true;
	}
	public void turnOff()
	{
		this.status = false;
	}
	public boolean isOn()
	{
		return status;
	}
	public String toString() 
	{
		if(this.status == true)
		{
			return this.name + " is " + "ON";
		}
		else
		{
			return this.name + " is " + "OFF";
		}
	}
}
