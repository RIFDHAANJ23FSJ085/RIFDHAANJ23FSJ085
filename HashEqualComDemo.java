package zoho;

public class HashEqualComDemo {

	public static void main(String[] args) {
		
		String s1=new String("Hello");
		String s2=new String("Hello");
		
		System.out.println(s1==s2); // this will check memory location
		System.out.println(s1.equals(s2)); // this will check object  comparision  the value inside the object
		
		System.out.println(s1.hashCode()+" : "+s2.hashCode());
		
		Data a=new Data("Rifdhan");
		Data b=new Data("Rifdhan");
		
		System.out.println(a.hashCode()+":"+b.hashCode());
		System.out.println(a.equals(b));
	}
	
}

class Data{
	private String name;
	
	public Data(String a) {
		this.name=a;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Data d=(Data)obj;
		return this.name.equals(d.name);
	}
}
