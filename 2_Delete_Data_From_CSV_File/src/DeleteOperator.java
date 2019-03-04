import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DeleteOperator 
{
	void deleteBySplit(String str) 
	{
		BufferedReader reader = null;
		try 
		{
			reader = new BufferedReader(new FileReader("D:\\Academic\\3-1\\Coding Assignment\\Database\\2_Delete_Data_From_CSV_File\\src\\Data.csv"));

			BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Academic\\3-1\\Coding Assignment\\Database\\2_Delete_Data_From_CSV_File\\src\\OutputData.csv"));
			
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
						continue;
					}
					//line = "The word \""+str+"\" is found in line no.:- "+lineNumber+" by passing:- "+stepCounter+" steps";
					
					writer.write(words[i]);
					writer.write(", ");
				}
				writer.write("\n");
			}
			
			writer.close();
			
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
