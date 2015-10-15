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
	private static String verbose;
	private static boolean isVerbose;
	public static void main(String[] args)
	  {
		boolean b = true;
		Scanner scan = new Scanner(System.in);
		long numFiles = 0;
		long elapsedTime;
		System.out.println("Welcome to jDiskStressTester");
		System.out.println("Designed and implemented by Shravan Jambukesan and Nicholas Berry");
		System.out.println("Source code available at https://github.com/ShravanJ/jDiskStressTester");
		System.out.println("Press CTRL+C to stop the program before it finishes if needed");
		System.out.print("Enter the number of files you would like to create: ");
		numFiles = scan.nextLong();
		System.out.print("Would you like verbose output <yes/no>?: ");
		verbose = scan.next();
		if(verbose.equals("yes"))
		  {
			isVerbose = true;
		  }
		else
		  {
			isVerbose = false;
		  }
		System.out.println("Running...");
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
		long start;
		start = System.currentTimeMillis();
		for(long x = 1; x <= numFiles; x++)
		  {
			try
        	  {
            	str = "jDiskStressTesterFile_" + (long) (x) + ".txt";
            	Thread.sleep(1);
            	PrintWriter p = new PrintWriter(str);
            	if(isVerbose)
            	  {
            		System.out.println("File " + str +  " was created");
            	  }
            	if(x == numFiles)
            	  {
            		long end = System.currentTimeMillis();
            		double time = (end - start) / 1000;
            		System.out.println(numFiles + " files were generated in " + time + " seconds");
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
}
