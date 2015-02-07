
public class PezCandy21 extends LLStack implements StackInterface{
	private boolean done = true;
	private LLStack<String> newPez = new LLStack<String>();
	public LLStack<String> takeYellow(LLStack<String> pez) throws StackUnderflowException{
		while(!done){
			if(pez.top() == "yellow"){
				pez.pop();
				newPez = pez;
			}
			if(pez.top() == null){
				return newPez;
			}
		}
		return null;
		
	}

}
/*only likes yellow ones
  take out all the candies one by one, eats yellow ones, keeps others in order*/