package Association.OneToMany;

import java.util.Date;

public class Employee {

	private int id;
	private String name;
	private GENDER gender;
	private String designation;
	private String jobstatus;
	private Date doj;
	private String email;

	public Employee(int id, String name, GENDER gender, String designation, String jobstatus, Date doj, String email) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.designation = designation;
		this.jobstatus = jobstatus;
		this.doj = doj;
		this.email = email;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GENDER getGender() {
		return gender;
	}

	public void setGender(GENDER gender) {
		this.gender = gender;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getJobstatus() {
		return jobstatus;
	}

	public void setJobstatus(String jobstatus) {
		this.jobstatus = jobstatus;
	}

	public Date getDate() {
		return doj;
	}

	public void setDate(Date doj) {
		this.doj = doj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
