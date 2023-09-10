package zoho;

public class ClassVariableAndInstanceVariable {
public static void main(String[] args) {
	
	Ic i1=new Ic();
	i1.iVaraiable=10;
	Ic.cVariable=20;
	
	Ic i2=new Ic();
	i2.iVaraiable=30;
	Ic.cVariable=40;
	
	System.out.println(i1.iVaraiable);
	System.out.println(Ic.cVariable); // class variable
	System.out.println(i2.iVaraiable);// instance variable.
	System.out.println(Ic.cVariable);
	
}
}

class Ic{
	int iVaraiable;
	
	static int cVariable;
}
