
//Julia Schmidt & Payal Ahuja
//Brookfield Central HS

public class Student2 {
	
	private String name = null;
	private int course = -999;
	private int workload = -999;
	private int help = -999;
	
	
	public Student2() //basic constructor
	{
		name = "No Name";
		course = -999;
		workload = -999;
		help = -999;
	}
	
	public Student2(String n, int c, int w) //parameterized constructor for name, course, workload
	{
		name = n;
		course = c;
		workload = w;
		help = w - 1; //HelpDesk class does not test for help = 0 until after helping; student is helped when help = 0.
	}
	
	public String getName() //returns name
	{
		return name;
	}
	
	public int getCourse() //returns course
	{
		return course;
	}
	
	public void setWork(int w) //sets workload
	{
		workload = w;
	}
	
	public int getWork() //returns workload
	{
		return workload;
	}
	
	public String toString() //returns student in string
	{
		return (name + " in COSC " + course + ", " + workload + " minute workload.");
	}
	
	public void setHelp(int h) //sets amount of help needed
	{
		help = h - 1; //see above
	}
	
	public int getHelp() //returns help
	{
		return help;
	}
	
	public int helpThem() //help = help - 1; returns new help value
	{
		help--;
		return help;
	}

}
