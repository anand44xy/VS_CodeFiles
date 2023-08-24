import java.util.Scanner;

class Books{
	private int pgNo;
	
	public void setPgNo(int x){

		if(x>0)
		{
		pgNo=x;
		}
		else
		{
			System.out.println("Invalid input to my property");
		}
	}
	public int getPgNo()
	{
		return pgNo;
	}
	
}


public class LaunchEncap {

	public static void main(String[] args) {
	    Scanner scn=new Scanner(System.in);
		
		Books b=new Books();

		System.out.println("Enter the page number: ");
		int PageInput=scn.nextInt();
		b.setPgNo(PageInput);

		int pageNO=b.getPgNo();
		System.out.println("Page Number of the book is: "+pageNO);
		scn.close();;

		//b.pgNo=-100; error
		//System.out.println(b.pgNo);

		// b.setPgNo(100);
		// System.out.println(b.getPgNo());

	}

}
