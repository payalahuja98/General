import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class HelpDeskCopy
{
	public static void main(String[] args) throws FileNotFoundException, StackUnderflowException ,Exception
	{
		
		FileReader file = new FileReader("INPUT.txt");
		Scanner tokenizer = new Scanner(file);

		String[] Names=new String[10];		// Name of students
		Integer[] AT=new Integer[10];		// Arrival time of students
		Integer[] CourseID=new Integer[10];	// Course ID of students
		Integer[] Work=new Integer[10];		// Time needed by students
		Integer[] RT=new Integer[10];		// Remaining Time of student

		int rounds  = tokenizer.nextInt();
		int time    = 0;
		String name = null;
		int course  = 0;
		int work    = 0;

		// USER VARIABLES
		int k;
		int Count=0;
		int StuNum=0;
		int temp;

		
		// This loop whil copy all the details of studnets in seperate arrays		
		while(tokenizer.hasNext())
		{
			time    = tokenizer.nextInt();			
			name    = tokenizer.next();			
			course  = tokenizer.nextInt();
			work    = tokenizer.nextInt();

			AT[Count]=time;		// Keep track of Arrival time of all students
			Names[Count]=name;	// Keep track of Names of all students
			CourseID[Count]=course;	// Keep track of Course of all students
			Work[Count]=work;	// Keep track of Work needed by all students
			RT[Count]=work;				// Keep track of Finishing Time of all students

			Count++;
		}


		k=AT[0];
		for(int i=0;i<rounds;i++)
		{
			// Print IDLE at begining if Student is not present
			while(k > 0)
			{
				System.out.println("Time "+ i +", IDLE");
				k--;
				i++;
			}

			k = AT[StuNum] + RT[StuNum];
			if(AT[StuNum + 1] > k)
			{
				while(RT[StuNum] > 0 )
				{
					System.out.println("Time "+i+", Helping "+Names[StuNum]+" from COSC"+CourseID[StuNum]);
					RT[StuNum] = RT[StuNum] - 1;
					i++;
				}
		
			}
			
			k = AT[StuNum] + Work[StuNum];
			if(AT[StuNum+1] > k)
			{			
				temp = AT[StuNum+1] - (AT[StuNum]+Work[StuNum]);				
				while(temp > 0)
				{
					System.out.println("Time "+ i +", IDLE");
					temp--;
					i++;	
				}
				i--;
			}
			
			StuNum++;
			if(StuNum == Count-1)
			{
				k=Work[StuNum];
				i++;

				while(k > 0)
				{
					System.out.println("Time "+i+", Helping "+Names[StuNum]+" from COSC"+CourseID[StuNum]);		
					RT[StuNum] = RT[StuNum] - 1;
					k--;
					i++;	
				}
				
				while(i<rounds)
				{
					System.out.println("Time "+ i +", IDLE");					
					i++;	
				}
				i--;
			}
			k=0;
		}
	}
}