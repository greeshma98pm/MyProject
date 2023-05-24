package abstractpkg;

public class PrintClass implements InterfaceEg{

	public static void main(String[] args) 
	{
		
		PrintClass obj=new PrintClass();
		obj.print1();
	}

	@Override
	public void print1() {
		System.out.println("print method");
		
	}

	

}
