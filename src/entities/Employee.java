package entities;

public class Employee {

	private int id;
	private String name;
	private Double salary;
	
	public Employee() {
	}

	public Employee(int id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public Double getSalary() {
		return salary;
	}

	public String toString() {
		return "Id: " + getId() + ", " + getName()
				+ ", salary $"
				+ String.format("%.2f", getSalary());
	}
	
}
