import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		BufferProcessor bf = new BufferProcessor();
		
		System.out.print("Put the word you want to find: ");
		
		String word = sc.nextLine();
		bf.findBySplit(word);
	}
}
