import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String firstName;
	private String lastName;
	private String employeeId;
	private String address;
	private String phone;
	private String position;
	private List<Employee> subordinate = new ArrayList<Employee>();
	
	//constructor 
	public Employee (String firstName, String lastName, String employeeId, String address, String phone, String position) {
		this.firstName = firstName;
		this.employeeId = employeeId;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.position = position;
	}
	
	public void addEmployee(Employee e) {
		subordinate.add(e);	
	}
	
	public void removeEmployee(Employee e) {
		subordinate.remove(e);
	}
	
	public List<Employee> getEmployee(Employee e) {
		return subordinate;
	}

	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("Employee Details For " + position + " ---- ");
		strBuilder.append("\n\tFirst name: " + firstName);
		strBuilder.append("\tLast name: " + lastName);
		strBuilder.append("\tEmployee Id: " + employeeId);
		strBuilder.append("\tAddress: " + address);
		strBuilder.append("\tPhone: " + phone + "\n");
		if (subordinate.size() > 0) {
			strBuilder.append("\tSubordinates for " + position + " given below : \n");
			for (Employee emp : subordinate) {
				strBuilder.append("\t" + emp.toString());
			}
		}
		return strBuilder.toString();
	}


	
	
	
	
}
