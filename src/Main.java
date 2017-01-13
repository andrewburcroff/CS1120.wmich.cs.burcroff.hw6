
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Instructor myInstructor = new Instructor("Kramer", "Shawn", "RH3010");
		TextBook myTextBook = new TextBook("Java Programming" , "Adams" , "Pears");
		Course myCourse = new Course("Intro to Math", myInstructor, myTextBook);
		
		Instructor my2Instructor = new Instructor("Travis", "January", "BH2001");
		TextBook my2TextBook = new TextBook("Glass" , "Stevens" , "IDE");
		Course my2Course = new Course("Intro to Science", my2Instructor, my2TextBook);
		
		System.out.println(myCourse);
		System.out.println();
		System.out.println(my2Course);
	}

}
