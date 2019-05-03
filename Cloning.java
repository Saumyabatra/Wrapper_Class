package newPackage;
public class Cloning implements Cloneable {
	String name;
	int age;
	Cloning()
	{
		name="Saumya";
		age=20;
	}
	public void SetName(String name){
		this.name=name;
	}
	public void SetAge(int age)
	{
		this.age=age;
	}
	public void GetNameage(){
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
	}
	public Object Clone()throws CloneNotSupportedException{
		return super.clone();
	}
}
