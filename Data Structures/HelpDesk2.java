public class HelpDesk2 extends LLStack implements StackInterface{
	private int time;//current time
	private int currHelp;//how long student needs help//first student's end time(4)
	private int incomHelp;//second student's start time (3)
	private int help;//
	private Student current = null;//sets
	private boolean status = false;//keep track of status
	private String log = new String();//for log printing
	private LLStack<Student> wait = new LLStack<Student>();
	
	public void step() throws StackUnderflowException{
		time++;
		if(!isEmpty()){
			help = wait.top().getWork() - 1;
			if(wait.top().getWork() == 0){
				wait.pop();
			}
		}
	}
	public void addStudent(String name, int course, int work){
	Student incoming = new Student(name, course, work);//Payal,2100,3
	incomHelp = getTime();//2
	  if(status == false){//when idle 
		current = incoming;//incoming student payal at 2 becomes current student
		currHelp = getTime() + current.getWork() - 1;//2 + 3 - 1 = 4
		help = current.getWork();//for payal help = 3 at time 2; for Julia help=2 at time 3
	  }
	  System.out.println("Current student needs help for: " + current.getWork() );//debug
	  //do{
		  
		  System.out.println("At time: " + time + "Current help: " + currHelp + " Incoming help " + incomHelp);//for debug
		  if(currHelp >= incomHelp){
			  if(current.getCourse() > incoming.getCourse()){
				  current.setWork(help);
				  wait.push(current);
				  current = incoming;
				  help = current.getWork();//for payal help = 3 at time 2; for Julia help=2 at time 3
				  System.out.println("Help: " + help);
				  status = true;
			  }
		  }
	  
	  log = "Time " + getTime() + ", " + "Helping " + incoming.getName() + " from " + incoming.getCourse() + "\n";
      help--;//time 2 help = 2

	  }
	  //while(help > 0);
	  
	//}
	public int getTime()
	{
		return time;
	}
	public String getLog()
	{
		return log;
	}
	
}
