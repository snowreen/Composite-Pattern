import java.util.List;

public interface Employee {
	
	public void addChildEmployee(Employee e);
	
	public void removeChildEmployee(Employee e);
	
	public Employee getChildEmployee(int i);
	
	public List<Employee> getAllChildEmployees();
	
	public String getName();
	
	public double getSalary();
	
	public void print();
	
	
}
