class evenodd{
int a=66;
public static void main(String[] args)
{
evenodd eo = new evenodd();
eo.check();
}
public void check(){
if(a%5==0)
{
System.out.println("Divided by 5 Numbers");
}
else if (a%11==0)
{
System.out.println("Divided by 11 Numbers");
}
else
{
System.out.println("Not Dividable");
}
}
}
