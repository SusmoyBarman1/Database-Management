import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		DeleteOperator dl = new DeleteOperator();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Put the word you want to delete: ");
		String word = sc.nextLine();
		
		dl.deleteBySplit(word);
	}

}
