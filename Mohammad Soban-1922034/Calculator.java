abstract Calculator
{
public static final
 public abstract void powerInt(int num1,int num2);
public abstract void divInt(int num1,int num2);
}
class A implements Calculator
{
public void powerInt(int num1,int num2)
{
num1=2;
num2=4;
long result=1;
while(num2!=0)
{
result *=num1;
--num2;
}
System.out.println("Power of no. is ="+ result);
}
public void divInt(int num1,int num2)
{
System.out.println("divInt method");
}
}
class B
{
public static void main(String[]args)
{
A obj=new A();
obj.powerInt(2,4);
obj.divInt();
}
}




