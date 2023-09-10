package zoho;

public class InheritanceDemo3 {
public static void main(String[] args) {
	
	Animal dog=new Dog();
	Animal cat=new Cat();
	dog.makeSound();
	cat.makeSound();
}
}

abstract class Animal {
	abstract void makeSound();
}

class Cat extends Animal {
	@Override
	void makeSound() {
		System.out.println("Cat Meow");
	}
}

class Dog extends Animal{
	@Override
	void makeSound() {
		System.out.println("Dog Bark");
	}
}
