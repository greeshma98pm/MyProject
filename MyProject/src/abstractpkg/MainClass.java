package abstractpkg;

public class MainClass {

	public static void main(String[] args) 
	{
	//AbstractClass obj=new AbstractClass();  error,not able to create obj for abstract class
		
		AbstractChild obj= new AbstractChild();
		obj.display();
		
		/* AbstractClass obj1=new AbstractChild();  //parent class obj= new child 
		   obj1.display();                  //parent can hold all objects of child. 
		   obj1.print();     //but if child has any new methods other than parent, not able to access through this obj. 
	       obj1.hello();        //    error as it is defined in child.     
		*/
		
	}

}
