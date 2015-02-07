
public class Student{
	
	private String name = null;
	private int course = -999;
	private int workload = -999;
	private int help;
	
	
	public Student()
	{
		name = "No Name";
		course = -999;
		workload = -999;
		help = 0;
	}
	
	public Student(String n, int c, int w)
	{
		name = n;
		course = c;
		workload = w;
		help = w;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getCourse()
	{
		return course;
	}
	
	public int getWork()
	{
		return workload;
	}
	
	public void setWork(int work)
	{
		 workload = work;
	}
	
	public String toString()
	{
		return (name + " in COSC " + course + ", " + workload + " minute workload.");
	}
	public int getHelp(){
		return help;
	}
	public void setHelp(int h){
		help = h;
	}
	public void decrementHelp(){
		help = help - 1;
	}
	

}
