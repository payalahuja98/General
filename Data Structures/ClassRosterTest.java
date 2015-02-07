import java.util.Scanner;
import java.util.ArrayList;
public class ClassRosterTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		CourseRoster c = new CourseRoster();
		for(int i = 0; i < 4; i++){
			c.addStudent(input.nextLine());
		}
		ArrayList<String> newOrder = c.getRandomOrder(3);
		
		System.out.print(newOrder);
		
	}
}
