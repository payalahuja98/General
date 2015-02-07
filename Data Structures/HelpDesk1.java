
public class HelpDesk1 extends LLStack implements StackInterface{
	private int time;
	private boolean status = false;//keep track of status
	private String log = new String();//for log printing
	private LLStack<Student> stack = new LLStack<Student>();
	
	public void step()
	{
		time++;
		
		if(!status)
			log = log + ("Time " + time + ", idle." + "\n");
		
	}
	
	public void addStudent(String name, int course, int workload) throws StackUnderflowException{
		Student incoming = new Student(name, course, workload);//time = 2; payal,2100,3(time=4; Julia,2000,2)
		do{
			do{
				step();
				workload--;
				if(stack.isEmpty()|| stack.top().getCourse() > incoming.getCourse()){ 
					stack.push(incoming);
				}
			}
			while(workload>0);
		}
		while(time<=20);
	}
		
	public int getTime()
	{
		return time;
	}
				
	public String toString()
	{
		if ((status) && (!stack.isEmpty()))//need to check whether stack is not empty
		{
			return ("Time " + time + ", helping " );//+ stack.top().getName() + " from COSC" + stack.top().getCourse() + " for " + stack.top().getWork() + " minutes.");
		}
		else
		{
			return ("Time" + time + ", idle.");
		}
	}
		
	public String getLog()
	{
		return log;
	}
	
}	

