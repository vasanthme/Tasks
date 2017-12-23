package Association.OneToMany;

public class Department {

	private String id;
	private String name;
	private String deptManager;
	private int deptSize;

	private Employee[] employees;

	public Department(Employee[] employees) {
		super();
		this.employees = employees;
	}

	public Department(String id, String name, String deptManager, int deptSize) {
		super();
		this.id = id;
		this.name = name;
		this.deptManager = deptManager;
		this.deptSize = deptSize;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeptManager() {
		return deptManager;
	}

	public void setDeptManager(String deptManager) {
		this.deptManager = deptManager;
	}

	public int getDeptSize() {
		return deptSize;
	}

	public void setDeptSize(int deptSize) {
		this.deptSize = deptSize;
	}

}
