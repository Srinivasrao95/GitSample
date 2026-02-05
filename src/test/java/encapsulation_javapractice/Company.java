package encapsulation_javapractice;

public class Company {

	public static void main(String[] args) {
	Employee emp=new Employee();
	emp.setempid(12107);
	System.out.println("Employoee id: "+emp.getempid());
    emp.setName("Srinivas");
    System.out.println("Employee name: "+emp.getName());
    emp.setSalery(111111.11);
    System.out.println("Employee name: "+emp.getSalery());
	}

}
