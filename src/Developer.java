import java.util.List;

public class Developer implements Employee {
	
	private String firstName;
	private String lastName;
	private double salary;

	public Developer(String firstName, String lastName, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	@Override
	public void addChildEmployee(Employee e) {
		//This is leaf node, so no child node present
	}

	@Override
	public void removeChildEmployee(Employee e) {
		//This is leaf node, so no child node present
		
	}

	@Override
	public Employee getChildEmployee(int i) {
		//This is leaf node, so no child node present
		return null;
	}

	@Override
	public List<Employee> getAllChildEmployees() {
		//This is leaf node, so no child node present
		return null;
	}

	@Override
	public String getName() {
		return firstName + " " + lastName;
		
	}

	@Override
	public double getSalary() {
		return salary;
	}

	@Override
	public void print() {
		this.toString();
		
	}

	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("Employee Details For Developer " + getName() + " ---- ");
		strBuilder.append("\n\t\tFirst name: " + firstName);
		strBuilder.append("\tLast name: " + lastName);
		strBuilder.append("\tSalary: " + salary);
		return strBuilder.toString();
	}

}
