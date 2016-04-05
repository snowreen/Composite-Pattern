
public class Main {
	
	public static void main (String[] args){
		
		Employee ceo = new Employee("Syeda", "Nowreen", "123", "Chicago IL", "1234454332", "CEO");
		Employee manager = new Employee("Kate", "Smith", "456", "Chicago,IL", "7273214234", "Manager");
		Employee itHead = new Employee("John", "Snow", "786", "Chicago,IL", "2132312432", "IT Head");
		Employee salesHead = new Employee("Kathy", "Melon", "342", "Chicago,IL", "5424334323", "Sales Head");
		Employee hrHead = new Employee("Adams", "Smith", "213", "Chicago,IL", "1322132324", "HR Head");
		Employee juniorManager = new Employee("Bella", "Kardin", "423", "Chicago,IL", "64352324324", "Junior Manager");
		
		ceo.addEmployee(itHead);
		ceo.addEmployee(hrHead);
		ceo.addEmployee(salesHead);
		
		itHead.addEmployee(manager);
		manager.addEmployee(juniorManager);
		
		System.out.println(ceo.toString() + "\n");
		System.out.println(itHead.toString() + "\n");
		System.out.println(manager.toString() + "\n");
		
		
	}

}
