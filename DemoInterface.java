package zohoString;

public class DemoInterface {
public static void main(String[] args) {
	Rifdhan rf=new Rifdhan();
	rf.doCode();
	rf.specifyGender();
}
}

interface programmer{
	public void doCode();
}

abstract class human{
	public abstract void specifyGender();
}

class Rifdhan extends human implements programmer{
	@Override
	public void doCode() {
		System.out.println("do java code..and UiUx Code.");	}
	@Override
	public void specifyGender() {
		System.out.println("Male ");
	}
}
