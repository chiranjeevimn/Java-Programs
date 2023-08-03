//MultiLevel inheritence 
class SuperClassAnimal
{
	String name;
	SuperClassAnimal(String name)
	{
		this.name=name;
	}
	public void run()
	{
		System.out.println("Animal habit is running most of the time\n");
	}
}
class DerivedClassDog extends SuperClassAnimal
{
	String type;
	DerivedClassDog(String name,String type)
	{
		super(name);
		this.type=type;
	}
	public void eats()
	{
		System.out.println("Dog eat both veg and non-veg food\n");
	}
	public void print()
	{
		System.out.println("Animal type : "+type);
	}
}
class Cat extends DerivedClassDog
{
	String family;
	Cat(String name,String type, String family)
	{
		super(name,type);
		this.family=family;
	}
	public void roar()
	{
		System.out.print("Cat roars like meow\n");
	}
}
class Multilevel_Inheritence
{
	public static void main(String a[])
	{
		DerivedClassDog dog1= new DerivedClassDog("Rubee","pet");
		dog1.eats();
		dog1.run();
		dog1.print();
		Cat cat1 = new Cat("bantu","pet","Town_tiger");
		cat1.eats();
		cat1.run();
		cat1.print();
		cat1.roar();
	}
}