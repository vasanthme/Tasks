package Association.OneToOne;

public class Student {

	// Non-Static Variable/Instance Variable,Fixed
	private String Name;
	private int Id;
	private GENDER Gender;
	private int Age;
	private String Batch;
	private String Program;

	// Parameterized Constructor
	public Student(String name, int id, GENDER gender, int age, String batch, String program) {
		super();
		this.Name = name;
		this.Id = id;
		this.Gender = gender;
		this.Age = age;
		this.Batch = batch;
		this.Program = program;
	}

	// Getter and Setter Method
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public GENDER getGender() {
		return Gender;
	}

	public void setGender(GENDER gender) {
		this.Gender = gender;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		this.Age = age;
	}

	public String getBatch() {
		return Batch;
	}

	public void setBatch(String batch) {
		this.Batch = batch;
	}

	public String getProgram() {
		return Program;
	}

	public void setProgram(String program) {
		this.Program = program;
	}

	public void StudentDetails(String name, int Id, String program, String batch) {
		if (name == this.Name && Id == this.Id) {
			if (program == this.Program) {
				System.out.println("Student is registered for:" + getProgram());
			}

		} else {
			System.err.println("Student is from different Program");
		}

	}

}
