package oops;

public class Student {
	int id;
	String name;
	public Student(){
		System.out.println("this is default constructor");
		
	}
	
	public Student(int id, String name){
		this.id =id;
		this.name = name;
	}
	public void details(){
		System.out.println(id);
		System.out.println(name);
	}

}
