
public class Course {
	
	private String courseName;
	private Instructor instructor;
	private TextBook textbook;
	
	public Course(String name, Instructor instr, TextBook text){
		courseName = name;
		instructor = new Instructor(instr);
		textbook = new TextBook(text);
	}
	
	public String getName(){
		return courseName;
	}
	
	public Instructor getInstructored(){
		return new Instructor(instructor);
	}
	
	public TextBook getTextBook(){
		return new TextBook(textbook);
	}
	
	public String toString(){
		String str = "Course: " + courseName + "\nInstructor Information: \n" + instructor + "\nTextbook Information: " + textbook;
		return str;
	}
}
