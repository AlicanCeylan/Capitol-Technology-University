package course;

public class Ch_13_13 {

	public static void main(String[] args) throws CloneNotSupportedException {
		//create a course object
		Course course1 = new Course("Intermediate Java Programming");
		
		//add students to course1
		course1.addStudent("Alican Ceylan");
		course1.addStudent("Nicholas Thomas");
		course1.addStudent("Mike Yelverton");
		
		//clone course1
		Course course2 = course1.clone();
		
		//add students to course2
		course2.addStudent("Nicholas Jones");
		course2.addStudent("Alex Oliverio");
		course2.addStudent("Brenda Liffers");
		
		//display students in course1
		System.out.println("\nNumber of students in course1: " + course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for(int i = 0; i < course1.getNumberOfStudents(); i++)
		{
			System.out.print(students[i] + ", ");
		}
		System.out.println();
		
		//display students in Course2
		System.out.println("\nNumber of students in course2: "
				+ course2.getNumberOfStudents());
			String[] students2 = course2.getStudents();
			for (int i = 0; i < course2.getNumberOfStudents(); i++)
				System.out.print(students2[i] + ", ");
			System.out.println();
	}

}
