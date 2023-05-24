package abstractpkg;

public class MainClass {

	public static void main(String[] args) 
	{
		//AbstractClass obj=new AbstractClass();  -->error
		
		AbstractChild obj= new AbstractChild();
		obj.display();
		
		/* AbstractClass obj1=new AbstractChild();
		   obj1.display();
		   obj1.print();
	       obj1.hello();
		*/
		
	}

}
