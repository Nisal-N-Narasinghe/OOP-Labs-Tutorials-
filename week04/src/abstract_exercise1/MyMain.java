package abstract_exercise1;

public class MyMain {

	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.eat();
		dog.makeSound();
		
		Animal cat = new Cat();
		cat.eat();
		cat.makeSound();

	}

}
