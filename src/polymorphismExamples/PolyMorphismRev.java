package polymorphismExamples;

public class PolyMorphismRev {

	public static void main(String[] args) {

		A obj1 = new A("Jack", 25);
		B obj2 = new B(10, "David", 45);
		C obj3 = new C();
		obj3.setName("Mike");
		obj3.setAge(25);

		obj3.printOBJ(obj1);
		obj3.printOBJ(obj2);
		obj3.printOBJ(obj3);

		// when you are doing up-casting, you can only access the methods of the class
		// that you declared

	}
}
