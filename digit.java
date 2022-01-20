//Karanveer
import java.util.*;
class digit
{
public static void main(String[] args) 
{
int num,r;
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
num=sc.nextInt();
r=num%10;
while(num>10)
{
num=num/10;
}
System.out.println(num+" is first digit "+r+" is last digit");
}
}