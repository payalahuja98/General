//Julia Schmidt & Payal Ahuja
//Brookfield Central HS

public class HelpDesk4 {
	
	private int time = 0;
	private boolean notBusy = true;
	Student2 current = null;
	private LLStack<String> log = new LLStack <String>();
	private LLStack<Student2> wait = new LLStack<Student2>();
	
	//HelpDesk
		public void step() throws StackUnderflowException //advances time, helps students, and moves through wait stack
			{
				time++; //advances time
				
				if(!notBusy) //if someone is being helped
				{
					if(current.getHelp() > 0) //and they are not done being helped
					{
						current.helpThem();	//help them (help = help-1)
					}
					else if(wait.isEmpty()) //if the person being helped is done being helped & the wait stack is empty
					{
						notBusy = true;	//set the desk to empty
						log.push("Time " + time + ", Finished helping " + current.getName() + " from COSC " + current.getCourse() + "\n"); //log that the person is finished
					}
					else //if the person being helped is done being helped & the wait stack is not empty
					{
						log.push("Time " + time + ", Finished helping " + current.getName() + " from COSC " + current.getCourse() + "\n"); //log that the person is finished
						current = wait.top(); //help the next person from the wait stack
						wait.pop(); //removes person from wait stack
						notBusy = false; //set the desk to busy just in case
					}
				}
			}

		public void addStudent(String name, int course, int workload) //adds a student, determines whether to help them and who to put into wait stack
			{
				Student2 incoming = new Student2(name, course, workload); //create the incoming student
				if(notBusy)	//if the desk is empty
					{
						current = incoming;	//help the incoming student
						notBusy = false;	//set the desk to busy
						log.push("Time " + time + ", Started helping " + current.getName() + " from COSC" + current.getCourse() + "\n"); //log that the person is being helped
					}
				else if(incoming.getCourse() < current.getCourse()) //if the desk is not empty and the incoming student has priority
					{
						wait.push(current); //add the current student to the stack
						current = incoming;	//help the incoming student
						notBusy = false;	//set the desk to busy just in case
						log.push("Time " + time + ", Started helping " + current.getName() + " from COSC" + current.getCourse() + "\n"); //log that the person is being helped
					}
				else //if the desk is not empty and the current student has priority
					{
						log.push("Time " + time + ", Turned away " + incoming.getName() + " from COSC" + incoming.getCourse() + "\n");
					}	
				}
			
		
		public int getTime()
			{
				return time;
			}

		public String toString()
			{
				
				if(notBusy)
				{
					return "Time " + time + ", IDLE";
				}
				else
				{
					return "Time " + time + ", Helping " + current.getName() + " from COSC" + current.getCourse();
				}
			}	
				
		public String getLog() throws StackUnderflowException
			{
				String report = new String();
				while(!log.isEmpty())
				{
					report += log.top();
					log.pop();
				}
				
				return report;
			}

}
