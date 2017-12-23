package Association.OneToOne;

public class TestOneToOne {

	public static void main(String[] args) {

		Student stud = new Student("John", 1001, GENDER.MALE, 19, "2017-2019", "MS");

		Course cour = new Course("Electronics", "EL100", "Wireless Networking", "3rd");

		cour.student = stud;
		System.out.println("Accessing Student Class Information from Course Class Using Association:");
		System.out.println("Student Name is:" + cour.student.getName());
		System.out.println("Student Id is:" + cour.student.getId());
		System.out.println("Program Registered is:" + cour.student.getProgram());
		System.out.println("Batch is:" + cour.student.getBatch());

		System.out.println("--------------------------------------------");

		stud.StudentDetails("John", 1001, "MS", "2017-2019");
		stud.StudentDetails("Mike", 1005, "MS", "2017-2019");

	}

}
