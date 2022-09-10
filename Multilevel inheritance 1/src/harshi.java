
public class harshi {
	int a=100;
String name= "java";
	void harshi()
	{
		System.out.println("harshitha computers");
	}
}
class bhavya extends harshi
{
	void bhavya()
	{
		System.out.println(a+"-----"+name);
	}
}
class demo extends bhavya
{
	int a=200;
	String name="phython";
	void display()
	{
System.out.println(a+"----"+name);
	}
	public static void main(String args[])
	{
		bhavya p=new bhavya();
		p.harshi();
		p.bhavya();
		demo h=new demo();
		h.display();
	}
}
