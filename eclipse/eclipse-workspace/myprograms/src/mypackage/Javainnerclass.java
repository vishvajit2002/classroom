package mypackage;
class  Outerclass
{
	int x=10;
	class Innerclass
	{
		int y=5;
	}
}
public class Javainnerclass 
{
	public static void main(String[] args) 
	{
		Outerclass obj=new Outerclass();
		//outerclassname.Innerclassname Innerclassobject=outerclassobject.new Innerclassname
		Outerclass.Innerclass obj1=obj.new Innerclass();
		System.out.println(obj.x + obj1.y);
				
	}

}
