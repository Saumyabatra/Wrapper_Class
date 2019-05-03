package newPackage;
class wrapper_class {
	public static void main(String args[]){
		int i=10;
		Integer a=Integer.valueOf(i);
		System.out.println(a);//converting int to Int
		String str=String.valueOf(a);
		System.out.println("The string is:"+str);
		String s2="10";
		int s=Integer.parseInt(s2);
		System.out.println("The integer is :"+s);
		String str1=String.valueOf(i);
		System.out.println("the int converted to String:"+ str1);
		
		
		
		
	}
}
