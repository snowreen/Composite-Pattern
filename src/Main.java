
public class Main {
	
	public static void main (String[] args){
		
		Employee generalManager = new Manager("Syeda", "Nowreen", 100000);
		Employee manager = new Manager("Kate", "Smith", 70000);
		Employee developer1 = new Developer("John", "Snow", 50000);
		Employee developer2 = new Developer("Kathy", "Melon", 40000);
		
		generalManager.addChildEmployee(manager);
		manager.addChildEmployee(developer1);
		manager.addChildEmployee(developer2);
		
		System.out.println(generalManager.toString() + "\n");
		
		
	}

}
