package oops2;

public class Sample {
	private int a,b;
	
	public Sample(){
		System.out.println("this is default constructor");
	}
	
	public Sample(int a ,int b){
		this.a =a;
		this.b = b;
		System.out.println("this paarmeterize construnctor");
		
	}
	public void read(int a, int b){
		this.a =a;
		this.b =b;
	}
	public void show(){
		System.out.println(a);
		System.out.println(b);
	}
	 public void sum(){
		 System.out.println("sum is : " + (a+b));
	 }
	public static void main(String[] args) {

		Sample obj = new Sample();
		obj.read(10,20);
		obj.show();
		obj.sum();
		
		Sample obj1= new Sample(100,200);
		obj1.show();
		obj1.sum();
		
	}

}
