import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
	
	private String firstName;
	private String lastName;
	private double salary;
	private List<Employee> subordinate = new ArrayList<Employee>();
	
	//constructor 
	public Manager (String firstName, String lastName, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	@Override
	public void addChildEmployee(Employee e) {
		subordinate.add(e);	
	}
	
	@Override
	public void removeChildEmployee(Employee e) {
		subordinate.remove(e);
	}
	
	@Override
	public Employee getChildEmployee(int i) {
		return subordinate.get(i);
	}
	
	@Override
	public List<Employee> getAllChildEmployees() {
		return subordinate;
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
		strBuilder.append("Employee Details For " + getName() + " ---- ");
		strBuilder.append("\n\tFirst name: " + firstName);
		strBuilder.append("\tLast name: " + lastName);
		strBuilder.append("\tSalary: " + salary);
		if (subordinate.size() > 0) {
			strBuilder.append("\n\tSubordinates are given below : \n");
			for (Employee emp : subordinate) {
				strBuilder.append("\t\t" + emp.toString() + "\n");
			}
		}
		return strBuilder.toString();
	}

}
