public class myapplication{
	public static void main(String[] args){

		System.out.println("Hello World ! ");

		Person obj1=new Person();
		Person obj2=new Person();
		Person obj3=new Person();
		
		obj1.displayName();
		obj1.setName("Ben");
		obj1.setSurname("Butler");
		obj1.setAge(35);

		obj2.displayName();
		obj2.setName("Harry");
		obj2.setSurname("Potter");
		obj2.setAge(18);
		

		obj3.displayName();
		obj3.setName("Aaron");
		obj3.setSurname("Finch");
		obj3.setAge(29);

		System.out.println(obj1.getName());
		System.out.println(obj1.getSurname());
		System.out.println(obj1.getAge());

		System.out.println(obj2.getName());
		System.out.println(obj2.getSurname());
		System.out.println(obj2.getAge());

		System.out.println(obj3.getName());
		System.out.println(obj3.getSurname());
		System.out.println(obj3.getAge());
		
		

	}

}