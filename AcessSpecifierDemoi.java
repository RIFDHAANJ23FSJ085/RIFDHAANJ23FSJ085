package zohoString;

public class AcessSpecifierDemoi {

	int nomod;
	private int pri;
	protected int pro;
	public int pub;
	
	public void met() {
		System.out.println(pri);
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
	
}

class Difpack extends AcessSpecifierDemoi{
	public void met() {
//		System.out.println(pri);
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
}

class AccessDemoNonSub {
	public void met() {
	AcessSpecifierDemoi obj=new AcessSpecifierDemoi();
	//	System.out.println(obj.pri);//private is not visible outside the class
		System.out.println(obj.nomod);
		System.out.println(obj.pro);
		System.out.println(obj.pub);
	}	
}
