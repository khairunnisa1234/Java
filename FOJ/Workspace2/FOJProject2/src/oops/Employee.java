package oops;

public class Employee {
	int id ;
	String name;
	int salary;
	int  phone;
	
	public Employee(int id, String name, int salary, int phone){
		this.id =id;
		this.name = name;
		this.salary = salary;
		this.phone = phone;
	}
	public void details(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);

		System.out.println(phone);

	} 

}
