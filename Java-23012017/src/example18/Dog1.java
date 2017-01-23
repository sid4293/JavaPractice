package example18;

class Animal
{
	String a=null;
}
public class Dog1 extends Animal {
	static void method(Animal a){
		Dog1 d=(Dog1) a;
		System.out.println("Downcasting");
	}
	public static void main(String[] args) {
		Animal a=new Animal();
		Dog1.method(a);
		
	}

}
