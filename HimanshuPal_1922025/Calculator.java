import java.util.*;
public abstract class Calculator 
{
	Calculator(int num1, int num2)
	{
		int n1,n2;
	}
	abstract void powerInt(int n1, int n2);
	abstract void divInt(int n1, int n2);
}
abstract class CalPower extends Calculator
{
	CalPower(int n1, int n2)
	{
		super(2);
		super(4);
	}
	void powerInt(int n1, int n2)
	{
		for(int i=n1;i<=n2;i++)
		{
			i=i*i;
		}
	}
	
}
abstract class CalDiv extends Calculator
{
	CalDiv(int n1, int n2)
	{
		super(2);
		super(2);
	}
	void divInt(int n1, int n2)
	{
		if(n1>n2)
		{
			System.out.println("Division"+n1/n2);
		}
		else
		{
			System.out.println("Division"+n2/n1);
		}
	}
}
 class Test
{
	public static void main(String[] args) 
	{
	CalPower obj=new CalPower();
	obj.powerInt(2, 4);
	CalDiv obj1=new CalDiv();
	obj1.divInt(12, 3);
	}
}