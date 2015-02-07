public class HelpDesk3 extends LLStack implements StackInterface{
	//private int help;
	private int time = 0;
	private boolean notBusy = true;
	private Student incoming;
	private Student current;
	private LLStack<Student> wait = new LLStack<Student>();
	private String log = "";

	public void step() throws StackUnderflowException{
		time++;
		if(!isEmpty()){
			wait.top().decrementHelp();
			if(wait.top().getHelp() == 0)
			{
					System.out.println("inside if loop wait.top().getHelp() = " + wait.top().getHelp());
					log += "Time " + time + "," + " Finished helping " + wait.top().getName() + " from " + wait.top().getCourse();
					wait.pop();
					//System.out.println("inside if loop after pop name: " + wait.top().getName());
					log += "Time " + time + "\n";
			}
		}
		/*else{
			toString();
		}*/
	}
	public void addStudent(String name, int course, int work) throws StackUnderflowException{
		incoming = new Student(name, course, work);
		if(!wait.isEmpty()){
			current = wait.top();
			wait.top().setHelp(work);
			if(incoming.getCourse() < current.getCourse()){
				wait.push(incoming);
				wait.top().setHelp(work);
				//wait.top().decrementHelp();
				//if(wait.top().getHelp() == 0){
				//wait.pop();
				//log += "Time " + time + " Finished helping " + wait.top().getName() + " from " + wait.top().getCourse();
				//}
				
		   
			}
			else{
				log += "Time " + time + " Turned away " + incoming.getName() + " from COSC " + incoming.getCourse() + "\n";
			}
		}
		else{
				wait.push(incoming);
				wait.top().setHelp(work);
				//wait.top().decrementHelp();
				log += "Time " + time + ", " + "Helping" + " " + incoming.getName() + " from COSC" + incoming.getCourse() + "\n";
		}
				
	}
		
	
	public String toString(){
		if(wait.isEmpty()){
			return "Time " + time + ", idle";
		}
		else{
			try {
				return "Time " + time + ", " + "Helping " + wait.top().getName() + " from " + wait.top().getCourse();
			} catch (StackUnderflowException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "";
	}
	public int getTime(){
		return time;
	}
	public String getLog()
	{
		return log;
	}
}
