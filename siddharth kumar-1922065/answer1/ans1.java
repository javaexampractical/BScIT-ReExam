import java .io.*;
public class Test
{
	public static void main(String[] args) throws IOException 
	{
			PrintWriter out=new PrintWriter("two.txt");
			PrintWriter pw =new PrintWriter(new FileWriter("one.txt"));
			
			for(int i=100;i<150;i++)
			{
				
				pw.println(i);
				pw.flush();
			}
			System.out.println("The number is inputed.");
			BufferedReader br=new BufferedReader(new FileReader("one.txt"));
			String line= br.readLine();
			out.println("reverse");
			while(line!=null)
			{
				String rev=new StringBuilder(line).reverse().toString();
				out.println(rev);
				out.flush();
			  	line=br.readLine();
			}
			System.out.println("Reverse is done");

			pw.close();
			out.close();
	}
}