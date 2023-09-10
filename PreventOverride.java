package zoho;

public class PreventOverride {

	// Methods declared as final cannot
//	be overridden.

//	Because meth( ) is declared as final, it cannot be overridden in B. If you attempt to do
//		so, a compile-time error will result.

	public static void main(String[] args) {

	}
}

class A3 {
	final void meth() {
		System.out.println("This is a final method.");
	}
}

class B3 extends A3 {
//void meth() { // ERROR! Can't override.
//System.out.println("Illegal!");
}
//}
