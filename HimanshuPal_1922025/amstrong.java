/*371 = (3*3*3)+(7*7*7)+(1*1*1)  
where:  
(3*3*3)=27  
(7*7*7)=343  
(1*1*1)=1  
So:  
27+343+1=371 */
  
import java.io.*;
public class amstrong {

	public static void main(String[] args)throws Exception {
		
		PrintWriter out=new PrintWriter(new FileWriter("fileone.txt"));
		PrintWriter out1=new PrintWriter(new FileWriter("filetwo.txt"));
		for(int i=100;i<=550;i++)
		{
			
			out.println(i);
			out.flush();
		}
		BufferedReader br=new BufferedReader(new FileReader("fileone.txt"));
		String line=br.readLine();
		
		int i=0;
		int t=0;
		
		while(line!=null)
		{
			t=Integer.parseInt(line);
			i=fun(t);
			line=br.readLine();
                        if(i==0)
                        continue;			
			out1.println(i);
			System.out.println(i);
                        
		}out1.flush();
	}
	
	static int fun(int t)
	{
		int i=0;
		i=t;
		int sum=0;
		int r=0;
		while(i!=0)
		{
			r=i%10;
			sum=sum+(r*r*r);
			i/=10;
			
		}
                if(t==sum)
                {
		return sum;
                }
                else
                {
                return 0;
                 }
          
	}

}
