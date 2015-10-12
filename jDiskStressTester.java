import java.util.*;
import java.io.*;

/**
 * jDiskStressTester - the conceptual successor to FileSpammer
 * @author Shravan Jambukesan
 * @author Nicholas Berry
 * PLEASE NOTE: The long term effects *still* have not been studied. Use with caution. 
 */

public class jDiskStressTester
{
	private static long startTime;
	public static void main(String[] args)
	{
		boolean b = true;
		Scanner scan = new Scanner(System.in);
		long numFiles = 0;
		long elapsedTime;
		System.out.println("Welcome to jDiskStressTester");
		System.out.println("Press CTRL+C to stop the program before it finishes if needed");
		System.out.print("Enter the number of files you would like to create: ");
		numFiles = scan.nextLong();
		while(b)
		{
			boolean run = fileCreator(numFiles);
			if(run)
			{
				b = false;
			}
		}
	}

	public static boolean fileCreator(long numFiles)
	{
		boolean done = false;
		String str = "";
		double d = 0;
		for(long x = 1; x <= numFiles; x++)
		{
			try
        	{
            	str = "jDiskStressTestFile_" + (long) (x) + ".txt";
            	Thread.sleep(1);
            	getStartTime();
            	PrintWriter localPrintWriter = new PrintWriter(str);
            	d = getElapsedTime();
            	System.out.println("File " + str +  " was created in " + d + " seconds");
            	if(x == numFiles)
            	{
            		done = true;
            	}
         	}
         	catch (Exception e)
         	{
            	System.out.print("Error " + e);
         	}
		}
		return done;
	}

	public static void getStartTime()
	{
		startTime = System.currentTimeMillis();
	}

	public static double getElapsedTime()
	{
		long time = System.currentTimeMillis();
		return (time - startTime) / 1000;
	}

}
