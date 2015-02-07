import java.util.ArrayList;
public class CourseRoster{
	private ArrayList<String> students = new ArrayList<String>();
	
	public void addStudent(String studentName){
		students.add(studentName);
	}
	public ArrayList<String> getRandomOrder(int randNum){
		ArrayList<String> newStudents = students;
		int temp = 0;
		for(int i = 0; i < randNum; i++){
			System.out.println("x");
			//newStudents = new ArrayList<String>();				//for(a = 0; a < 4; a++)
			for(int b = 1; b < students.size(); b++){			//for(b = 0; b < 4; b++)	
				newStudents.add(newStudents.get(b));				//newStudents.add(students.get(0))
			}
			newStudents.add(newStudents.get(0));					//newStudents.add(students.get(0))
			
		}
		return newStudents;
	}
}


/*The CourseRoster class represents a list of students who are all taking the same period
  of a particular course at their school. A teacher wishes to use CourseRoster not only to 
  keep track of which students are in each period, but also to help her create random groups 
  for projects or select a random order for presentations.  
 
 The CourseRoster class contains one attribute, a data structure that stores the list of students,
 and the following two methods:
	addStudent, which takes a String representing a student’s name as input and appends her name
	 to the list of students
	getRandomOrder, which takes an integer as input and returns a list of students in random order.*/