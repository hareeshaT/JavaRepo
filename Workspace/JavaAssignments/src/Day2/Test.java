package Day2;

class Parent {}

class Child1 extends Parent {}

class Child2 extends Parent {}

public class Test {

	public static void main(String[] args) {
		        Parent p = new Parent();
		        Child1 c1 = new Child1();
		        Child2 c2 = new Child2();

		        System.out.println(c1 instanceof Parent); // true, Child1 is a subclass of Parent
		        System.out.println(c2 instanceof Parent); // true, Child2 is a subclass of Parent
		        System.out.println(p instanceof Child1);   // false, p is an instance of Parent, not Child1
		        System.out.println(p instanceof Child2);   // false, p is an instance of Parent, not Child2

		        p = c1; // Assigning a Child1 object to a Parent reference
		        System.out.println(p instanceof Child1);   // true, p is now a Child1 object
		        System.out.println(p instanceof Child2);   // false, p is not a Child2 object

		        p = c2; // Assigning a Child2 object to a Parent reference
		        System.out.println(p instanceof Child1);   // false, p is not a Child1 object
		        System.out.println(p instanceof Child2);   // true, p is now a Child2 object

	}

}
