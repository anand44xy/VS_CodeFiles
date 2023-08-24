class Alien2
{
	private int age;
	private String name;
	
	public Alien2(int age, String name){
		
		this.age=age;
		
		this.name=name;
	}
	
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}



public class LaunchE {

	public static void main(String[] args) {
		
		Alien2 a=new Alien2(10, "Telusko");
		System.out.println(a.getAge());
		System.out.println(a.getName());

	}

}
