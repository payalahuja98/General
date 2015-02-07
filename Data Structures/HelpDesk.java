public class HelpDesk extends LLStack implements StackInterface{
	
	private int time;//current time
	private int help;//how long student needs help
	private boolean status = false;//keep track of status
	private Student current = null;//sets
	private String log = new String();//for log printing
	@SuppressWarnings("unused")
	private LLStack<Student> wait = new LLStack<Student>();

	public void step()
	{
		time++;
		
		if(!status)
			log = log + ("Time " + time + ", idle." + "\n");
		
	}
	
	public void addStudent(String name, int course, int workload) throws StackUnderflowException
	{
		Student incoming = new Student(name, course, workload);//time = 2; payal,2100,3(time=4; Julia,2000,2)
		/*if(incoming student.course<helped student.course)
		 * push helped student onto stack keep note of pending workload
		 * and helped student = current student
		 * else
		 *   continue with increasing time and reducing workload
		 *   
		 *  if(helped 
		  
		
		//incoming = current*/
		
		System.out.println("Is it empty? " + wait.isEmpty());
		wait.push(incoming);
		System.out.println("Is it empty? " + wait.isEmpty());
		//wait.push(current);
		//status = true;
		System.out.println("Top name: " +wait.top().getName() + " " +"Time: " + time);
	 do{
		/*if(!status)
		{
			current = incoming;
			//System.out.println("if!status");
			help = current.getWork();
			System.out.println("Success.");
			status = true;
		}
		else
		{
			//current = incoming;
			
			System.out.println("else loop entered");
			if (incoming.getCourse() >= current.getCourse())
			{	
				System.out.println("if icourse > ccourse");
				
				log = log + ("Time " + time + ", Turned away " + incoming.getName() + "From " + incoming.getCourse() + "\n");
				
			}
			else
			{
				System.out.println("if icourse < ccourse");
				//current = incoming;
				incoming = current;
				help = current.getWork();
				status = true;
			}
		}*/
//		
		
		 //System.out.println("Current student: " + current.getCourse());
			System.out.println("Incoming student: " + incoming.getCourse());
		 if(current == null || current.getCourse() < incoming.getCourse()){
			current = incoming;
			help = workload;
			System.out.println("Help = " + help);
		}
		while(help > 0)
		{
			
			help--;
			log = (log + "Time " + time + ", Helped " + incoming.getName() + " From " + incoming.getCourse() + "\n");
			System.out.println("Time within while loop: " + time);
			status = true;
			step();
			System.out.println("Current student: " + current.getCourse());
			System.out.println("Incoming student: " + incoming.getCourse());
			if (current.getCourse() > incoming.getCourse())
			{	
				wait.push(current);
				System.out.println("Current student: " + current.getName());
				System.out.println("Incoming student: " + incoming.getName());
				//current = incoming;
				help=0; 
				
			}
			
							
		}	
		
		
		
		/*//if(!(((StackInterface) wait.top()).isEmpty())){
		if(!isEmpty()){
			//addStudent(wait.top().getName(),wait.top().getCourse(),wait.top().getWork());
			//wait.pop();
			System.out.println("Entered isEmpty loop");
			wait.push(current);
		}
		//wait.pop();
		System.out.println("Time after if statement: " + time);
		status = false;*/
	 }
	  while(time == 20);
		
	 
		
			
	}
	
	public int getTime()
	{
		return time;
	}
	
	
	public String toString()
	{
		if (status)
		{
			return ("Time " + time + ", helping " + current.getName() + " from COSC" + current.getCourse() + " for " + current.getWork() + " minutes.");
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


