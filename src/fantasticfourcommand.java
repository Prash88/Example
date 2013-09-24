import java.util.HashSet;
import java.util.Scanner;

public class fantasticfourcommand {
	
	private static Scanner s;

	public static void main(String []args)
	{
		s = new Scanner(System.in);
		fantasticfourcommand f =new fantasticfourcommand();
		int total= Integer.parseInt(s.nextLine());
		//System.out.println(total);
			for(int i=total;i>0;i--)
			{
				int lines = Integer.parseInt(s.nextLine());
				//System.out.println(lines);
				String commands[] = new String[100];
				for(int j=0;j<lines;j++)
				{
					//if(s.hasNextLine())
					//{
						commands[j]=s.nextLine();
					//}
				}			
				//f.commandDecode(commands,lines);
				int maxTime = 0;
				int minTime = 0;
				int start = 0;
				int ifTime = 0;
				int ifNotTime = 0;
				HashSet<String> h1 = new HashSet();
				HashSet<String> h2 = new HashSet();
				for(int k=0;k<lines;k++)
				{
					String s = commands[k];
					//System.out.println(c);
					if(s!=null)
					{
					String splitCommand[] = s.split("\\s+");
					if(splitCommand[1].equals("START"))
					{
						start = Integer.parseInt(splitCommand[0]);
					}
					}
				}
				for(int m=0;m<lines;m++)
				{
					String s = commands[m];
					if(s!=null)
					{
						String splitCommand[] = s.split("\\s+");
						if((splitCommand.length > 3) && (splitCommand[4].equals("NOT")) && (start>Integer.parseInt(splitCommand[0])))
						{
							h1.add(splitCommand[5]);
						}
						else if((splitCommand.length > 3) && (splitCommand[3].equals("IF")) && (start>Integer.parseInt(splitCommand[0])))
						{
							h2.add(splitCommand[4]);
						}
					}
				}
				for(int j=0;j<lines;j++) 
				{
					String c = commands[j];
					if(c!=null)
					{
					String splitCommand[] = c.split("\\s+");
					if(splitCommand[1].equals("START"))
					{
						maxTime += Integer.parseInt(splitCommand[0]);
						minTime += Integer.parseInt(splitCommand[0]);
					}
					else if(splitCommand.length == 3 && splitCommand[1].equals("HOLD")  && (start>Integer.parseInt(splitCommand[0])))
					{
						maxTime += Integer.parseInt(splitCommand[2]);
						minTime += Integer.parseInt(splitCommand[2]);
					}
					else if((splitCommand.length > 3) && (splitCommand[4].equals("NOT")) && (start>Integer.parseInt(splitCommand[0])))
					{
						if(h2.contains(splitCommand[5]))
							ifNotTime += Integer.parseInt(splitCommand[2]);
						else
							maxTime += Integer.parseInt(splitCommand[2]);
					}
					else{
						if((start>Integer.parseInt(splitCommand[0])))
						{
							if(h1.contains(splitCommand[4]))
								ifTime += Integer.parseInt(splitCommand[2]);
							else
								maxTime += Integer.parseInt(splitCommand[2]);
						}
					}
					}
				}	
				if(ifTime > ifNotTime)
				{
					maxTime += ifTime;
					minTime += ifNotTime;
				}
				else
				{
					maxTime += ifNotTime;
					minTime += ifTime;
				}
				if(minTime!=0 && maxTime!=0)
					System.out.println(minTime+" TO "+maxTime);	
	}
}
}