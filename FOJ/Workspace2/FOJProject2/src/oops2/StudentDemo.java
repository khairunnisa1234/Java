package oops2;


class Student{
    private static int nextId = 1; // Static variable to keep track of the next id

	private int id;
	private String name;
	private String dept;


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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	} 
//	public Student(int id){
//		this.id = id;
//	}

    public Student() {
        this.id = nextId++; // Incrementing id for each new object
    }
	public Student( String name, String dept) {
		//super();
		this();
		this.name = name;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
}
public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student("khairun","cse");
		System.out.println(s1);
		
		Student s2 = new Student("pranathi","ece");
		System.out.println(s2);
		

		Student s3 = new Student("lavnaya","eee");
		System.out.println(s3);
		
		Student s4 = new Student("tharun","eee");
		System.out.println(s4);
		
	}

}
