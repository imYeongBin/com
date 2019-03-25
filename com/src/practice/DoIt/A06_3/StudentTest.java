package practice.DoIt.A06_3;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student();
		Student studentSon = new Student();
		
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.studentID);
		System.out.println(studentLee.studentName+", 학번: "+studentLee.studentID);
		
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.studentID);
		System.out.println(studentSon.studentName+", 학번: "+studentSon.studentID);
	}

}
