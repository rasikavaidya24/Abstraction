abstract class parent
{
	abstract void m1();
	abstract void m2();

	 void m3()
	 {
	 System.out.println("hello from grandfather");
	 }
}
 class child1 extends parent
 {
 	void m2()
 	{
 		System.out.println("m2()implements by child1");
 	}
 	abstract void m4();
}
 class child2 extends parent
 {
 	void m1()
 	{
 		System.out.println("m1() implements child2");
 	}
 	void m2()
 	{
 		System.out.println("m2()implements child2");
 	}
 	void m5()
 	{
 		System.out.println("m5()implements child2");
 	}
 }
 class subchild extends child1
 {
 	void m1()
 	{
 		System.out.println("m1() implements subchild");
 	}
 	void m4()
 	{
 		System.out.println("m4() implements subchild");
 	}

 }
 class Driver
 {
 	public static void main(String[] args) {
 		child2 obj = new child2();
 		subchild obj1 = new subchild();
 		obj.m3();
 		obj1.m3();
 		obj.m1();
 		obj.m2();
 		obj.m5();
 		obj1.m4();
 		obj1.m2();
 		obj1.m1();

 	}
 }




