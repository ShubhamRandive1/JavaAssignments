package Q3;

public class Main {
	
	

		
		public static String generatePerson(Person person, Student student) {
			return person+" "+student;
		}
			
		
  	
		
		
		public static void main(String[] args) {
			
			
			Student student = new Student();
			
			Instructor instructor = new Instructor();
			
			student.studentId = 17;
			
			student.courseFee = 444;
			
			student.courseEnrolled = "web17";
			
			instructor.gender = "male";
			
			instructor.instructorId = 1777;
			
			generatePerson(instructor,student);
			
		
			
		}
		
		
		public String toString(Person Student, Student Personn) {
			return generatePerson(Student, Personn
					);
		}
		
}
