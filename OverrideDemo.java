package zohoString;

public class OverrideDemo {

	public static void main(String[] args) {
//		EngineerEmployee ee=new EngineerEmployee();
//		ee.work();
		
		Employee ee=new JuniorEmp();
		ee.work();
		System.out.println(ee.i);
		
	}
}

class Employee{
	int i=100;
	public void work() {
		System.out.println("Parent work met Called");
	}
}

class EngineerEmployee extends Employee{
	
//	public void work() {
//		super.work();
//		System.out.println("student work met Called");
//	}
}

class JuniorEmp extends EngineerEmployee{
	public void work() {
		super.work();
		System.out.println("juniorEmp work met Called");
	}
}

