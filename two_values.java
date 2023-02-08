class two_values{
int a=44;
int b=45; 
int c=46;
public static void main(String[] args)
{
two_values two = new two_values();
two.max();
}
void max(){
if(a>=b)
{
System.out.println("A is high :"+a);
}
else if(b>=c)
{
System.out.println("B is high :"+b);
}
else {
System.out.println("C is high :"+c);
}
}
}
}

