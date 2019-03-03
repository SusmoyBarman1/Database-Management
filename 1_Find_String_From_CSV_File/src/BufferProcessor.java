import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferProcessor 
{
	void findBySplit(String str) 
	{
		BufferedReader reader = null;
		try 
		{
			reader = new BufferedReader(new FileReader("D:\\Academic\\3-1\\Coding Assignment\\Database\\1_Find_String_From_CSV_File\\Data.csv"));
			String line = null;
			int lineNumber = 0;
			int stepCounter = 0; 
			
			while ((line = reader.readLine()) != null) 
			{
				lineNumber++;
				String[] words = line.split(",");
				
				for(int i=0;i<words.length;i++)
				{
					stepCounter++;
					if(str.equals(words[i]))
					{
						System.out.println("The word \""+str+"\" is found in line no.:- "+lineNumber+" by passing:- "+stepCounter+" steps");
					}
				}
//				System.out.println("[Discovery = \"" + words[1] + "\",        Discoverer = \"" + words[2]
//	                        + "\",      Country = \"" + words[3] + "\"]");
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		} finally 
		{
			if (reader != null) 
			{
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
