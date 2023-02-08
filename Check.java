import java.io.*;
class Check{
int a=-5;
public static void main(String[] args){
Check num = new Check();
num.get();
num.PN();
}
int get(){
System.out.println("Enter the Values :"+a);
return a;
}
void PN()
{
if(a>=0)
{
System.out.println("Positive Number");
}
else{
System.out.println("Negative Number");
}
}
}
