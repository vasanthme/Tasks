package Association.OneToMany;

import java.util.Date;

public class TestOneToMany {

	public static void main(String[] args) {

		Department dept = new Department("101", "HR", "Thomas", 25);

		Employee[] employ = new Employee[4];

		employ[0] = new Employee(101, "Arun", GENDER.MALE, "Associate", "Peramanent", new Date(), "arun@gmail.com");
		employ[1] = new Employee(102, "Aarthi", GENDER.FEMALE, "RECRUITER", "Contract", new Date(), "aarthi@yahoo.com");
		employ[2] = new Employee(103, "Varun", GENDER.MALE, "Lead", "Permanent", new Date(), "varun@hotmail.com");
		employ[3] = new Employee(104, "Divya", GENDER.FEMALE, "Manager", "Permanent", new Date(), "div@gmail.com");

		dept.setEmployees(employ);

		for (Employee employees : dept.getEmployees()) {

			System.out.println(dept.getName() + "   :   " + employees.getId() + "   :   " + employees.getName()
					+ "   :   " + employees.getDesignation() + "   :   " + employees.getJobstatus());

		}

	}

}
