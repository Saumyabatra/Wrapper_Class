package newPackage;

public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Cloning c1=new Cloning();
			System.out.println(c1.name+" "+c1.age);
			c1.SetAge(21);
			c1.SetName("Rohan");
			c1.GetNameage();
			Cloning c2=(Cloning)c1.Clone();
			c2.GetNameage();
		}
		catch(CloneNotSupportedException c){}
		

	}

}
