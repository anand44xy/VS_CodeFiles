@FunctionalInterface //Single Abstract Method(SAM) is known as Functional Iterface
interface CLS
{
	int getLength(String s);
	
}

public class AnonInner2 {

	public static void main(String[] args) 
	{    
		// Anonymous Class 
		CLS c= new CLS() { //here 'c' is the subclass of CLS
			
			public int getLength(String s)
			{
				int res=s.length();
				return res;
			}
			
		};
		
	System.out.println(c.getLength("Alien"));

	}

}
