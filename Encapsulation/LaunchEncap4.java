class Alien1
{
	private int age;
	private String name;

	public Alien1(int age, String name) //Constructor replcae get and set method otherwiese we can say that it short the code in case of get and set metod
	{
		this.age=age;
		this.name=name;
	}
	
	/*
	 * public void setAge(int age) { this.age = age; } public void setName(String
	 * name) { this.name = name; }
	 */

	public String getName() 
	{
		return name;
	}
	 public int getAge() 
	 {
			return age;
		}
	}

public class LaunchEncap4 {

	public static void main(String[] args) {
		Alien1 a=new Alien1(10, "Telusko");
		
		System.out.println(a.getAge());
		System.out.println(a.getName());
		

	}

}
